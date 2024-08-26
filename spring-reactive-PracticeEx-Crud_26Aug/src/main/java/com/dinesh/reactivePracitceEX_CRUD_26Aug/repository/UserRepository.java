package com.dinesh.reactivePracitceEX_CRUD_26Aug.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.dinesh.reactivePracitceEX_CRUD_26Aug.model.User;

import reactor.core.publisher.Mono;

public interface UserRepository extends ReactiveMongoRepository<User, String> {

	
	 Mono<User> findByEmail(String email);
}
