package pl.timetable.shedule.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pl.timetable.shedule.model.Teacher;

import java.util.List;

@Repository
public interface TeacherRepository extends JpaRepository<Teacher, Long> {
    @Query(value = "SELECT DISTINCT SURNAME FROM TEACHER", nativeQuery = true)
    List<String> findDistinctTeacherName();
}
