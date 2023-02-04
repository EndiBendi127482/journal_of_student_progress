package ua.com.journal.journal_of_student_progress.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.com.journal.journal_of_student_progress.entity.Discipline;
import ua.com.journal.journal_of_student_progress.repository.DisciplineRepository;

import java.util.List;

@Service
public class DisciplineService {
    private final DisciplineRepository disciplineRepository;

@Autowired
    public DisciplineService(DisciplineRepository disciplineRepository) {
        this.disciplineRepository = disciplineRepository;
    }

    public List<Discipline> getAllDiscipline(){
    return disciplineRepository.findAll();
    }
}
