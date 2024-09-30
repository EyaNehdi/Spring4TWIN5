package tn.esprit.nehdi_eya_4twin5.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalDate;

@Entity
@Table(name = "t_skier")
public class Skier {
    @Id
    private int idSkier;
    private String name;
    private LocalDate birthDate;



}
