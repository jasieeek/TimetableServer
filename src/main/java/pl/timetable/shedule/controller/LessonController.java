package pl.timetable.shedule.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.timetable.shedule.model.SchoolGroup;
import pl.timetable.shedule.model.Lesson;
import pl.timetable.shedule.repository.LessonRepository;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class LessonController {

    private String className;

    @Autowired
    private LessonRepository lessonRepository;

    @GetMapping("/timetable")
    public List<Lesson> getTimetable() {
        return (List<Lesson>) lessonRepository.findAll();
    }

    @PostMapping("/timetable")
    void addLesson(@RequestBody Lesson lesson) {
        lessonRepository.save(lesson);
    }

    @GetMapping("/")
    public List<SchoolGroup> getAllClasses() {
        List<SchoolGroup> tmpClassList = new ArrayList<>();
        List<String> tmpList = new ArrayList<>(lessonRepository.findDistinctClassName());
        for (int i = 0; i < tmpList.size(); i++) {
            tmpClassList.add(new SchoolGroup(tmpList.get(i)));
        }
        return tmpClassList;
    }

    @DeleteMapping("/timetable/del/{id}")
    void delLesson(@PathVariable long id) {
        lessonRepository.deleteById(id);
    }

    @GetMapping("/timetable/classname/{name}")
    public List<Lesson> getIndicatedClassLessons(@PathVariable("name") String name){
        return lessonRepository.findLessonByClassName(name);
    }

    @GetMapping("/timetable/teacher/{name}-{surname}")
    public List<Lesson> getIndicatedTeacherLessons(@PathVariable("name") String name, @PathVariable("surname") String surname){
        return lessonRepository.findLessonByTeacherName(name + " " + surname);
    }

    @GetMapping("/timetable/classroom/{name}")
    public List<Lesson> getIndicatedClassroomLessons(@PathVariable("name") String name){
        return lessonRepository.findLessonByClassroomName(name);
    }

}
