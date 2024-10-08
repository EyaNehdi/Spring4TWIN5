package tn.esprit.nehdi_eya_4twin5.services;

import tn.esprit.nehdi_eya_4twin5.entities.Skier;
import tn.esprit.nehdi_eya_4twin5.repositories.ISkierRepository;

public class SkierServicesImpl {

    private ISkierRepository skierRepository;

    public Skier addSkier(Skier skier) {
       return skierRepository.save(skier); 
    }
}
