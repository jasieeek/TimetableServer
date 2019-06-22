package pl.timetable.shedule.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pl.timetable.shedule.model.Classroom;

import java.util.List;

@Repository
public interface ClassroomRepository extends JpaRepository<Classroom, Long> {
    @Query(value = "SELECT DISTINCT NAME FROM CLASSROOM", nativeQuery = true)
    List<String> findDistinctClassroomName();
}
