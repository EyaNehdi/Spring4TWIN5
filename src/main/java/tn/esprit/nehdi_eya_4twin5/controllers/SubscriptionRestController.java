package tn.esprit.nehdi_eya_4twin5.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import tn.esprit.nehdi_eya_4twin5.entities.Subscription;
import tn.esprit.nehdi_eya_4twin5.services.ISubscriptionServices;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("subscription")
public class SubscriptionRestController {
    private final ISubscriptionServices subscriptionServices;


    @PostMapping("/add")
    public Subscription addSubscription(@RequestBody Subscription subscription) {
        return subscriptionServices.addSubscription(subscription);
    }

    @GetMapping("/get/{numSubscription}")
    public Subscription getSubscription(Long numSubscription) {
        return subscriptionServices.retrieveSubscription(numSubscription);
    }

    @GetMapping("/get")
    public List<Subscription> getSubscriptions() {
        return subscriptionServices.retrieveAll();
    }

    @PutMapping("/update/{subscription}")
    public Subscription updateSubscription(@RequestBody Subscription subscription) {
        return subscriptionServices.updateSubscription(subscription);
    }

    @DeleteMapping("/delete")
    public Subscription deleteSubscription(Long numSubscription) {
        subscriptionServices.removeSubscription(numSubscription);
        return subscriptionServices.retrieveSubscription(numSubscription);
    }
}
