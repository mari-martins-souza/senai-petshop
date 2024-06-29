package br.senai.lab365.petshop.repository;

import br.senai.lab365.petshop.model.Pet;
import br.senai.lab365.petshop.model.Tutor;
import org.springframework.stereotype.Repository;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;

@Repository

public class PetRepository {

    @Autowired
    private TutorRepository tutorRepository;

    private List<Pet> pets = new ArrayList<>();

    public Pet findById(int id) {
        for (Pet pet : pets) {
            if (pet.getId() == id) {
                return pet;
            }
        }
        return null;
    }

    public Pet setTutor(int petId, int tutorId) {
        Pet pet = findById(petId);
        Tutor tutor = tutorRepository.findById(tutorId);
        if (pet != null && tutor != null) {
            pet.setTutor(tutor);
            return pet;
        }
        return null;
    }

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
