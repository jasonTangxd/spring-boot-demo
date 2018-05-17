

## Spring Boot分布式Session状态保存Redis

在使用spring boot做负载均衡的时候，多个app之间的session要保持一致，这样负载到不同的app时候，在一个
app登录之后，而访问到另外一台服务器的时候，session丢失。
常规的解决方案都是使用：如apache使用mod_jk.conf，使用Memcached进行共享。
在开发spring boot app的时候可以借助 spring session 和redis或者ehcache，用外置的redis或者ehcache来存
储session的状态,这里使用redis进行介绍，ehcache实现是一样的。