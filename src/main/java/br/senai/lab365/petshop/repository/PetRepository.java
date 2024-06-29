package br.senai.lab365.petshop.repository;

import br.senai.lab365.petshop.model.Pet;
import org.springframework.stereotype.Repository;
import java.util.*;

@Repository

public class PetRepository {
    private List<Pet> pets = new ArrayList<>();

    public Pet save(Pet pet) {
        pets.add(pet);
        return pet;
    }

    public List<Pet> findAll() {
        return pets;
    }

    public Pet update(Pet pet) {
        int index = pets.indexOf(pet);
        if (index != -1) {
            pets.set(index, pet);
            return pet;
        }
        return null;
    }

    public boolean delete(Pet pet) {
        return pets.remove(pet);
    }
}
