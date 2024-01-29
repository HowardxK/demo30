package com.example.demo30.dao;

import com.example.demo30.model.Student;

public interface StudentDao {
    void insert(Student studnet);
    void deleteById(Integer studentId);
    Student getById(Integer studentId);
}
