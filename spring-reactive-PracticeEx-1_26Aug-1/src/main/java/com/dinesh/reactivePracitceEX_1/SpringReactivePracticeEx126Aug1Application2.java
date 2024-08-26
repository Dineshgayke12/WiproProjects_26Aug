package com.dinesh.reactivePracitceEX_1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@SpringBootApplication
public class SpringReactivePracticeEx126Aug1Application2 {

	public static void main(String[] args) {
		SpringApplication.run(SpringReactivePracticeEx126Aug1Application2.class, args);
		
		 Mono<String> mono = Mono.just("Hello, Mono!");
	        
	        
	        mono.subscribe(System.out::println);

	       
	        String[] fruits = {"Apple", "Banana", "Orange", "Mango"};
	        Flux<String> fruitFlux = Flux.fromArray(fruits);
	        
	        
	        fruitFlux.subscribe(System.out::println);

	      
	        Flux<String> uppercaseFlux = fruitFlux.map(String::toUpperCase);
	        
	        
	        uppercaseFlux.subscribe(fruit -> System.out.println("Uppercase: " + fruit));
	    }
	}
	
	


