package com.silva.thiago.exemplo.demo.controller;

import java.util.List;

import com.silva.thiago.exemplo.demo.entities.Student;
import com.silva.thiago.exemplo.demo.repository.StudentRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @Autowired
    StudentRepository studentRepository;

    @RequestMapping(value = "/student", method = RequestMethod.GET)
    public List<Student> listStudent() {
        return this.studentRepository.findAll();
    }

    @RequestMapping(value = "/student", method = RequestMethod.POST)
    public Student insertStudent(@RequestBody Student student) {
        return this.studentRepository.save(student);
    }

    @RequestMapping(value = "/student/{id}", method = RequestMethod.GET)
    public Student findById(@PathVariable String id) {
        return this.studentRepository.findById(id).get();
    }

    @RequestMapping(value = "/student/{name}/name", method = RequestMethod.GET)
    public List<Student> findByName(@PathVariable String name) {
        return this.studentRepository.findByNameLikeIgnoreCase(name);
    }

}
