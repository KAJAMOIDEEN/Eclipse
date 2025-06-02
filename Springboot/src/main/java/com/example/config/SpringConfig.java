package com.example.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.context.annotation.Profile;
import org.springframework.web.client.RestTemplate;

import com.example.model.Student;
import com.example.services.OrderService;
import com.example.sub1.SpringComponent;

@Configuration
public class SpringConfig {

	@Bean
	public RestTemplate getRestTemplate() {
		RestTemplate restTemplate = new RestTemplate();
		return restTemplate;
	}
    
	@Bean
	public SpringComponent getSpringComponent() {
		SpringComponent springComponent = new SpringComponent();
		return springComponent;
	}
	
	@Bean
	public Student getStudent() {
		return new Student("java","spring");
	}

}
