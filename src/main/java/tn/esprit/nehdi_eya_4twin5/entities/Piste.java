package tn.esprit.nehdi_eya_4twin5.entities;

import jakarta.persistence.*;

import java.awt.*;

@Entity
public class Piste {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long numPiste;
    private String namePiste;

    @Enumerated(EnumType.STRING)
    private Color color;
    private int length;
    private int slope;

}
