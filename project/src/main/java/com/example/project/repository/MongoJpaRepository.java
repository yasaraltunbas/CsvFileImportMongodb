package com.example.project.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.project.entity.Data;

public interface MongoJpaRepository  extends MongoRepository<Data, String>  {

}
