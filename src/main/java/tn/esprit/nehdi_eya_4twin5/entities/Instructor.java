package tn.esprit.nehdi_eya_4twin5.entities;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.Set;

@Entity
public class Instructor {
  @Id
    private Long numInstructor;
  private String firstName;
  private String lastName;
  private LocalDate dateOfHire;
  @OneToMany
  Set<Course> Courses;

}
