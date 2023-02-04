package ua.com.journal.journal_of_student_progress.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import ua.com.journal.journal_of_student_progress.entity.Student;
import ua.com.journal.journal_of_student_progress.service.StudentService;

import java.util.List;

@Controller
public class StudentController {
    private final StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/student")
    public String getPageStudent(/*Model model*/){
        //List<Student> studentList = studentService.getAllStudent();
        //model.addAttribute("allStudent", studentList);

        return "student";
    }
}
