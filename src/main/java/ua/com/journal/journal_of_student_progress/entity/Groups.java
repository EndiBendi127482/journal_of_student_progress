package ua.com.journal.journal_of_student_progress.entity;

import lombok.*;

import java.util.List;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class Groups {
    private Long id;
    private Long number;
    private Long numberOfStudents;
    private List<Students> studentsList;
    private Courses courses;

}
