package tn.esprit.nehdi_eya_4twin5.services;



import tn.esprit.nehdi_eya_4twin5.entities.Subscription;

import java.util.List;

public interface ISubscriptionServices {
    Subscription addSubscription(Subscription subscription);
    Subscription updateSubscription(Subscription subscription);
    Subscription retrieveSubscription(Long numSubscription);
    List<Subscription> retrieveAll();
    void removeSubscription(Long numSubscription);
}
