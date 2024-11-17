package tn.esprit.nehdi_eya_4twin5.controllers;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.nehdi_eya_4twin5.entities.Course;
import tn.esprit.nehdi_eya_4twin5.services.ICourseServices;

import java.util.List;
@Tag(name = "Gestion Course")
@RequiredArgsConstructor
@RequestMapping("course")
@RestController
public class CourseRestController {
    private final ICourseServices courseServices;

    @Operation(description = "Ajouter un Cours")
    @PostMapping("/add")
    public Course saveCourse(@RequestBody Course course) {
        return courseServices.addCourse(course);
    }

    @Operation(description = "Recupérer 1 cours par id")
    @GetMapping("/get/{numCourse}")
    public Course getCourse(@PathVariable Long numCourse) {
        return courseServices.retrieveCourse(numCourse);
    }

    @Operation(description = "Recupérer tous les cours")
    @GetMapping("/get")
    public List<Course> getCourses() {
        return courseServices.retrieveAll();
    }

    @Operation(description = "Modifier un cours")
    @PutMapping("/update")
    public Course updateCourse(@RequestBody Course course) {
        return courseServices.updateCourse(course);
    }

    @Operation(description = "Supprimer un cours")
    @DeleteMapping("/delete/{numCourse}")
    public void deleteCourse(@PathVariable Long numCourse) {
        courseServices.removeCourse(numCourse);

    }
}
