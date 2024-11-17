package tn.esprit.nehdi_eya_4twin5.services;


import tn.esprit.nehdi_eya_4twin5.entities.Skier;
import tn.esprit.nehdi_eya_4twin5.entities.TypeSubscription;

import java.time.LocalDate;

import java.util.List;

public interface ISkierServices {
    Skier addSkier(Skier skier);
    Skier updateSkier(Skier skier);
    Skier retrieveSkier(Long numSkier);
    List<Skier> retrieveAll();
    void removeSkier(Long numSkier);
    void assignSkierToPiste(Long numSkier, Long numPiste);
    Skier getByFirstAndLastName(String firstName, String lastName);
    List<Skier> getByDateOfBirth(LocalDate dob);

    List<Skier> retrieveSkiersBySubscriptionType(TypeSubscription subscriptionType);
}
