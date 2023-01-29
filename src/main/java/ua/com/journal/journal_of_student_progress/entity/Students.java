package ua.com.journal.journal_of_student_progress.entity;

import lombok.*;

import java.util.List;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class Students {
    private Long id;
    private String last_name;
    private String first_name;
    private String middle_name;
    private Long mark;
    private String lessonType;
    private Courses courses;
    private Groups groups;
    private List<Truancy> truancyList;
    private List<StudentHasDisciplines> studentHasDisciplinesList;
}
