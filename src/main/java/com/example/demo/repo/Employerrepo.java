package com.example.demo.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo.Entity.Employer;

public interface Employerrepo extends MongoRepository<Employer, Integer>{

}
