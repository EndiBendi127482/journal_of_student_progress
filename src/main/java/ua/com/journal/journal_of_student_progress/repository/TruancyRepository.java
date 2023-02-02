package ua.com.journal.journal_of_student_progress.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.com.journal.journal_of_student_progress.entity.Truancy;

@Repository
public interface TruancyRepository extends JpaRepository<Truancy, Long> {}
