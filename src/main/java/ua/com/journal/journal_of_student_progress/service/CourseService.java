package ua.com.journal.journal_of_student_progress.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.com.journal.journal_of_student_progress.entity.Course;
import ua.com.journal.journal_of_student_progress.repository.CourseRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class CourseService {

    private final CourseRepository courseRepository;

@Autowired
    public CourseService(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    public List<Course> getAllCourse(){
//    List<Course> courses = new ArrayList<>();
//    courses = courseRepository.findAll();
//    return courses;

    return courseRepository.findAll();
    }
}
