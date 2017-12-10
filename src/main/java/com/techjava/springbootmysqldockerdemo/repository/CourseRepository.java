package com.techjava.springbootmysqldockerdemo.repository;

import com.techjava.springbootmysqldockerdemo.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Integer>{
}
