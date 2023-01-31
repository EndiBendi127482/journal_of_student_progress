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
@Table(name = "discipline")
public class Discipline {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Long numberOfHours;
    @OneToMany(mappedBy = "discipline")
    private List<StudentHasDisciplines> studentHasDisciplinesList;
    @OneToMany(mappedBy = "disciplines")
    private List<CoursesHasDisciplines> coursesHasDisciplinesList;
}
