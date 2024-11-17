package tn.esprit.nehdi_eya_4twin5.services;


import lombok.RequiredArgsConstructor;

import org.springframework.stereotype.Service;
import tn.esprit.nehdi_eya_4twin5.entities.Piste;
import tn.esprit.nehdi_eya_4twin5.entities.Skier;
import tn.esprit.nehdi_eya_4twin5.entities.TypeSubscription;
import tn.esprit.nehdi_eya_4twin5.repositories.IPisteRepository;
import tn.esprit.nehdi_eya_4twin5.repositories.ISkierRepository;

import java.time.LocalDate;
import java.util.List;

@RequiredArgsConstructor
@Service
public class SkierServicesImpl implements ISkierServices {


    private final  ISkierRepository skierRepository;
    private final IPisteRepository pisteRepository;
   // private final ISubscriptionRepository subscriptionRepository;


@Override
    public  Skier addSkier(Skier skier) {
    //In case we dont put CASCADE persist parameter
//    Subscription subscription = skier.getSubscription();
//    subscriptionRepository.save(subscription);
//    skier.setSubscription(subscription);
    return skierRepository.save(skier);
    }


    @Override
    public Skier updateSkier(Skier skier) {
        return skierRepository.save(skier);
    }

    @Override
    public Skier retrieveSkier(Long numSkier) {
        return skierRepository.findById(numSkier).orElse(null);
    }

    @Override
    public List<Skier> retrieveAll() {
        return (List<Skier>)skierRepository.findAll();
    }

    @Override
    public void removeSkier(Long numSkier) {
    skierRepository.deleteById(numSkier);
    }

    @Override
    public void assignSkierToPiste(Long numSkier, Long numPiste) {

        Skier skier = skierRepository.findById(numSkier)
                .orElse(null);
        Piste piste = pisteRepository.findById(numPiste)
                .orElse(null);
        piste.getSkiers().add(skier);
        pisteRepository.save(piste);
    }
    @Override
    public Skier getByFirstAndLastName(String firstName, String lastName) {
    return skierRepository.findByFirstNameAndLastName(firstName,lastName);
    }

    @Override
    public List<Skier> getByDateOfBirth(LocalDate dob) {
        return skierRepository.findByDateOfBirth(dob);
    }


    @Override
    public List<Skier> retrieveSkiersBySubscriptionType(TypeSubscription subscriptionType) {

    return  skierRepository.findBySubscription(subscriptionType);

    }

}
