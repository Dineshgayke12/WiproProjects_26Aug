package com.dinesh.reactivePracitceEX_CRUD_26Aug.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dinesh.reactivePracitceEX_CRUD_26Aug.model.User;
import com.dinesh.reactivePracitceEX_CRUD_26Aug.repository.UserRepository;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class UserService {
	
	  @Autowired
	    private UserRepository userRepository;

	    public Flux<User> getAllUsers() {
	        return userRepository.findAll();
	    }

	    public Mono<User> getUserById(String id) {
	        return userRepository.findById(id);
	    }

	    public Mono<User> createUser(User user) {
	        return userRepository.save(user);
	    }

	    public Mono<User> updateUser(String id, User user) {
	        return userRepository.findById(id)
	                .flatMap(existingUser -> {
	                    existingUser.setFirstname(user.getFirstname());
	                    existingUser.setLastname(user.getLastname());
	                    existingUser.setEmail(user.getEmail());
	                    existingUser.setPassword(user.getPassword());
	                    existingUser.setMobile(user.getMobile());
	                    return userRepository.save(existingUser);
	                });
	    }

	    public Mono<Void> deleteUser(String id) {
	        return userRepository.deleteById(id);
	    }
	

}
