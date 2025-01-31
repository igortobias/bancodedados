package com.remedios.igor.aula.controller;


import com.remedios.igor.aula.dtos.DadoscadastrarRemedio;
import com.remedios.igor.aula.enums.Via;
import com.remedios.igor.aula.model.Remedio;
import com.remedios.igor.aula.dtos.DadosListarRemedio;
import com.remedios.igor.aula.dtos.DadosatualizarRemedio;
import com.remedios.igor.aula.service.RemedioService;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/remedio")
public class RemedController {

    @Autowired
    private RemedioService service;

    @PostMapping
    @Transactional
    public void cadastrar (@RequestBody @Valid DadoscadastrarRemedio dados){

        service.create(dados);
    }

    @GetMapping
    public List<DadosListarRemedio> listar(
            @RequestParam(required = false) Via via
    ){
        return service.listar(via);
    }

    @PutMapping
    @Transactional
    public void atualizar(@RequestBody @Valid DadosatualizarRemedio dados) {
        service.atualizar(dados);
    }

    @DeleteMapping("/{id}")
    @Transactional
    public void excluir(@PathVariable Long id){
        service.deletarById(id);
    }

    @PatchMapping("/{id}")
    public Remedio atualizarParcialmente(@PathVariable Long id, @RequestBody Remedio remedioAtualizacao) {
        // Chama o serviço para processar a lógica
        return service.atualizarParcialmente(id, remedioAtualizacao);
    }

}



