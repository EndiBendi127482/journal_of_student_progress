package ua.com.journal.journal_of_student_progress.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import ua.com.journal.journal_of_student_progress.entity.Course;
import ua.com.journal.journal_of_student_progress.service.CourseService;

import java.util.List;

@Controller
public class CourseController {

    private final CourseService courseService;

    @Autowired
    public CourseController(CourseService courseService) {
        this.courseService = courseService;
    }

    @GetMapping("/course")
    public String getPageCourse(Model model){
        List<Course> courseList = courseService.getAllCourse();
        model.addAttribute("allCourse", courseList);

        return "course";
    }

}
