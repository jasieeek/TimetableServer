package pl.timetable.shedule.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.timetable.shedule.model.Classroom;
import pl.timetable.shedule.model.Teacher;
import pl.timetable.shedule.repository.ClassroomRepository;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class ClassroomController {

    @Autowired
    private ClassroomRepository classroomRepository;

    @GetMapping("/classroom")
    public List<Classroom> getClassrooms() {
        return (List<Classroom>) classroomRepository.findAll();
    }

    @PostMapping("/classroom")
    void addClassroom(@RequestBody Classroom classroom) {
        classroomRepository.save(classroom);
    }

    @GetMapping("/classroom/all")
    public List<Classroom> getAllClassrooms(){
        List<Classroom> tmpClassroomList = new ArrayList<>();
        List<String> tmpList = new ArrayList<>(classroomRepository.findDistinctClassroomName());
        for (int i=0; i<tmpList.size();i++){
            tmpClassroomList.add(new Classroom(tmpList.get(i)));
        }

        return tmpClassroomList;
    }

    @DeleteMapping("/classroom/del/{id}")
    void delClassroom(@PathVariable long id) {
        classroomRepository.deleteById(id);
    }

}
