package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.FilterType;

import com.example.config.SpringConfig;
import com.example.model.Student;
import com.example.services.OrderService;
import com.example.services.ProductService;
import com.example.sub1.SpringComponent;

@SpringBootApplication
@EnableAspectJAutoProxy
@ComponentScan(
		basePackages = "com.example",
		excludeFilters = @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE,classes = {OrderService.class,ProductService.class}))
public class SpringbootApplication {

	public static void main(String[] args) {
		//SpringApplication.run(SpringbootApplication.class, args);
		ConfigurableApplicationContext applicationContext =  SpringApplication.run(SpringbootApplication.class, args);
	   // System.out.println(applicationContext.getBean(SpringConfig.class).getSpringComponent().getMessage());
		//System.out.println(applicationContext.getBean(SpringConfig.class).getStudent().getFirstName());
		System.out.println("Spring Boot Started...");
		//applicationContext.close();
	}

}
