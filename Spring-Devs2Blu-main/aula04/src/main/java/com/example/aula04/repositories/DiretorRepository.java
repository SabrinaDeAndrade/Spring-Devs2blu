package com.example.aula04.repositories;

import com.example.aula04.models.Diretor;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface DiretorRepository extends JpaRepository<Diretor, String> {
    List<Diretor> findByNacionalidade(String nacionalidade); // <-- Aqui está o método desejado
}
