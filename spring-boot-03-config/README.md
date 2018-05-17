1、修改banner
第一种方式：修改的时候，进行设置,在Application的main方法中：
@SpringBootApplication
public class org.kfit.service.PublicClassApp {	
	public static void main(String[] args) {
		SpringApplication application = new SpringApplication(org.kfit.service.PublicClassApp.class);
		/*
		* Banner.Mode.OFF:关闭;
		* Banner.Mode.CONSOLE:控制台输出，默认方式;
		* Banner.Mode.LOG:日志输出方式;
		*/
		application.setBannerMode(Banner.Mode.OFF);
		application.run(args);
		//SpringApplication.run(org.kfit.service.PublicClassApp.class, args);
	}
}

第二种方式：修改banner.txt配置文件
在src/main/resouces下新建banner.txt，在文件中加入：
#这个是MANIFEST.MF文件中的版本号
${application.version}
#这个是上面的的版本号前面加v后上括号
${application.formatted-version}
#这个是spring-boot的版本号
${spring-boot.version}
#这个是spring-boot的版本号
${spring-boot.formatted-version}


第三种方式：重写接口Banner实现
SpringBoot提供了一个接口org.springframework.boot.Banner，他的实例可以被传给SpringApplication的setBanner(banner)方法。
可以重写Banner接口的printBanner方法。
@SpringBootApplication
public class PublicClassApp3{
	public static void main(String[] args) {
	   SpringApplication app = new SpringApplication(PublicClassApp3.class);  
	   app.setBanner(new Banner() {  
	        @Override  
	        public void printBanner(Environment environment, Class<?> sourceClass, PrintStream out) {  
	        	out.print("\n\n\tSpring Boot Sample App!\n\n".toUpperCase());  
	        }  
	    });  
	    app.run(args); 
	}
}

第四种方式：在application.properties进行配置
在application.proerpties进行banner的显示和关闭：
#是否显示banner，可选值[true|false]
spring.main.show-banner=false