package ua.com.journal.journal_of_student_progress.entity;

import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class StudentHasDisciplines {
    private Long id;
    private Students students;
    private Disciplines disciplines;
}
