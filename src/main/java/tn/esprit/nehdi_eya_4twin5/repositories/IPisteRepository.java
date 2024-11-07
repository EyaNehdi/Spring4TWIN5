package tn.esprit.nehdi_eya_4twin5.repositories;

import org.springframework.data.repository.CrudRepository;
import tn.esprit.nehdi_eya_4twin5.entities.Color;
import tn.esprit.nehdi_eya_4twin5.entities.Piste;

import java.util.List;

public interface IPisteRepository extends CrudRepository<Piste, Long> {
    List<Piste> findByColor(Color color);
}
