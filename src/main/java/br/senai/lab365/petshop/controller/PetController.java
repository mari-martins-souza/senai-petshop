package br.senai.lab365.petshop.controller;

import org.springframework.web.bind.annotation.*;
import java.util.*;
import br.senai.lab365.petshop.model.Pet;

@RestController
@RequestMapping("/pets")

public class PetController {

    private List<Pet> pets = new ArrayList<>();

    @PostMapping
    public Pet createPet(@RequestBody Pet pet) {
        pets.add(pet);
        return pet;
    }

    @GetMapping
    public List<Pet> readPet() {
        return pets;
    }

    @PutMapping
    public Pet updatePet(@RequestBody Pet pet) {
        int index = pets.indexOf(pet);
        if (index != -1) {
            pets.set(index, pet);
            return pet;
        }
        return null;
    }

    @DeleteMapping
    public boolean deletePet(@RequestBody Pet pet) {
        return pets.remove(pet);
    }
}
