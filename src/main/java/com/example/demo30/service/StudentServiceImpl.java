package com.example.demo30.service;

import com.example.demo30.model.Student;
import com.example.demo30.dao.StudentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentDao studentDao;
    @Override
    public Student getById(Integer studentId) {
        return studentDao.getById(studentId);
    }
}
