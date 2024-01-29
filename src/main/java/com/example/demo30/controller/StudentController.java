package com.example.demo30.controller;

import com.example.demo30.model.Student;
import com.example.demo30.mapper.StudentRowMapper;
import com.example.demo30.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping("/students")
    public String insert(@RequestBody Student student) {
        studentService.insert(student);

        return "執行 INSERT sql";
    }

    @PostMapping("/students/batch")
    public String insertList(@RequestBody List<Student> studentList) {

        return "執行一批 INSERT sql";
    }

    @DeleteMapping("/students/{studentId}")
    public String delete(@PathVariable Integer studentId) {
        studentService.deleteById(studentId);

        return "執行 DELETE sql";
    }

    @GetMapping("/students")
    public List<Student> select() {
        return studentService.getStudents();
    }

    @GetMapping("/students/{studentId}")
    public Student selectById(@PathVariable Integer studentId) {
        return studentService.getById(studentId);
    }
}
