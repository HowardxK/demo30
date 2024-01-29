package com.example.demo30.dao;

import com.example.demo30.model.Student;

public interface StudentDao {
    void insert(Student studnet);
    Student getById(Integer studentId);
}
