package com.springrest.springrest.services.Courses;

import com.springrest.springrest.entities.Courses;

import java.util.List;

public interface CoursesService {

    public List<Courses> getCourses();
    public Courses getCourse(long courseId);

    public List<Courses> addCourse(Courses course);
    public List<Courses> updateCourse(Courses course);
    public List<Courses> deleteCourse(long courseId);
    public List<Courses> filterCoursesByTitle(String courseTitle);
}
