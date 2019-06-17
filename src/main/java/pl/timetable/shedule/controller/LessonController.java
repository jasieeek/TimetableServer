package pl.timetable.shedule.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.timetable.shedule.model.Lesson;
import pl.timetable.shedule.repository.LessonRepository;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class LessonController {

    @Autowired
    LessonRepository lessonRepository;

    @GetMapping("/timetable")
    public List<Lesson> getTimetable() {
        return (List<Lesson>) lessonRepository.findAll();
    }

    @PostMapping("/timetable")
    void addLesson(@RequestBody Lesson lesson) {
        lessonRepository.save(lesson);
    }

    @GetMapping("/classes")
    public List<String> getAllClasses(){
        return lessonRepository.findDistinctClassName();
    }
}
