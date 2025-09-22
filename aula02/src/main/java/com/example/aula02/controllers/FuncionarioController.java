package com.example.aula02.controllers;

import com.example.aula02.models.Funcionario;
import com.example.aula02.services.FuncionarioService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/funcionarios")
public class FuncionarioController {

    private final FuncionarioService service;


    public FuncionarioController(FuncionarioService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<List<Funcionario>> getAll(){
        return ResponseEntity.ok(service.buscarTodos());
    }

    @PostMapping
    public ResponseEntity<?> add(@RequestBody Funcionario funcionario){
        service.criarNovo(funcionario);
        return ResponseEntity.ok("Adicionado Com Reginaldo");
    }
}
