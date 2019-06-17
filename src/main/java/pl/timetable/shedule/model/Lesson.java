package pl.timetable.shedule.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.DayOfWeek;

@Entity
@Data
@NoArgsConstructor
public class Lesson {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    private String teacherName;
    private String classroomNumber;
    @Column(name="CLASS_NAME")
    private String className;
    private DayOfWeek dayOfWeek;
    private Integer sequence;


    public Lesson(String name, String teacherName, String classroomNumber) {
        this.name = name;
        this.teacherName = teacherName;
        this.classroomNumber = classroomNumber;
    }

}
