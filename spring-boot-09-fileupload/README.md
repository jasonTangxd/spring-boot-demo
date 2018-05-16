（1）新建maven java project；
（2）在pom.xml加入相应依赖；
	<!-- thmleaf模板依赖. -->
	<dependency>
		<groupId>org.springframework.boot</groupId>
		<artifactId>spring-boot-starter-thymeleaf</artifactId>
	</dependency>
	<!-- 编译版本; -->
	<plugin>
		<artifactId>maven-compiler-plugin</artifactId>
		<configuration>
			<source>1.8</source>
			<target>1.8</target>
		</configuration>
	</plugin>
	
（3）新建一个表单页面（这里使用thymleaf）;
在src/main/resouces新建templates(templates是spring boot存放模板文件的路径)，在templates下新建一个file.html:

（4）编写controller;
	/**
	 * 文件上传具体实现方法;
	 * 
	 * @param file
	 * @return
	 */
	@RequestMapping("/upload")
	@ResponseBody
	public String handleFileUpload(@RequestParam("file") MultipartFile file) {
		if (!file.isEmpty()) {
			try {
				/*
				 * 1、文件路径； 2、文件名； 3、文件格式; 4、文件大小的限制;
				 */
				BufferedOutputStream out = new BufferedOutputStream(
						new FileOutputStream(new File(
								file.getOriginalFilename())));
				out.write(file.getBytes());
				out.flush();
				out.close();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
				return "上传失败," + e.getMessage();
			} catch (IOException e) {
				e.printStackTrace();
				return "上传失败," + e.getMessage();
			}
			return "上传成功";
		} else {
			return "上传失败，因为文件是空的.";
		}
	}
	
（5）测试；访问路径为：http://127.0.0.1:8080/file

（6）对上传的文件做一些限制；对文件做一些限制是有必要的，在App.java进行编码配置：
	@Bean
	public MultipartConfigElement multipartConfigElement() {
		MultipartConfigFactory factory = new MultipartConfigFactory();
		//// 设置文件大小限制,超了，页面会抛出异常信息，这时候就需要进行异常信息的处理了;
		factory.setMaxFileSize("128KB"); //KB,MB
		/// 设置总上传数据总大小
		factory.setMaxRequestSize("256KB");
		//Sets the directory location where files will be stored.
		//factory.setLocation("路径地址");
		return factory.createMultipartConfig();
	}
	
（7）多文件上传实现
	/**
	 * 多文件具体上传时间，主要是使用了MultipartHttpServletRequest和MultipartFile
	 * 
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/batch/upload", method = RequestMethod.POST)
	public @ResponseBody String handleFileUpload(HttpServletRequest request) {
		List<MultipartFile> files = ((MultipartHttpServletRequest) request).getFiles("file");
		MultipartFile file = null;
		BufferedOutputStream stream = null;
		for (int i = 0; i < files.size(); ++i) {
			file = files.get(i);
			if (!file.isEmpty()) {
				try {
					byte[] bytes = file.getBytes();
					stream = new BufferedOutputStream(new FileOutputStream(
							new File(file.getOriginalFilename())));
					stream.write(bytes);
					stream.close();
				} catch (Exception e) {
					stream = null;
					return "You failed to upload " + i + " => "
							+ e.getMessage();
				}
			} else {
				return "You failed to upload " + i + " because the file was empty.";
			}
		}
		return "upload successful";
	}
	
	(8)测试  http://127.0.0.1:8080/mutifile