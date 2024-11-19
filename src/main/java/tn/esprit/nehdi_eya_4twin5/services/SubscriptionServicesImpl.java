package tn.esprit.nehdi_eya_4twin5.services;

import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;
import tn.esprit.nehdi_eya_4twin5.entities.Subscription;
import tn.esprit.nehdi_eya_4twin5.entities.TypeSubscription;
import tn.esprit.nehdi_eya_4twin5.repositories.ISubscriptionRepository;

import java.util.List;
import java.util.Set;

@RequiredArgsConstructor
@Service
public class SubscriptionServicesImpl implements ISubscriptionServices{
    private final ISubscriptionRepository subscriptionRepository;
    @Override
    public Subscription addSubscription(Subscription subscription) {
        return subscriptionRepository.save(subscription);
    }

    @Override
    public Subscription updateSubscription(Subscription subscription) {
        return subscriptionRepository.save(subscription);
    }

    @Override
    public Subscription retrieveSubscription(Long numSubscription) {
        return subscriptionRepository.findById(numSubscription).orElse(null);
    }

    @Override
    public List<Subscription> retrieveAll() {
        return (List<Subscription>) subscriptionRepository.findAll();
    }

    @Override
    public void removeSubscription(Long numSubscription) {
subscriptionRepository.deleteById(numSubscription);
    }


    @Override
    public Set<Subscription> getSubscriptionByType(@Param("subscriptionType")TypeSubscription type) {
        return subscriptionRepository.findByTypeSubscription(type);
    }


}
