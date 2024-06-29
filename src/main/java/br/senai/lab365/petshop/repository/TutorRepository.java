package br.senai.lab365.petshop.repository;

import br.senai.lab365.petshop.model.Tutor;
import org.springframework.stereotype.Repository;
import java.util.*;

@Repository

public class TutorRepository {
    private List<Tutor> tutores = new ArrayList<>();

    public Tutor findById(int id) {
        for (Tutor tutor : tutores) {
            if (tutor.getId() == id) {
                return tutor;
            }
        }
        return null;
    }

    public Tutor save(Tutor tutor) {
        tutores.add(tutor);
        return tutor;
    }

    public List<Tutor> findAll() {
        return tutores;
    }

    public Tutor update(Tutor tutor) {
        int index = tutores.indexOf(tutor);
        if (index != -1) {
            tutores.set(index, tutor);
            return tutor;
        }
        return null;
    }

    public boolean delete(Tutor tutor) {
        return tutores.remove(tutor);
    }
}