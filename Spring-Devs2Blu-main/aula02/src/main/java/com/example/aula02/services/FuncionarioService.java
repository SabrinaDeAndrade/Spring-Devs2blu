package com.example.aula02.services;

import com.example.aula02.models.Funcionario;
import com.example.aula02.repositories.FuncionarioRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FuncionarioService {
    private final FuncionarioRepository repository;

    public FuncionarioService(FuncionarioRepository repository) {
        this.repository = repository;
    }

    public List<Funcionario> buscarTodos(){
        return repository.findAll();
    }

    public Funcionario criarNovo(Funcionario funcionario){
        return repository.save(funcionario);
    }
}

