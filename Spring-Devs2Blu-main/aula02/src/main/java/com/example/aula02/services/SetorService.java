package com.example.aula02.services;

import com.example.aula02.models.Setor;
import com.example.aula02.repositories.SetorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SetorService {

    @Autowired
    private SetorRepository setorRepository;

    public List<Setor> getAll() {
        return setorRepository.findAll();
    }

    public Optional<Setor> getById(Long id) {
        return setorRepository.findById(id);
    }

    public Setor create(Setor setor) {
        return setorRepository.save(setor);
    }

    public boolean delete(Long id) {
        if (setorRepository.existsById(id)) {
            setorRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
