package com.remedios.igor.aula.controller;


import com.remedios.igor.aula.dtos.DadoscadastrarRemedio;
import com.remedios.igor.aula.model.Remedio;
import com.remedios.igor.aula.repository.RemedioRepository;
import com.remedios.igor.aula.service.RemedioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/remedio")
public class RemedController {

    @Autowired
    private RemedioService service;

    @PostMapping
    public void cadastrar (@RequestBody DadoscadastrarRemedio dados){
        service.ccreate(dados);
    }
}


