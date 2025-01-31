package com.remedios.igor.aula.controller;

import com.remedios.igor.aula.dtos.LaboratorioRequestDTO;
import com.remedios.igor.aula.dtos.PacineteDTO;
import com.remedios.igor.aula.dtos.ResponseAPI;
import com.remedios.igor.aula.service.LaboratorioService;
import com.remedios.igor.aula.service.PacienteService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/paciente")
public class PacienteController {

    private final PacienteService service;

    public PacienteController(PacienteService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<ResponseAPI> cadastrarPaciente(@RequestBody PacineteDTO dto){
        service.criarPaciente(dto);
        return ResponseEntity.status(HttpStatus.CREATED).body(new ResponseAPI("Paciente cadastrado com sucesso", null));

    }
}