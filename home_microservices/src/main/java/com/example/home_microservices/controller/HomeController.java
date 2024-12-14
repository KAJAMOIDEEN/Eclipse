package com.example.home_microservices.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@RestController
public class HomeController {
	
	@Autowired
	private RestTemplate restTemplate;
    
	@GetMapping("/home")
	public String home() {
		String products = restTemplate.getForObject("http://localhost:9099/products", String.class);
		return products;
	}
}
