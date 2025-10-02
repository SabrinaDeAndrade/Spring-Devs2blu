package com.example.aula04.services;

import com.example.aula04.models.Diretor;
import com.example.aula04.repositories.DiretorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DiretorService {

    @Autowired
    private DiretorRepository diretorRepository;

    public List<Diretor> buscarPorNacionalidade(String nacionalidade) {
        return diretorRepository.findByNacionalidade(nacionalidade);
    }
}
