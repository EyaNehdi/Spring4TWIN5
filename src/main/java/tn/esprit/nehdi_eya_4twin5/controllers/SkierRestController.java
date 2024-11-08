package tn.esprit.nehdi_eya_4twin5.controllers;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.nehdi_eya_4twin5.entities.Skier;
import tn.esprit.nehdi_eya_4twin5.services.ISkierServices;

import java.time.LocalDate;
import java.util.List;
@Tag(name = "Gestion Skier")
@RequiredArgsConstructor
@RequestMapping("skier")
@RestController
public class SkierRestController {

    private final ISkierServices skierService;
    @Operation(description = "Ajouter un Skier")
    @PostMapping("/add")
    public Skier saveSkier(@RequestBody Skier skier) {
        return skierService.addSkier(skier);
    }
    @Operation (description = "Recuperer un Skier par id")
    @GetMapping("/get/{numSkier}")
    public Skier getSkier(@PathVariable Long numSkier) {
        return skierService.retrieveSkier(numSkier);
    }
    @Operation (description = "Recuperer tous les Skiers")
    @GetMapping("/get")
    public List<Skier> getSkiers() {
        return skierService.retrieveAll();
    }
    @Operation (description = "Modifier un Skier")
    @PutMapping("/update")
    public Skier updateSkier(@RequestBody Skier skier) {
        return skierService.updateSkier(skier);
    }
    @Operation (description = "Supprimer un Skier")
    @DeleteMapping("/delete/{numSkier}")
    public void deleteSkier(@PathVariable Long numSkier) {
        skierService.removeSkier(numSkier);
    }
    @Operation (description = "Assigner un Skier à une piste")
    @PutMapping("/assignToPiste/{numSkier}/{numPiste}")
    public void assignSkier(@PathVariable Long numSkier,@PathVariable Long numPiste) {
        skierService.assignSkierToPiste(numSkier, numPiste);
    }
    @Operation (description = "Récuperer Skier par First Name et Last Name")
    @GetMapping("/get/{firstName}/{lastName}")
    public Skier getByFLname(@PathVariable String firstName, @PathVariable String lastName) {
        return skierService.getByFirstAndLastName(firstName, lastName);
    }
    @Operation (description = "Récupérer Skier par Date Of Birth")
    @GetMapping("/getByDob/{dob}")
    public List<Skier> getByDob(@PathVariable  LocalDate dob) {
        return skierService.getByDateOfBirth(dob);
    }
}
