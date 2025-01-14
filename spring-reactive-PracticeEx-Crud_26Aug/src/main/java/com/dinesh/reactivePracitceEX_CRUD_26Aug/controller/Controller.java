package com.dinesh.reactivePracitceEX_CRUD_26Aug.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dinesh.reactivePracitceEX_CRUD_26Aug.model.User;
import com.dinesh.reactivePracitceEX_CRUD_26Aug.service.UserService;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/users")
public class Controller {
	
	 @Autowired
	    private UserService userService;

	    @GetMapping
	    public Flux<User> getAllUsers() {
	        return userService.getAllUsers();
	    }

	    @GetMapping("/{id}")
	    public Mono<User> getUserById(@PathVariable String id) {
	        return userService.getUserById(id);
	    }

	    @PostMapping
	    public Mono<User> createUser(@RequestBody User user) {
	        return userService.createUser(user);
	    }

	    @PutMapping("/{id}")
	    public Mono<User> updateUser(@PathVariable String id, @RequestBody User user) {
	        return userService.updateUser(id, user);
	    }

	    @DeleteMapping("/{id}")
	    public Mono<Void> deleteUser(@PathVariable String id) {
	        return userService.deleteUser(id);
	    }

}
