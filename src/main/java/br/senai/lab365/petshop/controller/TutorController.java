package br.senai.lab365.petshop.controller;

import br.senai.lab365.petshop.model.Tutor;
import br.senai.lab365.petshop.service.TutorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/tutores")
public class TutorController {

    @Autowired
    private TutorService tutorService;

    @PostMapping
    public Tutor createTutor(@RequestBody Tutor tutor) {
        return tutorService.createTutor(tutor);
    }

    @GetMapping
    public List<Tutor> readTutor() {
        return tutorService.getAllTutors();
    }

    @PutMapping
    public Tutor updateTutor(@RequestBody Tutor tutor) {
        return tutorService.updateTutor(tutor);
    }

    @DeleteMapping
    public boolean deleteTutor(@RequestBody Tutor tutor) {
        return tutorService.deleteTutor(tutor);
    }
}
