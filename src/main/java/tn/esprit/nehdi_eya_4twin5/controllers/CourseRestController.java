package tn.esprit.nehdi_eya_4twin5.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.nehdi_eya_4twin5.entities.Course;
import tn.esprit.nehdi_eya_4twin5.services.ICourseServices;

import java.util.List;

@RequiredArgsConstructor
@RequestMapping("course")
@RestController
public class CourseRestController {
    private final ICourseServices courseServices;

    @PostMapping("/add")
    public Course saveCourse(@RequestBody Course course) {
        return courseServices.addCourse(course);
    }

    @GetMapping("/get/{numCourse}")
    public Course getCourse(@PathVariable Long numCourse) {
        return courseServices.retrieveCourse(numCourse);
    }

    @GetMapping("/get")
    public List<Course> getCourses() {
        return courseServices.retrieveAll();
    }

    @PutMapping("/update/{course}")
    public Course updateCourse(@RequestBody Course course) {
        return courseServices.updateCourse(course);
    }

    @DeleteMapping("/delete/{numCourse}")
    public Course deleteCourse(@PathVariable Long numCourse) {
        courseServices.removeCourse(numCourse);
        return getCourse(numCourse);
    }
}
