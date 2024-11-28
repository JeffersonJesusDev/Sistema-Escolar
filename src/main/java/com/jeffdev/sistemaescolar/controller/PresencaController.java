package com.jeffdev.sistemaescolar.controller;

import com.jeffdev.sistemaescolar.model.Presenca;
import com.jeffdev.sistemaescolar.repositories.PresencaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("presenca")
public class PresencaController {

    @Autowired
    private PresencaRepository presencaRepository;

    @GetMapping
    public List<Presenca> listar() {
        return presencaRepository.findAll();
    }

    @PostMapping
    public Presenca criar(@RequestBody Presenca presenca) {
        return presencaRepository.save(presenca);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        if (presencaRepository.existsById(id)) {
            presencaRepository.deleteById(id);
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.notFound().build();
    }
}
