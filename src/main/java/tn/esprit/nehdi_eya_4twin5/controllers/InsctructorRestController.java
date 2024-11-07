package tn.esprit.nehdi_eya_4twin5.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.nehdi_eya_4twin5.entities.Instructor;

import tn.esprit.nehdi_eya_4twin5.services.IInstructorServices;

import java.util.List;

@RequiredArgsConstructor
@RequestMapping("instructor")
@RestController
public class InsctructorRestController {
    private final IInstructorServices instructorServices;

    @PostMapping("/add")
    public Instructor addInstructor(@RequestBody Instructor instructor) {
        return instructorServices.addInstructor(instructor);
    }

    @GetMapping("/get/{numInstructor}")
    public Instructor getInstructor(@PathVariable Long numInstructor) {
        return instructorServices.retrieveInstructor(numInstructor);
    }

    @GetMapping("/get")
    public List<Instructor> getInstructors() {
        return instructorServices.retrieveAll();
    }

    @PutMapping("/update")
    public Instructor updateInstructor(@RequestBody Instructor instructor) {
        return instructorServices.updateInstructor(instructor);
    }

    @DeleteMapping("/delete/{numInstructor}")
    public void deleteInstructor(@PathVariable Long numInstructor) {
        instructorServices.removeInstructor(numInstructor);

    }

}
