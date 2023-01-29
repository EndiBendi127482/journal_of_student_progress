package ua.com.journal.journal_of_student_progress.entity;

import lombok.*;

import java.util.Date;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class Truancy {
    private Long id;
    private Date date;
    private String reason;
    private Students students;
}
