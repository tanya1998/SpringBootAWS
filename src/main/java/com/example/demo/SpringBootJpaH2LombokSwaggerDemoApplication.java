package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class SpringBootJpaH2LombokSwaggerDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootJpaH2LombokSwaggerDemoApplication.class, args);
	}

}
//localhost:2000/swagger-ui.html