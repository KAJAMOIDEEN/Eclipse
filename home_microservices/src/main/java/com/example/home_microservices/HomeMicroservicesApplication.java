package com.example.home_microservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HomeMicroservicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(HomeMicroservicesApplication.class, args);
		System.out.println("Home Service Started...");
	}

}
