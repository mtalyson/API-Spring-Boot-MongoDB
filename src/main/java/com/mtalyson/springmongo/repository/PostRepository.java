package com.mtalyson.springmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.mtalyson.springmongo.domain.Post;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {
	
}