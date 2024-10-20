package tn.esprit.nehdi_eya_4twin5.services;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.nehdi_eya_4twin5.entities.Course;
import tn.esprit.nehdi_eya_4twin5.repositories.ICourseRepository;

import java.util.List;

@RequiredArgsConstructor
@Service
public class CourseServicesImpl implements ICourseServices {
    private final ICourseRepository courseRepository;
    @Override
    public Course addCourse(Course course) {
        return courseRepository.save(course);
    }

    @Override
    public Course updateCourse(Course course) {
        return courseRepository.save(course);
    }

    @Override
    public Course retrieveCourse(Long numCourse) {
        return courseRepository.findById(numCourse).orElse(null);
    }

    @Override
    public List<Course> retrieveAll() {
        return (List<Course>)courseRepository.findAll();
    }

    @Override
    public void removeCourse(Long numCourse) {
        courseRepository.deleteById(numCourse);
    }
}
