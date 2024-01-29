package com.example.demo30.dao;

import com.example.demo30.model.Student;

import java.util.List;

public interface StudentDao {
    void insert(Student studnet);
    void deleteById(Integer studentId);

    List<Student> getStudents();
    Student getById(Integer studentId);
}
