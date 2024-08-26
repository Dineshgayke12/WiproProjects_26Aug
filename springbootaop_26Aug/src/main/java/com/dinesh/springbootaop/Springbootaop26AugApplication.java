package com.dinesh.springbootaop;

import org.aspectj.lang.JoinPoint;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy(proxyTargetClass=true)
public class Springbootaop26AugApplication {

	public static void main(String[] args) {
		SpringApplication.run(Springbootaop26AugApplication.class, args);
	}

	
	
}
