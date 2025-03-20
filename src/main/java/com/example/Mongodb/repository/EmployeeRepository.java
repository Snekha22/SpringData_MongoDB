package com.example.Mongodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.Mongodb.model.Employee;

public interface EmployeeRepository extends MongoRepository<Employee, String> {
}

