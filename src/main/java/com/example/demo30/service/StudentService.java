package com.example.demo30.service;

import com.example.demo30.model.Student;

import java.util.List;

public interface StudentService {
    void insert(Student student);

    void deleteById(Integer studentId);

    List<Student> getStudents();
    Student getById(Integer studentId);
}
