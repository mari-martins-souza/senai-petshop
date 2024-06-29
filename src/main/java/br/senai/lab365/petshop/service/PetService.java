package br.senai.lab365.petshop.service;

import br.senai.lab365.petshop.model.Pet;
import br.senai.lab365.petshop.repository.PetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;

@Service

public class PetService {
    @Autowired
    private PetRepository petRepository;

    public Pet createPet(Pet pet) {
        return petRepository.save(pet);
    }

    public List<Pet> getAllPets() {
        return petRepository.findAll();
    }

    public Pet updatePet(Pet pet) {
        return petRepository.update(pet);
    }

    public boolean deletePet(Pet pet) {
        return petRepository.delete(pet);
    }
}
