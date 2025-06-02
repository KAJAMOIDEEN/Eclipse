package com.example.config;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.boot.autoconfigure.AutoConfigureBefore;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AopComponent {
    
	@Before("execution(*com.example.*.*(..)")
	public void alert() {
		System.out.println("Simple Controller..");
	}
}
