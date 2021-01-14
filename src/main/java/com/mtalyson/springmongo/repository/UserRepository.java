package com.mtalyson.springmongo.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.mtalyson.springmongo.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

	List<User> findAll();
	
}
