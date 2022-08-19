package com.example.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.project.entity.Data;
import com.example.project.repository.MongoJpaRepository;
@RestController

public class Controller {
	private MongoJpaRepository mongoJpaRepository;
	
	@Autowired
	public Controller(MongoJpaRepository mongoJpaRepository) {
		super();
		this.mongoJpaRepository = mongoJpaRepository;
	}


	public Controller() {
		super();
	}


	@GetMapping("/getAll")
	public List<Data> getAll() {
		return this.mongoJpaRepository.findAll();
	}
}
