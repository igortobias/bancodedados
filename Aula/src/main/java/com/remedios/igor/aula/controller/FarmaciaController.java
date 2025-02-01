package com.remedios.igor.aula.controller;

import com.remedios.igor.aula.dtos.request.ExameRequestDTO;
import com.remedios.igor.aula.dtos.request.FarmaciaRequestDTO;
import com.remedios.igor.aula.dtos.response.ResponseAPI;
import com.remedios.igor.aula.service.FarmciaService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/farmacia")
public class FarmaciaController {

    private final FarmciaService service;

    public FarmaciaController(FarmciaService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<ResponseAPI> cadastrarExame(@RequestBody FarmaciaRequestDTO dto){
        service.registrarFarmacia(dto);
        return ResponseEntity.status(HttpStatus.CREATED).body(new ResponseAPI("Farmacia registrada com sucesso", null));

    }
}

