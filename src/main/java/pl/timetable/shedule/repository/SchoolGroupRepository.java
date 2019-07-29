package pl.timetable.shedule.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pl.timetable.shedule.model.Classroom;
import pl.timetable.shedule.model.SchoolGroup;

import java.util.List;

@Repository
public interface SchoolGroupRepository extends JpaRepository<SchoolGroup, Long> {
    @Query(value = "SELECT * FROM school_group ORDER BY name ASC", nativeQuery = true)
    List<SchoolGroup> findSortedSchoolGroups();
}
