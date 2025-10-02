package com.example.aula04.controllers;

import com.example.aula04.models.Artista;
import com.example.aula04.repositories.ArtistaRepository;
import com.example.aula04.services.ArtistaService;
import org.apache.coyote.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/artistas")
public class ArtistaController {
    private final ArtistaService artistaService;

    public ArtistaController(ArtistaService artistaService){
        this.artistaService = artistaService;
    }

    @GetMapping
    public ResponseEntity<List<Artista>> buscarTodos(){
        return ResponseEntity.ok(artistaService.buscarTodos());
    }
    @PostMapping
    public ResponseEntity<Artista> adicionar(@RequestBody Artista artista) {
        return ResponseEntity.ok(artistaService.criar(artista));
    }
}
