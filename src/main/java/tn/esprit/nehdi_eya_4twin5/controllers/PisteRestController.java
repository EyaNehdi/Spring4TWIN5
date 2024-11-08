package tn.esprit.nehdi_eya_4twin5.controllers;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import tn.esprit.nehdi_eya_4twin5.entities.Color;
import tn.esprit.nehdi_eya_4twin5.entities.Piste;

import tn.esprit.nehdi_eya_4twin5.entities.Skier;
import tn.esprit.nehdi_eya_4twin5.services.IPisteServices;

import java.util.List;

@Tag(name = "Gestion Piste")
@RequiredArgsConstructor
@RequestMapping("piste")
@RestController

public class PisteRestController {
    private final IPisteServices pisteServices;

    @Operation(description = "Ajouter une piste")
    @PostMapping("/add")
    public Piste addPiste(@RequestBody Piste piste) {
        return pisteServices.addPiste(piste);
    }

    @Operation(description = "Récupérer une piste par id")
    @GetMapping("/get/{numPiste}")
    public Piste getPiste(@PathVariable Long numPiste) {
        return pisteServices.retrievePiste(numPiste);
    }

    @Operation(description = "Récupérer tous les pistes")
    @GetMapping("/get")
    public List<Piste> getPistes() {
        return pisteServices.retrieveAll();
    }

    @Operation(description = "Modifier une piste")
    @PutMapping("/update")
    public Piste updatePiste(@RequestBody Piste piste) {
        return pisteServices.updatePiste(piste);
    }

    @Operation(description = "Supprimer une piste")
    @DeleteMapping("/delete/{numPiste}")
    public void deletePiste(@PathVariable Long numPiste) {
        pisteServices.removePiste(numPiste);

    }

    @Operation(description = "Assigner un Skier and une piste par une couleur demandée")
    @PutMapping("/assignSkier/piste/{fname}/{lname}/{color}")
    public Skier assignSkierToPiste(@PathVariable String fname, @PathVariable String lname, @PathVariable Color color) {
        return pisteServices.assignSkierToPiste(fname, lname, color);
    }
}
