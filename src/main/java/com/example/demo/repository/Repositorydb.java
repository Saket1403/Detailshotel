package com.example.demo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Entity.Details;

@Repository
public interface Repositorydb extends MongoRepository<Details , Long> {

}
