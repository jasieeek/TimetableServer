package pl.timetable.shedule.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pl.timetable.shedule.model.Lesson;

import java.util.List;

@Repository
public interface LessonRepository extends JpaRepository<Lesson, Long> {
    @Query(value = "SELECT DISTINCT CLASS_NAME FROM LESSON", nativeQuery = true)
    List<String> findDistinctClassName();

    List<Lesson> findLessonByClassName(String className);
    List<Lesson> findLessonByTeacherName(String teacherName);
    List<Lesson> findLessonByClassroomName(String classroomName);
}
