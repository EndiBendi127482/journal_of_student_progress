package ua.com.journal.journal_of_student_progress.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import ua.com.journal.journal_of_student_progress.entity.Group;
import ua.com.journal.journal_of_student_progress.service.GroupService;

import java.util.List;

@Controller
public class GroupController {
    private final GroupService groupService;

    @Autowired
    public GroupController(GroupService groupService) {
        this.groupService = groupService;
    }

    @GetMapping("/group")
    public String getPageGroup(Model model){
        List<Group> groupList = groupService.getAllGroup();
        model.addAttribute("allGroup", groupList);

        return "group";
    }
}
