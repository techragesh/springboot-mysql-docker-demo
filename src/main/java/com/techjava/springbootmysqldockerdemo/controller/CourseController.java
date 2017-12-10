package com.techjava.springbootmysqldockerdemo.controller;

import com.techjava.springbootmysqldockerdemo.model.Course;
import com.techjava.springbootmysqldockerdemo.service.CourseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/courses")
public class CourseController {

    @Autowired
    private CourseServiceImpl courseService;

    @GetMapping("/all")
    public List<Course> courseList(){
        return courseService.courseList();
    }

    @GetMapping("/{courseId}")
    public Course getCourseById(@PathVariable Integer courseId){
        return courseService.getCourseById(courseId);
    }

    @PostMapping("/create")
    public Course createCourse(@RequestBody Course course){
        return courseService.createCourse(course);
    }

}
