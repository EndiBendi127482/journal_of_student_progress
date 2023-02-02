package ua.com.journal.journal_of_student_progress.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CoursesHasDisciplines extends JpaRepository<ua.com.journal.journal_of_student_progress.entity.CoursesHasDisciplines, Long> {}
