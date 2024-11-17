package tn.esprit.nehdi_eya_4twin5.repositories;

import org.springframework.data.repository.CrudRepository;
import tn.esprit.nehdi_eya_4twin5.entities.Subscription;
import tn.esprit.nehdi_eya_4twin5.entities.TypeSubscription;

import java.util.Set;

public interface ISubscriptionRepository extends CrudRepository<Subscription, Long> {
Set<Subscription> findByTypeSubscription(TypeSubscription typeSubscription);
}
