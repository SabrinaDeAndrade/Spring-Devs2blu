package com.example.aula04.models;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Diretor {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    private String nome;

    private String nacionalidade;

    @OneToMany(mappedBy = "diretor")
    private List<Premio> premiacoes;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    // Construtor atualizado
    public Diretor(String id, String nome, String nacionalidade, List<Premio> premiacoes) {
        this.id = id;
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.premiacoes = premiacoes;
    }

    // Construtor vazio (necessário para JPA)
    public Diretor() {}
}