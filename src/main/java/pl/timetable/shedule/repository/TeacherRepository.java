package pl.timetable.shedule.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pl.timetable.shedule.model.Classroom;
import pl.timetable.shedule.model.Teacher;

import java.util.List;

@Repository
public interface TeacherRepository extends JpaRepository<Teacher, Long> {
    @Query(value = "SELECT * FROM teacher ORDER BY surname ASC", nativeQuery = true)
    List<Teacher> findSortedTeachers();
}
