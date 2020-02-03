package com.example.springmicroservicelibraryregistry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpringMicroserviceLibraryRegistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringMicroserviceLibraryRegistryApplication.class, args);
	}

}
