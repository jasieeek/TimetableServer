package pl.timetable.shedule.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.DayOfWeek;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Lesson {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String teacherName;
    private String classroomName;
    @Column(name="CLASS_NAME")
    private String className;
    private DayOfWeek dayOfWeek;
    private Integer sequence;
}
