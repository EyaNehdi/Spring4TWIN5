package tn.esprit.nehdi_eya_4twin5.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDate;

@Entity
public class Instructor {
  @Id
    private Long numInstructor;
  private String firstName;
  private String lastName;
  private LocalDate dateOfHire;

}
