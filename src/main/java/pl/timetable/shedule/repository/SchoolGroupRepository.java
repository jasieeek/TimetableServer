package pl.timetable.shedule.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.timetable.shedule.model.SchoolGroup;

@Repository
public interface SchoolGroupRepository extends JpaRepository<SchoolGroup, Long> {
}
