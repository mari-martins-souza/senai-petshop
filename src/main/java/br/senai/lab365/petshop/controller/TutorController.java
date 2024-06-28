package br.senai.lab365.petshop.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/tutores")

public class TutorController {

    @PostMapping
    public String createTutor() {
        return "Endpoint para criar um novo Tutor";
    }

    @GetMapping
    public String readTutor() {
        return "Endpoint para ler informações do Tutor";
    }

    @PutMapping
    public String updateTutor() {
        return "Endpoint para atualizar informações do Tutor";
    }

    @DeleteMapping
    public String deleteTutor() {
        return "Endpoint para deletar um Tutor";
    }

}
