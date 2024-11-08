package tn.esprit.nehdi_eya_4twin5.controllers;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import tn.esprit.nehdi_eya_4twin5.entities.Subscription;
import tn.esprit.nehdi_eya_4twin5.services.ISubscriptionServices;

import java.util.List;

@Tag(name = "Gestion Subscription")
@RequiredArgsConstructor
@RestController
@RequestMapping("subscription")
public class SubscriptionRestController {
    private final ISubscriptionServices subscriptionServices;

    @Operation(description = "Ajouter une Subscription")
    @PostMapping("/add")
    public Subscription addSubscription(@RequestBody Subscription subscription) {
        return subscriptionServices.addSubscription(subscription);
    }

    @Operation(description = "Recuperer une Subscription par id")
    @GetMapping("/get/{numSubscription}")
    public Subscription getSubscription(@PathVariable Long numSubscription) {
        return subscriptionServices.retrieveSubscription(numSubscription);
    }

    @Operation(description = "Recuperer toutes les Subscriptions")
    @GetMapping("/get")
    public List<Subscription> getSubscriptions() {
        return subscriptionServices.retrieveAll();
    }

    @Operation(description = "Modifier une Subscription")
    @PutMapping("/update")
    public Subscription updateSubscription(@RequestBody Subscription subscription) {
        return subscriptionServices.updateSubscription(subscription);
    }

    @Operation(description = "Supprimer une Subscription")
    @DeleteMapping("/delete/{numSubscription}")
    public void deleteSubscription(@PathVariable Long numSubscription) {
        subscriptionServices.removeSubscription(numSubscription);

    }
}
