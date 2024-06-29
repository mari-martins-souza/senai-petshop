package br.senai.lab365.petshop.controller;

import br.senai.lab365.petshop.service.PetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.*;
import br.senai.lab365.petshop.model.Pet;

@RestController
@RequestMapping("/pets")

public class PetController {

    @Autowired
    private PetService petService;

    @PostMapping
    public Pet createPet(@RequestBody Pet pet) {
        return petService.createPet(pet);
    }

    @GetMapping
    public List<Pet> readPet() {
        return petService.getAllPets();
    }

    @PutMapping
    public Pet updatePet(@RequestBody Pet pet) {
        return petService.updatePet(pet);
    }

    @DeleteMapping
    public boolean deletePet(@RequestBody Pet pet) {
        return petService.deletePet(pet);
    }
}
