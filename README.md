# Spring demo

Sample Java/Maven project based on spring boot with configured dependencies.

# Technologies

* Jdk >11
* Maven 3
* Spring boot 2.2.4
* Lombok
* Logback
* Netflix eureka
* Feign client
* Swagger openapi & swagger-ui
* Tomcat

# Deploy

All components are configured to be build as "war" packages that can be deployed
on a servlet container like tomcat. Maven plugin can be used for deploy:

```
tomcat7:redeploy
```


