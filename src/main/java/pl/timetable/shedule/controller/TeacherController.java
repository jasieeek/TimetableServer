package pl.timetable.shedule.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.timetable.shedule.model.Teacher;
import pl.timetable.shedule.repository.TeacherRepository;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class TeacherController {

    @Autowired
    private TeacherRepository teacherRepository;

    @GetMapping("/teacher")
    public List<Teacher> getTeachers() {
        return (List<Teacher>) teacherRepository.findAll();
    }

    @PostMapping("/teacher")
    void addTeacher(@RequestBody Teacher teacher) {
        teacherRepository.save(teacher);
    }

    @DeleteMapping("/teacher/del/{id}")
    void delTeacher(@PathVariable long id) {
        teacherRepository.deleteById(id);
    }
}
