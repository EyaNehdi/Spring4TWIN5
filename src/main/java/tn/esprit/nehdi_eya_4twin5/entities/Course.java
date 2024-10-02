package tn.esprit.nehdi_eya_4twin5.entities;

import jakarta.persistence.*;

import java.util.Set;

@Entity
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long numCourse;
    private int level;

    @Enumerated(EnumType.STRING)
    private TypeCourse typeCourse;

    @Enumerated(EnumType.STRING)
    private Support support;

    private float price;
    private int timeSlot;
    @OneToMany(mappedBy = "course")
    Set<Registration> registrations;



}