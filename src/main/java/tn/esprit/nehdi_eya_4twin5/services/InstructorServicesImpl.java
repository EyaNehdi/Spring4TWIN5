package tn.esprit.nehdi_eya_4twin5.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.nehdi_eya_4twin5.entities.Course;
import tn.esprit.nehdi_eya_4twin5.entities.Instructor;
import tn.esprit.nehdi_eya_4twin5.entities.Piste;
import tn.esprit.nehdi_eya_4twin5.repositories.ICourseRepository;
import tn.esprit.nehdi_eya_4twin5.repositories.IInstructorRepository;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@RequiredArgsConstructor
@Service
public class InstructorServicesImpl implements IInstructorServices {
    private final IInstructorRepository instructorRepository;
    private final ICourseRepository courseRepository;
    @Override
    public Instructor addInstructor(Instructor instructor) {
        return instructorRepository.save(instructor);
    }

    @Override
    public Instructor updateInstructor(Instructor instructor) {
        return instructorRepository.save(instructor);
    }

    @Override
    public Instructor retrieveInstructor(Long numInstructor) {
        return instructorRepository.findById(numInstructor).orElse(null);
    }

    @Override
    public List<Instructor> retrieveAll() {
        return (List<Instructor>) instructorRepository.findAll();
    }

    @Override
    public void removeInstructor(Long numInstructor) {
instructorRepository.deleteById(numInstructor);
    }

    @Override
    public Instructor addInstructorAndAssignToCourses(Instructor instructor, List<Long> numCourses) {
        Set<Course> courses = new HashSet<>();
        for (Long courseId : numCourses) {
            Course course = courseRepository.findById(courseId).orElse(null);
            if (course != null) {
                instructor.getCourses().add(course);
            }
        }
        return instructorRepository.save(instructor);
    }

    @Override
    public Instructor addAndAssignCourses(Instructor instructor) {

        Set<Course> assignedCourses = new HashSet<>();
        for (Course course : instructor.getCourses()) {
            Long courseId = course.getNumCourse();
            Course foundCourse = courseRepository.findById(courseId).orElse(null);

            if (foundCourse != null) {
                assignedCourses.add(foundCourse);
            }
        }
        instructor.setCourses(assignedCourses);
        return instructorRepository.save(instructor);
    }



}
