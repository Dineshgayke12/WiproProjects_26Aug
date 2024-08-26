package com.dinesh.springbootaop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class BookServiceAspect {

	
	@Before(value="execution(* com.dinesh.springbootaop.service.BookService.*(...)) add args(title,bookId)")
	public void beforeAdvice(JoinPoint joinPoint, String title, String bookId) {
		
		System.out.println("Before method :" + joinPoint.getSignature());
		
		System.out.println("Creating a book " + title +" "+ bookId);
	}
	
	
	@After(value="execution(* com.dinesh.springbootaop.service.BookService.*(...)) add args(title,bookId)")
	public void afterAdvice(JoinPoint joinPoint,String bookId, String title) {
		System.out.println("After method :"+ joinPoint.getSignature());

	}
	
	@AfterReturning(value="execution(* com.dinesh.springbootaop.service.BookService.*(...)) add args(title,bookId)")
	public void afterAdvice(JoinPoint joinPoint,String bookId) {
		System.out.println("After returning method :"+ joinPoint.getSignature());

	}
	
}
