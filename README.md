
# Simple Microservices Using Springboot

simple example how to user spring cloud.

## Stacks
1. spring cloud
2. netflix (eureka, zuul, hystrix)


## how to run

> **1.** (simple-microservice-config-server folder) change application.properties value
```bash
spring.cloud.config.server.git.uri={to config-repo folder directory}
```
> **2.** run all services

```bash
$ mvn springboot:run
```

> **3.** access-url

```bash
http://localhost:8080/home.html
```


# Explanation

> **1.** Configuration services

simple-microservice-config-server = for spring cloud config server

simple-microservice-library-registry= for eureka server

simple-microservice-library-edge= for zuul api gateway that help to routes to all services

> **2.** Other than above services, it's just a simple services
