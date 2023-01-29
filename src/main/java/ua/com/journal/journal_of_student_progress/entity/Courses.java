package ua.com.journal.journal_of_student_progress.entity;

import lombok.*;

import java.util.List;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class Courses {
    private Long id;
    private Long number;
    private List<Students> studentsList;
    private List<Groups> groupsList;
    private List<CoursesHasDisciplines> coursesHasDisciplinesList;
}
