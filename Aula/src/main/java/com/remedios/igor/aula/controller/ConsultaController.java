package com.remedios.igor.aula.controller;

import com.remedios.igor.aula.dtos.request.ConsultaRequestDTO;
import com.remedios.igor.aula.dtos.request.PacineteDTO;
import com.remedios.igor.aula.dtos.response.ResponseAPI;
import com.remedios.igor.aula.service.ConsultaService;
import com.remedios.igor.aula.service.PacienteService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


    @RestController
    @RequestMapping(value = "/api/consulta")
    public class ConsultaController {

        private final ConsultaService service;

        public ConsultaController(ConsultaService service) {
            this.service = service;
        }

        @PostMapping
        public ResponseEntity<ResponseAPI> cadastrarConsulta(@RequestBody ConsultaRequestDTO dto){
            service.criarConsulta(dto);
            return ResponseEntity.status(HttpStatus.CREATED).body(new ResponseAPI("Consulta cadastrada com sucesso", null));

        }
    }

