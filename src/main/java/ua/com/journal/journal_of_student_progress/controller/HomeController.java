package ua.com.journal.journal_of_student_progress.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String getPageHome(Model model){
        model.addAttribute("hello", "hello world");

        return "home";
    }
}
