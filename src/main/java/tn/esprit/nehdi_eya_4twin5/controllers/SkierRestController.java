package tn.esprit.nehdi_eya_4twin5.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.nehdi_eya_4twin5.entities.Skier;
import tn.esprit.nehdi_eya_4twin5.services.ISkierServices;

import java.time.LocalDate;
import java.util.List;

@RequiredArgsConstructor
@RequestMapping("skier")
@RestController
public class SkierRestController {

    private final ISkierServices skierService;

    @PostMapping("/add")
    public Skier saveSkier(@RequestBody Skier skier) {
        return skierService.addSkier(skier);
    }

    @GetMapping("/get/{numSkier}")
    public Skier getSkier(@PathVariable Long numSkier) {
        return skierService.retrieveSkier(numSkier);
    }

    @GetMapping("/get")
    public List<Skier> getSkiers() {
        return skierService.retrieveAll();
    }

    @PutMapping("/update")
    public Skier updateSkier(@RequestBody Skier skier) {
        return skierService.updateSkier(skier);
    }

    @DeleteMapping("/delete/{numSkier}")
    public void deleteSkier(@PathVariable Long numSkier) {
        skierService.removeSkier(numSkier);
    }
    @PutMapping("/assignToPiste/{numSkier}/{numPiste}")
    public void assignSkier(@PathVariable Long numSkier,@PathVariable Long numPiste) {
        skierService.assignSkierToPiste(numSkier, numPiste);
    }
    @GetMapping("/get/{firstName}/{lastName}")
    public Skier getByFLname(@PathVariable String firstName, @PathVariable String lastName) {
        return skierService.getByFirstAndLastName(firstName, lastName);
    }
    @GetMapping("/getByDob/{dob}")
    public List<Skier> getByDob(@PathVariable  LocalDate dob) {
        return skierService.getByDateOfBirth(dob);
    }
}
