package com.example.sub1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;

@Component
@Profile("dev")
public class SpringComponent {
	

	@Value("${username}")
	String username;
	
	
	@Value("${password}")
	String password;
	
	@PostConstruct
	public String getMessage() {
		System.out.println("Username: "+username+" "+"Password: "+password);
		return "Hello Spring";
	}

}
