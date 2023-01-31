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
@Table(name = "course")
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long number;
    @OneToMany(mappedBy = "courses")
    private List<Group> groupList;
    @OneToMany(mappedBy = "courseSt")
    private List<Student> studentList;
    @OneToMany(mappedBy = "courseCHD")
    private List<CoursesHasDisciplines> coursesHasDisciplinesList;
}
