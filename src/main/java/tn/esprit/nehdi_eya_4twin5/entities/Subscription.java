package tn.esprit.nehdi_eya_4twin5.entities;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Subscription {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long numSub;
    private LocalDate startDate;
    private LocalDate endDate;
    private float price;

    @Enumerated(EnumType.STRING)
    private TypeSubscription typeSub;
    @OneToOne
    Skier skier;
}
