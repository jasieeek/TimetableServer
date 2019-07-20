package pl.timetable.shedule.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.timetable.shedule.model.SchoolGroup;
import pl.timetable.shedule.repository.SchoolGroupRepository;


import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class SchoolGroupController {

    @Autowired
    private SchoolGroupRepository schoolGroupRepository;

    @GetMapping("/group")
    public List<SchoolGroup> getGroups() {
        return (List<SchoolGroup>) schoolGroupRepository.findAll();
    }

    @PostMapping("/group")
    void addGroup(@RequestBody SchoolGroup group) {
        schoolGroupRepository.save(group);
    }

    @PutMapping("/group/{id}")
    public SchoolGroup replaceGroup(@RequestBody SchoolGroup newGroup, @PathVariable Long id) {
        return schoolGroupRepository.findById(id)
                .map(group -> {
                    group.setName(newGroup.getName());
                    return schoolGroupRepository.save(group);
                })
                .orElseGet(() -> {
                    newGroup.setId(id);
                    return schoolGroupRepository.save(newGroup);
                });
    }

    @DeleteMapping("/group/del/{id}")
    public void delClass(@PathVariable long id) {
        schoolGroupRepository.deleteById(id);
    }
}
