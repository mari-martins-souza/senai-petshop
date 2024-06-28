package br.senai.lab365.petshop.controller;

import br.senai.lab365.petshop.model.Tutor;
import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/tutores")

public class TutorController {

    private List<Tutor> tutores = new ArrayList<>();

    @PostMapping
    public Tutor createTutor(@RequestBody Tutor tutor) {
        tutores.add(tutor);
        return tutor;
    }

    @GetMapping
    public List<Tutor> readTutor() {
        return tutores;
    }

    @PutMapping
    public Tutor updateTutor(@RequestBody Tutor tutor) {
        int index = tutores.indexOf(tutor);
        if (index != -1) {
            tutores.set(index, tutor);
            return tutor;
        }
        return null;
    }

    @DeleteMapping
    public boolean deleteTutor(@RequestBody Tutor tutor) {
        return tutores.remove(tutor);
    }
}

