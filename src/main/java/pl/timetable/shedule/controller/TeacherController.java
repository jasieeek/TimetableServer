package pl.timetable.shedule.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.timetable.shedule.model.Class;
import pl.timetable.shedule.model.Lesson;
import pl.timetable.shedule.model.Teacher;
import pl.timetable.shedule.repository.TeacherRepository;

import java.util.ArrayList;
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

//    @GetMapping("/teacher/all")
//    public List<Teacher> getAllTeachers(){
//        List<Teacher> tmpTeacherList = new ArrayList<>();
//        List<String> tmpList = new ArrayList<>(teacherRepository.findDistinctTeacherName());
//        for (int i=0; i<tmpList.size();i++){
//            tmpTeacherList.add(new Teacher(tmpList.get(i)));
//        }
//
//        return tmpTeacherList;
//    }


}
