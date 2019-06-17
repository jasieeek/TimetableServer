package pl.timetable.shedule.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.timetable.shedule.model.Lesson;

import java.util.List;

@Repository
public interface LessonRepository extends CrudRepository<Lesson, Long> {
    @Query(value = "SELECT DISTINCT CLASS_NAME FROM LESSON", nativeQuery = true)
    List<String> findDistinctClassName();

//    List<String> findDistinctByClassName
}
