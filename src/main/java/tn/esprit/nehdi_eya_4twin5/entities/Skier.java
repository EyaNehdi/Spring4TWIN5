package tn.esprit.nehdi_eya_4twin5.entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Set;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
//@Table(name = "t_skier")
public class Skier implements Serializable {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
     Long numSkier;
     String firstName;
     String lastName;
     LocalDate dateOfBirth;
     String city;
    @OneToOne (cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
    Subscription subscription;
    @OneToMany(mappedBy = "skier", fetch = FetchType.EAGER)
    Set<Registration> registrations;


    @ManyToMany(mappedBy = "skiers")
    Set<Piste> pistes;




}
