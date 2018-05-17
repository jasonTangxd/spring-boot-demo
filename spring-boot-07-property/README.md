

- 23 有在项目服务启动的时候就去加载一些数据或做一些事情这样的需求
    1. 创建实现接口 com.kfit.runner.CommandLineRunner 的类
    
    
- 24 t环境变量读取和属性对象的绑定
    1. 凡是被Spring管理的类，实现接口 EnvironmentAware 重写方法 setEnvironment 可以在工程启动时，获取到系
统环境变量和application配置文件中的变量。
    
    
- 25 使用自定义的properties
    spring boot使用application.properties默认了很多配置。但需要自己添加一些配置的时候，我们应该怎么做呢。
    若继续在application.properties中添加
    wisely2.name=wyf2
    wisely2.gender=male2
    
    若新用新的配置文件
    如我新建一个wisely.properties
    wisely.name=wangyunfei
    wisely.gender=male