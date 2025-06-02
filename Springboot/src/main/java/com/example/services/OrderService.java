package com.example.services;


import org.springframework.stereotype.Service;

@Service
public class OrderService {
	
    
	OrderService(ProductService productService){
		System.out.println("Order Service");
	}

}
