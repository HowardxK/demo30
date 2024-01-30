package com.example.demo30;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class StudentController {
    @Autowired
    private StudentRepository studentRepository;

    @PostMapping("/students")
    public String insert(@RequestBody Student student) {
        studentRepository.save(student);

        return "執行資料庫的 create 操作";
    }

    @PutMapping("/students/{studentId}")
    public String update(@PathVariable Integer studentId,
                         @RequestBody Student student) {
        Student s = studentRepository.findById(studentId).orElse(null);

        if (s != null) {
            s.setName(student.getName());
            studentRepository.save(student);

            return "執行資料庫的 update 操作";
        } else {
            return "not found";
        }
    }

    @DeleteMapping("/students/{studentId}")
    public String delete(@PathVariable Integer studentId) {
        studentRepository.deleteById(studentId);
        return "執行資料庫的 delete 操作";
    }

    @GetMapping("/students/{studentId}")
    public Student read(@PathVariable Integer studentId) {
        return studentRepository.findById(studentId).orElse(null);
    }
}
