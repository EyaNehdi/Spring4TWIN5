package tn.esprit.nehdi_eya_4twin5.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import tn.esprit.nehdi_eya_4twin5.entities.Color;
import tn.esprit.nehdi_eya_4twin5.entities.Piste;

import tn.esprit.nehdi_eya_4twin5.entities.Skier;
import tn.esprit.nehdi_eya_4twin5.services.IPisteServices;

import java.util.List;

@RequiredArgsConstructor
@RequestMapping("piste")
@RestController

public class PisteRestController {
    private final IPisteServices pisteServices;

    @PostMapping("/add")
    public Piste addPiste(@RequestBody Piste piste) {
        return pisteServices.addPiste(piste);
    }

    @GetMapping("/get/{numPiste}")
    public Piste getPiste(@PathVariable Long numPiste) {
        return pisteServices.retrievePiste(numPiste);
    }

    @GetMapping("/get")
    public List<Piste> getPistes() {
        return pisteServices.retrieveAll();
    }

    @PutMapping("/update")
    public Piste updatePiste(@RequestBody Piste piste) {
        return pisteServices.updatePiste(piste);
    }

    @DeleteMapping("/delete/{numPiste}")
    public void deletePiste(@PathVariable Long numPiste) {
        pisteServices.removePiste(numPiste);

    }
    @PutMapping("/assignSkier/piste/{fname}/{lname}/{color}")
    public Skier assignSkierToPiste (@PathVariable String fname,@PathVariable String lname, @PathVariable Color color){
        return pisteServices.assignSkierToPiste(fname, lname, color);
    }
}
