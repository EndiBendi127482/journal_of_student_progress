package ua.com.journal.journal_of_student_progress.entity;

import jakarta.persistence.*;
import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString

@Entity
@Table(name = "student_has_disciplines")
public class StudentHasDisciplines {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "student_id")
    private Student students;
    @ManyToOne
    @JoinColumn(name = "disciplines_id")
    private Discipline discipline;
}
