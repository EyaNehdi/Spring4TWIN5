package tn.esprit.nehdi_eya_4twin5.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.nehdi_eya_4twin5.entities.Piste;
import tn.esprit.nehdi_eya_4twin5.repositories.IPisteRepository;

import java.util.List;
@RequiredArgsConstructor
@Service
public class PisteServicesImpl implements IPisteServices {
    private final IPisteRepository pisteRepository;
    @Override
    public Piste addPiste(Piste piste) {
        return pisteRepository.save(piste);
    }

    @Override
    public Piste updatePiste(Piste piste) {
        return pisteRepository.save(piste);
    }

    @Override
    public Piste retrievePiste(Long numPiste) {
        return pisteRepository.findById(numPiste).orElse(null);
    }

    @Override
    public List<Piste> retrieveAll() {
        return (List<Piste>) pisteRepository.findAll();
    }

    @Override
    public void removePiste(Long numPiste) {
pisteRepository.deleteById(numPiste);
    }
}
