package ua.com.journal.journal_of_student_progress.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString

@Entity
@Table(name = "student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String last_name;
    private String first_name;
    private String middle_name;
    private Long mark;
    private String lessonType;
    @ManyToOne
    @JoinColumn(name = "courses_id")
    private Course courseSt;
    @ManyToOne
    @JoinColumn(name = "group_id")
    private Group group;
    @OneToMany(mappedBy = "student")
    private List<Truancy> truancyList;
    @OneToMany(mappedBy = "students")
    private List<StudentHasDisciplines> studentHasDisciplinesList;
}
