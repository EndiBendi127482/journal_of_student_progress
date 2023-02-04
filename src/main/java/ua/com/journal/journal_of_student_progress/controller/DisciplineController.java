package ua.com.journal.journal_of_student_progress.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import ua.com.journal.journal_of_student_progress.entity.Discipline;
import ua.com.journal.journal_of_student_progress.service.DisciplineService;

import java.util.List;

@Controller
public class DisciplineController {
    private final DisciplineService disciplineService;

    @Autowired
    public DisciplineController(DisciplineService disciplineService) {
        this.disciplineService = disciplineService;
    }

    @GetMapping("/discipline")
    public String getPageDiscipline(Model model){
        List<Discipline> disciplineList = disciplineService.getAllDiscipline();
        model.addAttribute("allDiscipline", disciplineList);

        return "discipline";
    }
}
