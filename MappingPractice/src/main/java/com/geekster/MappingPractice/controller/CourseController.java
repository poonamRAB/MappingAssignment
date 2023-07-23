package com.geekster.MappingPractice.controller;

import com.geekster.MappingPractice.model.Course;
import com.geekster.MappingPractice.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CourseController {
    @Autowired
    CourseService courseService;

    @PostMapping("course")
    public String addCourse(@RequestBody Course course){
        return courseService.addCourse(course);
    }

    @GetMapping("/course")
    public List<Course> getAllCourses(){
        return courseService.getAllCourses();
    }

    @GetMapping("course/{id}")
    public Course getCourseById(@PathVariable String id){
        return courseService.getCourseById(id);
    }

    @PutMapping("course/{id}")
    public String updateCourse(@RequestBody Course course, @PathVariable String id){
        return courseService.updateCourse(course,id);
    }

    @DeleteMapping("course/{id}")
    public String deleteCourse(@PathVariable String id){
        return courseService.deleteCourse(id);
    }
}
