package tn.esprit.nehdi_eya_4twin5.repositories;


import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import tn.esprit.nehdi_eya_4twin5.entities.Skier;
import tn.esprit.nehdi_eya_4twin5.entities.TypeCourse;
import tn.esprit.nehdi_eya_4twin5.entities.TypeSubscription;

import java.time.LocalDate;

import java.util.List;

public interface ISkierRepository extends CrudRepository<Skier, Long> {
    Skier findByFirstNameAndLastName(String fname,String lname);
    List<Skier> findByDateOfBirth(LocalDate dob);
    List<Skier> findBySubscription(TypeSubscription typeSubscription);
    @Query("select s from Skier s join s.registrations registration where registration.course.typeCourse=:typeCourse ")
    List<Skier> getSkierByTypeCourse(@Param("typeCourse") TypeCourse typeCourse);
}
