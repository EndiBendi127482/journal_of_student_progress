package ua.com.journal.journal_of_student_progress.entity;

import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class CoursesHasDisciplines {
    private Long id;
    private Courses courses;
    private Disciplines disciplines;
}
