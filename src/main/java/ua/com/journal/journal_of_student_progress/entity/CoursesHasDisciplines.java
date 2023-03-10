package ua.com.journal.journal_of_student_progress.entity;

import jakarta.persistence.*;
import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString

@Entity
@Table(name = "courses_has_disciplines")
public class CoursesHasDisciplines {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "courses_id")
    private Course courseCHD;
    @ManyToOne
    @JoinColumn(name = "disciplines_id")
    private Discipline disciplines;
}
