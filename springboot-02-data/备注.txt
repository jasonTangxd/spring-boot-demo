四、data大体步骤：
(1)在application.properties中加入datasouce的配置
(2)在pom.xml加入mysql的依赖。
(3)获取DataSouce的Connection进行测试。

五、使用JPA保存数据
(1) 创建实体类Demo,如果已经存在，可以忽略。
(2) 创建jpa repository类操作持久化。
(3) 创建service类。
(4) 创建restful请求类。
(5) 测试

六、使用JdbcTemplate
(1) 在pom.xml加入jdbcTemplate的依赖；
(2) 编写DemoDao类，声明为：@Repository，引入JdbcTemplate
(3) 编写DemoService类，引入DemoDao进行使用
(4) 编写Demo2Controller进行简单测试。