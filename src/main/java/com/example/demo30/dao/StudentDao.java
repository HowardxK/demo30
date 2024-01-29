package com.example.demo30.dao;

import com.example.demo30.model.Student;

import java.util.List;

public interface StudentDao {
    void insert(Student student);
    void deleteById(Integer studentId);

    void batch(List<Student> studentList);

    List<Student> getStudents();
    Student getById(Integer studentId);
}
