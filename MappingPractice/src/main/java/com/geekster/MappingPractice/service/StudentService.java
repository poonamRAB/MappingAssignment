package com.geekster.MappingPractice.service;

import com.geekster.MappingPractice.model.Student;
import com.geekster.MappingPractice.repository.IStudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    IStudentRepo studentRepo;

    public String addStudent(Student student) {
        studentRepo.save(student);
        return "new student added successfully!!";
    }

    public List<Student> getAllStudents() {
        return studentRepo.findAll();
    }

    public Student getStudentById(Student student, String id) {
        return studentRepo.findById(id).get();
    }

    public String updateStudent(String id, Student student) {
        studentRepo.save(student);
        return "student updated successfully!!";

    }

    public String deleteStudent(String id) {
        studentRepo.deleteById(id);
        return "student deleted successfully!!";
    }
}
