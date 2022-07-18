package com.example.task.controller;

import com.example.task.model.Student;
import com.example.task.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class StudentController {

    @Autowired
    private StudentRepository studentRepository;

    @PostMapping("/add-student")
    public Student createStudent(@RequestBody @Valid Student student){
        return studentRepository.save(student);
    }
}
