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
@Table(name = "grupi")
public class Group {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long number;
    private Long numberOfStudents;
    @OneToMany(mappedBy = "group")
    private List<Student> studentList;
    @ManyToOne
    @JoinColumn(name = "courses_id")
    private Course courses;

}
