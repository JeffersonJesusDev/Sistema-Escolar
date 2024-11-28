package com.jeffdev.sistemaescolar.controller;

import com.jeffdev.sistemaescolar.model.Sala;
import com.jeffdev.sistemaescolar.repositories.SalaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/sala")
public class SalaController {

    @Autowired
    private SalaRepository salaRepository;

    @GetMapping
    public List<Sala> listarSalas() {
        return salaRepository.findAll();
    }

    @PostMapping
    public Sala criarSala(@RequestBody Sala sala) {
        return salaRepository.save(sala);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Sala> atualizarSala(@PathVariable Long id, @RequestBody Sala salaAtualizada) {
        return salaRepository.findById(id)
                .map(sala -> {
                    sala.setNome(salaAtualizada.getNome());
                    return ResponseEntity.ok(salaRepository.save(sala));
                }).orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletarSala(@PathVariable Long id) {
        if (salaRepository.existsById(id)) {
            salaRepository.deleteById(id);
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.notFound().build();
    }
}
