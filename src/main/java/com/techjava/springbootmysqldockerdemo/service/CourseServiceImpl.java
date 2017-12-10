package com.techjava.springbootmysqldockerdemo.service;

import com.techjava.springbootmysqldockerdemo.model.Course;
import com.techjava.springbootmysqldockerdemo.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class CourseServiceImpl {

    @Autowired
    private CourseRepository courseRepository;

    public List<Course> courseList(){
        return courseRepository.findAll();
    }

    public Course getCourseById(Integer courseId){
        return courseRepository.findOne(courseId);
    }

    public Course createCourse(Course course) {
        return courseRepository.save(course);
    }
}
