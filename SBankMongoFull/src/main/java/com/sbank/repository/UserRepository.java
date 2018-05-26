package com.sbank.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.sbank.model.User;

public interface UserRepository extends MongoRepository<User, String> {


	}

