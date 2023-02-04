package ua.com.journal.journal_of_student_progress.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.com.journal.journal_of_student_progress.entity.Truancy;
import ua.com.journal.journal_of_student_progress.repository.TruancyRepository;

import java.util.List;

@Service
public class TruancyService {
    private final TruancyRepository truancyRepository;

    @Autowired
    public TruancyService(TruancyRepository truancyRepository) {
        this.truancyRepository = truancyRepository;
    }

    public List<Truancy> getAllTruancy(){
        return truancyRepository.findAll();
    }
}
