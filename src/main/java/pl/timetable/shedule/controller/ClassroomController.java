package pl.timetable.shedule.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.timetable.shedule.model.Classroom;
import pl.timetable.shedule.model.Teacher;
import pl.timetable.shedule.repository.ClassroomRepository;

import javax.persistence.EntityNotFoundException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class ClassroomController {

    @Autowired
    private ClassroomRepository classroomRepository;

    @GetMapping("/classroom")
    public List<Classroom> getClassrooms() {
        return (List<Classroom>) classroomRepository.findAll();
    }

    @GetMapping("/classroom/sorted")
    public List<Classroom> getSortedClassrooms() {
        return (List<Classroom>) classroomRepository.findSortedClassrooms();
    }

    @PostMapping("/classroom")
    void addClassroom(@RequestBody Classroom classroom) {
        Classroom tmpClassroom = classroomRepository.findClassroomByName(classroom.getName());
        if(tmpClassroom == null)
            classroomRepository.save(classroom);
        else
            throw new EntityNotFoundException("Resource not found!!!");
    }

    @PutMapping("/classroom/{id}")
    public Classroom replaceClassroom(@RequestBody Classroom newClassroom, @PathVariable Long id) {
        return classroomRepository.findById(id)
                .map(classroom -> {
                    classroom.setName(newClassroom.getName());
                    return classroomRepository.save(classroom);
                })
                .orElseGet(() -> {
                    newClassroom.setId(id);
                    return classroomRepository.save(newClassroom);
                });
    }


    @GetMapping("/classroom/all")
    public List<Classroom> getAllClassrooms(){
        List<Classroom> tmpClassroomList = new ArrayList<>();
        List<String> tmpList = new ArrayList<>(classroomRepository.findDistinctClassroomName());
        for (String s: tmpList) {
            tmpClassroomList.add(new Classroom(s));
        }
        return tmpClassroomList;
    }

    @DeleteMapping("/classroom/del/{id}")
    void delClassroom(@PathVariable long id) {
        classroomRepository.deleteById(id);
    }
}
