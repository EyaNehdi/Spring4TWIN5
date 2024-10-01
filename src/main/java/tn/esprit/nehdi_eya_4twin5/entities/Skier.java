package tn.esprit.nehdi_eya_4twin5.entities;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "t_skier")
public class Skier {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long numSkier;
    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;
    private String city;



}
