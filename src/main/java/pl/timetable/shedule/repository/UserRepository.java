package pl.timetable.shedule.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.timetable.shedule.model.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
}
