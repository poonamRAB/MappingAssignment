package com.geekster.MappingPractice.service;

import com.geekster.MappingPractice.model.Course;
import com.geekster.MappingPractice.repository.ICourseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {
    @Autowired
    ICourseRepo courseRepo;

    public String addCourse(Course course) {
        courseRepo.save(course);
        return "course added successfully!!";
    }

    public List<Course> getAllCourses() {
        return courseRepo.findAll();
    }

    public Course getCourseById(String id) {
        return courseRepo.findById(id).get();
    }

    public String updateCourse(Course course, String id) {
        courseRepo.save(course);
        return "course updated successfully!!";
    }

    public String deleteCourse(String id) {
        courseRepo.deleteById(id);
        return "course deleted successfully!!";
    }
}
