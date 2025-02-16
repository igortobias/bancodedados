package com.remedios.igor.aula.controller;

import com.remedios.igor.aula.dtos.request.ConsultaRequestDTO;
import com.remedios.igor.aula.dtos.request.ExameRequestDTO;
import com.remedios.igor.aula.dtos.response.ResponseAPI;
import com.remedios.igor.aula.service.ConsultaService;
import com.remedios.igor.aula.service.ExameService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/exame")
public class ExameController {

    private final ExameService service;

    public ExameController(ExameService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<ResponseAPI> cadastrarExame(@RequestBody ExameRequestDTO dto){
        service.criarExame(dto);
        return ResponseEntity.status(HttpStatus.CREATED).body(new ResponseAPI("Exame cadastrado com sucesso", null));

    }
}
