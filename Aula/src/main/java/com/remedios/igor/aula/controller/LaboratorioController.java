package com.remedios.igor.aula.controller;

import com.remedios.igor.aula.dtos.request.LaboratorioRequestDTO;
import com.remedios.igor.aula.dtos.response.ResponseAPI;
import com.remedios.igor.aula.service.LaboratorioService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/laboratorio")
public class LaboratorioController {

    private final LaboratorioService service;

    public LaboratorioController(LaboratorioService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<ResponseAPI> cadastrarLab(@RequestBody LaboratorioRequestDTO dto){
            service.criarLab(dto);
            return ResponseEntity.status(HttpStatus.CREATED).body(new ResponseAPI("Laboratorio criado com sucesso", null));

    }
}
