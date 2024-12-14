package com.example.product_microservices.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ProductController {
	
    
	@GetMapping("/products")
	public String products() {
		return "Products Page";
	}
}
