package com.silva.thiago.exemplo.demo.repository;

import java.util.List;

import com.silva.thiago.exemplo.demo.entities.Student;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface StudentRepository extends MongoRepository<Student, String> {

    public List<Student> findByNameLikeIgnoreCase(String name);

}
