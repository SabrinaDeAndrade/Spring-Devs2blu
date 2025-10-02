package com.example.aula04.models;


import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
public class Artista {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    private String nome;

    private String nacionalidade;

    @ManyToMany(mappedBy = "artistas")
    private List<Filme> filmes;

    public Artista(String id, String nome, String nacionalidade, List<Filme> filmes) {
        this.id = id;
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.filmes = filmes;
    }
}
