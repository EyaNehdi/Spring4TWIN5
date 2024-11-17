package tn.esprit.nehdi_eya_4twin5.repositories;

import org.springframework.data.repository.CrudRepository;
import tn.esprit.nehdi_eya_4twin5.entities.Course;
import tn.esprit.nehdi_eya_4twin5.entities.TypeCourse;

import java.util.List;

public interface ICourseRepository extends CrudRepository<Course, Long> {

}
