package tn.esprit.nehdi_eya_4twin5.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import tn.esprit.nehdi_eya_4twin5.entities.Piste;

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
    public Piste getPiste(Long numPiste) {
        return pisteServices.retrievePiste(numPiste);
    }

    @GetMapping("/get")
    public List<Piste> getPistes() {
        return pisteServices.retrieveAll();
    }

    @PutMapping("/update/{piste}")
    public Piste updatePiste(@RequestBody Piste piste) {
        return pisteServices.updatePiste(piste);
    }

    @DeleteMapping("/delete")
    public Piste deletePiste(Long numPiste) {
        pisteServices.removePiste(numPiste);
        return pisteServices.retrievePiste(numPiste);
    }
}
