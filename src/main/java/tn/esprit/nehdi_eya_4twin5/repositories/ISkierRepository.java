package tn.esprit.nehdi_eya_4twin5.repositories;


import org.springframework.data.repository.CrudRepository;
import tn.esprit.nehdi_eya_4twin5.entities.Skier;

import java.time.LocalDate;

import java.util.List;

public interface ISkierRepository extends CrudRepository<Skier, Long> {
    Skier findByFirstNameAndLastName(String fname,String lname);
    List<Skier> findByDateOfBirth(LocalDate dob);
}
