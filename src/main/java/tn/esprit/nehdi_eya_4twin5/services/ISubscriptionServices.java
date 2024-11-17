package tn.esprit.nehdi_eya_4twin5.services;



import tn.esprit.nehdi_eya_4twin5.entities.Subscription;
import tn.esprit.nehdi_eya_4twin5.entities.TypeSubscription;

import java.util.List;
import java.util.Set;

public interface ISubscriptionServices {
    Subscription addSubscription(Subscription subscription);
    Subscription updateSubscription(Subscription subscription);
    Subscription retrieveSubscription(Long numSubscription);
    List<Subscription> retrieveAll();
    void removeSubscription(Long numSubscription);
Set<Subscription> getSubscriptionByType(TypeSubscription type);
}
