# springcloud
Eureka 服务访问地址：[http://localhost:8761/](http://localhost:8761/)

clent 服务提供者访问地址：[http://localhost:8762/hi?name=aaa](http://localhost:8762/hi?name=aaa)
client 可以通过修改服务启动端口号(server.port=8763),启动多个实例  

ribbon 服务提消费者访问地址：[http://localhost:8764/hi?name=aaa](http://localhost:8764hi?name=aaa)

feign 服务提消费者访问地址：[http://localhost:8765/hi?name=aaa](http://localhost:8765/hi?name=aaa)

启动zipkin
java -jar zipkin-server-2.9.4-exec.jar
访问地址：[http://localhost:9411/zipkin/](http://localhost:9411/zipkin/)

Hystrix Dashboard组件 启动 service-ribbon
访问地址：[http://localhost:8764/actuator/hystrix.stream](http://localhost:8764/actuator/hystrix.stream)
访问地址：[http://localhost:8764/actuator](http://localhost:8764/actuator)
访问地址：[http://localhost:8764/hystrix](http://localhost:8764/hystrix)