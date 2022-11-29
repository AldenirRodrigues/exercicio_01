package com.example.exercicio_01;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/alunos")
public class Controller {

    Map<Integer, String> alunos = Map.of(
            1, "Guilherme Henrique Taira",
            2, "Jessica Roza da Silva",
            3, "Silvia Cristina de Oliveira Teixeira",
            4, " Lucas Marques Botan",
            5, "Aldenir Rodrigues Almeida"
    );

    @GetMapping("/{id}")
    public String findById(@PathVariable("id") Integer id){
        return alunos.get(id);
    }
    @GetMapping
    public Map<Integer, String> findAll() {
        return alunos;
    }


}
