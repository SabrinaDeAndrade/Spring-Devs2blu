package com.example.aula04.models;

import jakarta.persistence.*;

@Entity
public class Premio {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    private String nome;

    private int ano;

    @ManyToOne
    @JoinColumn(name = "diretor_id")
    private Diretor diretor;

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

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public Diretor getDiretor() {
        return diretor;
    }

    public void setDiretor(Diretor diretor) {
        this.diretor = diretor;
    }

    public Premio(String id, String nome, int ano, Diretor diretor) {
        this.id = id;
        this.nome = nome;
        this.ano = ano;
        this.diretor = diretor;
    }
}
