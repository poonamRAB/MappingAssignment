package com.geekster.MappingPractice.repository;

import com.geekster.MappingPractice.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICourseRepo extends JpaRepository<Course,String> {
}
