package com.example.aula02.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Entity(name = "funcionarios")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Funcionario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private String email;

    private Double salario;

    private String cidade;

    @ManyToOne
    private Setor setor;



    @Repository
    public interface FuncionarioRepository
            extends JpaRepository<Funcionario, Long> {


    }
}
