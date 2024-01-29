package com.example.demo30.service;

import com.example.demo30.model.Student;

public interface StudentService {
    void insert(Student student);
    Student getById(Integer studentId);
}
