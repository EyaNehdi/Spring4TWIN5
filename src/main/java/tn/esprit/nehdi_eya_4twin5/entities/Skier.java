package tn.esprit.nehdi_eya_4twin5.entities;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.Set;

@Entity
//@Table(name = "t_skier")
public class Skier {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long numSkier;
    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;
    private String city;
    @OneToOne(mappedBy ="skier" )
    Subscription subscription;
    @OneToMany(mappedBy = "skier")
    Set<Registration> registrations;


    @ManyToMany(mappedBy = "skiers")
    Set<Piste> pistes;




}
