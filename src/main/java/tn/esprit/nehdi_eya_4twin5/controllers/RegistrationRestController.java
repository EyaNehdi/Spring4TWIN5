package tn.esprit.nehdi_eya_4twin5.controllers;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import tn.esprit.nehdi_eya_4twin5.entities.Registration;

import tn.esprit.nehdi_eya_4twin5.services.IRegistrationServices;

import java.util.List;

@Tag(name = "Gestion Registration")
@RequiredArgsConstructor
@RestController
@RequestMapping("registration")
public class RegistrationRestController {
    private final IRegistrationServices registrationServices;

    @Operation(description = "Ajouter une Registration")
    @PostMapping("/add")
    public Registration addRegistration(@RequestBody Registration registration) {
        return registrationServices.addRegistration(registration);
    }

    @Operation(description = "Récuperer une Registration par id")
    @GetMapping("/get/{numRegistration}")
    public Registration getRegistration(@PathVariable Long numRegistration) {
        return registrationServices.retrieveRegistration(numRegistration);
    }

    @Operation(description = "Récuperer toutes les Registration")
    @GetMapping("/get")
    public List<Registration> getRegistrations() {
        return registrationServices.retrieveAll();
    }

    @Operation(description = "Modifier une Registration")
    @PutMapping("/update")
    public Registration updateRegistration(@RequestBody Registration registration) {
        return registrationServices.updateRegistration(registration);
    }

    @Operation(description = "Supprimer une Registration")
    @DeleteMapping("/delete/{numRegistration}")
    public void deleteRegistration(@PathVariable Long numRegistration) {
        registrationServices.removeRegistration(numRegistration);

    }

    @Operation(description = "Ajouter une Registration et lui assigner un Skier")
    @PostMapping("/addR/{numSkier}")
    public Registration addRegistrationAndAssignToSkier(@RequestBody Registration registration, @PathVariable Long numSkier) {
        return registrationServices.addRegistrationAndAssignToSkier(registration, numSkier);
    }

    @Operation(description = "Assigner une Registration à un Cours")
    @PostMapping("/addR/course/{numCourse}")
    public Registration assignRegistrationToCourse(@RequestBody Registration registration, @PathVariable Long numCourse) {
        return registrationServices.assignRegistrationToCourse(registration, numCourse);
    }
}
