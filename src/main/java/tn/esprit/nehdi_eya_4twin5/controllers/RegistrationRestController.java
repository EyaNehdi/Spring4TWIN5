package tn.esprit.nehdi_eya_4twin5.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import tn.esprit.nehdi_eya_4twin5.entities.Registration;

import tn.esprit.nehdi_eya_4twin5.services.IRegistrationServices;

import java.util.List;
@RequiredArgsConstructor
@RestController
@RequestMapping("registration")
public class RegistrationRestController {
    private final IRegistrationServices registrationServices;

    @PostMapping("/add")
    public Registration addRegistration(@RequestBody Registration registration) {
        return registrationServices.addRegistration(registration);
    }

    @GetMapping("/get/{numRegistration}")
    public Registration getRegistration(@PathVariable Long numRegistration) {
        return registrationServices.retrieveRegistration(numRegistration);
    }

    @GetMapping("/get")
    public List<Registration> getRegistrations() {
        return registrationServices.retrieveAll();
    }

    @PutMapping("/update/{registration}")
    public Registration updateRegistration(@RequestBody Registration registration) {
        return registrationServices.updateRegistration(registration);
    }

    @DeleteMapping("/delete/{numRegistration}")
    public Registration deleteRegistration(@PathVariable Long numRegistration) {
        registrationServices.removeRegistration(numRegistration);
        return registrationServices.retrieveRegistration(numRegistration);
    }
}
