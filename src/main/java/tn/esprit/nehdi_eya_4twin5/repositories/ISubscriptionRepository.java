package tn.esprit.nehdi_eya_4twin5.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import tn.esprit.nehdi_eya_4twin5.entities.Subscription;
import tn.esprit.nehdi_eya_4twin5.entities.TypeSubscription;

import java.util.Set;

public interface ISubscriptionRepository extends CrudRepository<Subscription, Long> {
    @Query("SELECT s FROM Skier s WHERE s.subscription.typeSub = :subscriptionType ORDER BY s.subscription.startDate ASC")
Set<Subscription> findByTypeSubscription(TypeSubscription typeSubscription);
}
