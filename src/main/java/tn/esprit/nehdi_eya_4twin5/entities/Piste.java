package tn.esprit.nehdi_eya_4twin5.entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.awt.*;
import java.io.Serializable;
import java.util.Set;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
public class Piste implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     Long numPiste;
     String namePiste;

    @Enumerated(EnumType.STRING)
     Color color;
     int length;
     int slope;
    @ManyToMany
    Set<Skier> skiers;

}
