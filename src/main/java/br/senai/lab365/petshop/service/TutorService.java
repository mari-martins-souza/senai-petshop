package br.senai.lab365.petshop.service;

import br.senai.lab365.petshop.model.Tutor;
import br.senai.lab365.petshop.repository.TutorRepository;
import org.springframework.stereotype.Service;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class TutorService {

    @Autowired
    private TutorRepository tutorRepository;

    public Tutor createTutor(Tutor tutor) {
        return tutorRepository.save(tutor);
    }

    public List<Tutor> getAllTutors() {
        return tutorRepository.findAll();
    }

    public Tutor updateTutor(Tutor tutor) {
        return tutorRepository.update(tutor);
    }

    public boolean deleteTutor(Tutor tutor) {
        return tutorRepository.delete(tutor);
    }
}
