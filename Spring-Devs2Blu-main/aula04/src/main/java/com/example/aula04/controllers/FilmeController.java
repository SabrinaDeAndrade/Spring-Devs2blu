package com.example.aula04.controllers;

import com.example.aula04.models.Filme;
import com.example.aula04.repositories.ArtistaRepository;
import com.example.aula04.services.FilmeService;
import org.apache.coyote.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/filmes")
public class FilmeController {
    private final FilmeService filmeService;

    public FilmeController(FilmeService filmeService) {
        this.filmeService = filmeService;
    }

    @GetMapping
    public ResponseEntity<List<Filme>> buscarTodos(){
        return ResponseEntity.ok(filmeService.buscarTodos());
    }
    @PostMapping
    public ResponseEntity<Filme> adicionar(@RequestBody Filme filme) {
        return ResponseEntity.ok(filmeService.criar(filme));
    }
}
