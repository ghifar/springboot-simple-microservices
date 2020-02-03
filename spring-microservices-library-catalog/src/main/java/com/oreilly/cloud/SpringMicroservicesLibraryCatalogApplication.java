package com.oreilly.cloud;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableEurekaClient
public class SpringMicroservicesLibraryCatalogApplication {

	@Value("${catalog.size}")
	private int size;
//	private int size = Book.getBooks().size();

	@RequestMapping("/catalog")
	@CrossOrigin
	public List<Book> getCatalog() {
		return Book.getBooks().subList(0, size);
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringMicroservicesLibraryCatalogApplication.class, args);
	}
}
