package ua.com.journal.journal_of_student_progress.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.com.journal.journal_of_student_progress.entity.Group;
import ua.com.journal.journal_of_student_progress.repository.GroupRepository;

import java.util.List;

@Service
public class GroupService {
    private final GroupRepository groupRepository;

    @Autowired
    public GroupService(GroupRepository groupRepository) {
        this.groupRepository = groupRepository;
    }

    public List<Group> getAllGroup(){
        return groupRepository.findAll();
    }
}
