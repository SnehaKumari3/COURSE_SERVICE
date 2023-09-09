package com.springrest.springrest.services.Courses;

import com.springrest.springrest.dao.CourseDao;
import com.springrest.springrest.entities.Courses;
import com.springrest.springrest.services.Courses.CoursesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CoursesServiceImpl implements CoursesService {

//    List<Courses> list;
    @Autowired
    private CourseDao courseDao;

//    public CoursesServiceImpl(){
//        list = new ArrayList<>();
//        list.add(new Courses(1, "RESTAPI", "crating RESTAPI"));
//        list.add(new Courses(2, "RESTAPI-2", "crating RESTAPI-2"));
//    }
    @Override
    public List<Courses> getCourses(){

//        return list;
        return courseDao.findAll();
    }

    @Override
    public Courses getCourse(long courseId){
//        Courses c=null;
//        for (Courses course: list){
//            if(course.getId() == courseId){
//                c=course;
//                return c;
//            }
//        }
//        return c;
        Courses one = courseDao.getOne(courseId);
        return one;
    }
    @Override
    public List<Courses> updateCourse(Courses course){
//        for (Courses c: list){
//            if(c.getId() == course.getId()){
//                c.setTitle(course.getTitle());
//                c.setDescription(course.getDescription());
//                return list;
//            }
//        }
//        return list;
        courseDao.save(course);
        return courseDao.findAll();
    }
    @Override
    public List<Courses> deleteCourse(long courseId){
/*
        for(Courses c : list){
            if(c.getId() == courseId){
                list.remove(c);
                return list;
            }
        }
        return list;
*/
        Courses entity = courseDao.getOne(courseId);
        courseDao.delete(entity);
        return courseDao.findAll();
    }
    @Override
    public List<Courses> addCourse(Courses course){
//        list.add(new Courses(course.getId(), course.getTitle(),course.getDescription()));
//        return list;
        courseDao.save(course);
        return courseDao.findAll();
    }
    @Override
    public List<Courses> filterCoursesByTitle(String courseTitle) {
        List<Courses> courses = courseDao.findAll();

        return courses.stream()
                .filter(course -> course.getTitle().contains(courseTitle))
                .collect(Collectors.toList());
    }

}
