package com.springrest.springrest.controller;

import com.springrest.springrest.entities.Courses;
import com.springrest.springrest.services.Courses.CoursesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class CoursesController {
    @Autowired
    private CoursesService coursesService;

    //get all courses
    @GetMapping("/courses")
    public List<Courses> getCourses(){
        return this.coursesService.getCourses();
    }

    @GetMapping("/courses/{courseId}")
    public Courses getCourse(@PathVariable String courseId){
        return this.coursesService.getCourse(Long.parseLong(courseId));
    }
    @PostMapping(path="/courses", consumes="application/json")
    public List<Courses> addCourse(@RequestBody Courses course){
        return this.coursesService.addCourse(course);
    }

    @PutMapping("/courses")
    public List<Courses> updateCourse(@RequestBody Courses course){
        return this.coursesService.updateCourse(course);
    }

    @DeleteMapping("/courses/{courseId}")
    public List<Courses> deleteCourse(@PathVariable String courseId){
        return this.coursesService.deleteCourse(Long.parseLong(courseId));
    }

    @GetMapping("/courses/filter/{courseTitle}")
    public List<Courses> filterCourse(@PathVariable String courseTitle){
        return this.coursesService.filterCoursesByTitle(courseTitle);
    }
}
