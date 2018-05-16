一、spring boot起步之Hello World
(1)新建一个Maven Java 工程
(2)在pom.xml文件中添加Spring Boot Maven依赖
(3)编写启动类
(4)运行程序

@SpringBootApplication申明让spring boot自动给程序进行必要的配置，
等价于以默认属性使用@Configuration，@EnableAutoConfiguration和@ComponentScan

@RestController返回json字符串的数据，直接可以编写RESTFul的接口


二、Spring Boot返回json数据
返回JSON之步骤：
(1)编写一个实体类Demo
(2)编写DemoController；
(3)在DemoController加上@RestController和@RequestMapping注解；
(4)测试


三、Spring Boot热部署  springloaded


四、全局异常处理
(1) 在class注解上@ControllerAdvice
(2) 在方法上注解上@ExceptionHandler(value = Exception.class)
