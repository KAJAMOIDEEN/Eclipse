package com.example.services;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Service;

@Service
public class ProductService implements InitializingBean,DisposableBean{
	
	ProductService(){
		System.out.println("Product Service..");
	}

	@Override
	//PostConstruct
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Bean Created...");
	}
	
	@Override
	//PreDestroy
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Bean Destroyed");
	}

}
