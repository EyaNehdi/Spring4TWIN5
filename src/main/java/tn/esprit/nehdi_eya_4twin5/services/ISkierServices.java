package tn.esprit.nehdi_eya_4twin5.services;

import tn.esprit.nehdi_eya_4twin5.entities.Skier;

import java.util.List;

public interface ISkierServices {
    Skier addSkier(Skier skier);
    Skier updateSkier(Skier skier);
    Skier retrieveSkier(Long numSkier);
    List<Skier> retrieveAll();
    void removeSkier(Long numSkier);
}
