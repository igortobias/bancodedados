package com.remedios.igor.aula.controller;

import com.remedios.igor.aula.dtos.request.ExameRequestDTO;
import com.remedios.igor.aula.dtos.request.MedicoRequestDTO;
import com.remedios.igor.aula.dtos.response.ResponseAPI;
import com.remedios.igor.aula.model.Medico;
import com.remedios.igor.aula.service.ExameService;
import com.remedios.igor.aula.service.MedicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/medico")
public class MedicoController {

    private final MedicoService service;

    public MedicoController(MedicoService service) {
        this.service = service;
    }


    @PostMapping
    public ResponseEntity<ResponseAPI> registrarMedico(@RequestBody MedicoRequestDTO dto){
        service.registrarMedico(dto);
        return ResponseEntity.status(HttpStatus.CREATED).body(new ResponseAPI("Medico cadastrado com sucesso", null));

    }
}
