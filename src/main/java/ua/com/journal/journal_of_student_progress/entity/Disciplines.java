package ua.com.journal.journal_of_student_progress.entity;

import lombok.*;

import java.util.List;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class Disciplines {
    private Long id;
    private String name;
    private Long numberOfHours;
    private List<StudentHasDisciplines> studentHasDisciplinesList;
    private List<CoursesHasDisciplines> coursesHasDisciplinesList;
}
