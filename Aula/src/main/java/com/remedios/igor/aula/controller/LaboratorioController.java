package com.remedios.igor.aula.controller;

import com.remedios.igor.aula.dtos.LaboratorioRequestDTO;
import com.remedios.igor.aula.dtos.ResponseAPI;
import com.remedios.igor.aula.service.LaboratorioService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

@RestController
@RequestMapping(value = "/api/laboratorio")
public class LaboratorioController {

    private final LaboratorioService service;

    public LaboratorioController(LaboratorioService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<ResponseAPI> cadastrarLab(@RequestBody LaboratorioRequestDTO dto){
        try {
            service.criarLab(dto);
            return ResponseEntity.status(HttpStatus.CREATED).body(new ResponseAPI("Laboratorio criado com sucesso", null));
        }catch (ResponseStatusException e){
            return ResponseEntity.status(e.getStatusCode()).body(new ResponseAPI(e.getMessage(), null));
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(new ResponseAPI("Ocorreu um erro ao criar laboratorio", null));
        }
    }
}
