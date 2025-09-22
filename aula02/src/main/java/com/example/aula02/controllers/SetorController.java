package com.example.aula02.controllers;

import com.example.aula02.models.Setor;
import com.example.aula02.services.SetorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/setores")
public class SetorController {

    @Autowired
    private SetorService setorService;

    @GetMapping
    public ResponseEntity<List<Setor>> getAll() {
        return ResponseEntity.ok(setorService.getAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Setor> getById(@PathVariable Long id) {
        return setorService.getById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Setor> create(@RequestBody Setor setor) {
        Setor novoSetor = setorService.create(setor);
        return ResponseEntity.ok(novoSetor);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        boolean removed = setorService.delete(id);
        if (removed) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.notFound().build();
    }
}
