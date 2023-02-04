package ua.com.journal.journal_of_student_progress.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import ua.com.journal.journal_of_student_progress.entity.Truancy;
import ua.com.journal.journal_of_student_progress.service.TruancyService;

import java.util.List;

@Controller
public class TruancyController {
    private final TruancyService truancyService;

    @Autowired
    public TruancyController(TruancyService truancyService) {
        this.truancyService = truancyService;
    }

    @GetMapping("/truancy")
    public String getPageTruancy(Model model){
        List<Truancy> truancyList = truancyService.getAllTruancy();
        model.addAttribute("allTruancy", truancyList);

        return "truancy";
    }
}
