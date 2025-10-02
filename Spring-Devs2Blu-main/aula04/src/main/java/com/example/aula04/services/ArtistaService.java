package com.example.aula04.services;

import com.example.aula04.models.Artista;
import com.example.aula04.repositories.ArtistaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArtistaService {
    private final ArtistaRepository artistaRepository;

    public ArtistaService(ArtistaRepository artistaRepository) {
        this.artistaRepository = artistaRepository;
    }

    public List<Artista> buscarTodos(){
        return artistaRepository.findAll();
    }

    public Artista criar(Artista artista){
        return artistaRepository.save(artista);
    }
}
