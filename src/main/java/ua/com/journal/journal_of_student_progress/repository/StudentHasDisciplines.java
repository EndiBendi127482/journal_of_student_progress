package ua.com.journal.journal_of_student_progress.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentHasDisciplines extends JpaRepository<ua.com.journal.journal_of_student_progress.entity.StudentHasDisciplines, Long> {}
