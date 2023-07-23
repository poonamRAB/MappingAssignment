package com.geekster.MappingPractice.controller;

import com.geekster.MappingPractice.model.Student;
import com.geekster.MappingPractice.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentsController {
    @Autowired
    StudentService studentService;

    @PostMapping("student")
    public String addStudent(@RequestBody Student student){
        return studentService.addStudent(student);
    }

    @GetMapping("student")
    public List<Student> getAllStudents(){
        return studentService.getAllStudents();
    }

    @GetMapping("student/{id}")
    public Student getStudentById(@RequestBody Student student, @PathVariable String id){
        return studentService.getStudentById(student,id);
    }

    @PutMapping("student/{id}")
    public String updateStudent(@PathVariable String id,@RequestBody Student student){
        return studentService.updateStudent(id,student);
    }

    @DeleteMapping("student/{id}")
    public String deleteStudent(@PathVariable String id){
        return studentService.deleteStudent(id);
    }
}
