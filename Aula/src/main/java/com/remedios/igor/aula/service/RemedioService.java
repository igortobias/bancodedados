package com.remedios.igor.aula.service;

import com.remedios.igor.aula.dtos.DadoscadastrarRemedio;
import com.remedios.igor.aula.model.Remedio;
import com.remedios.igor.aula.repository.RemedioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RemedioService {

    @Autowired
    private RemedioRepository repository;

    public Remedio criar(Remedio remedio){
        return repository.save(remedio);
    }

    public void ccreate(DadoscadastrarRemedio dto){
        Remedio remedio;

        remedio = new Remedio();
        remedio.setNome(dto.nome());
        remedio.setLote(dto.lote());
        remedio.setValidade(dto.validade());
        remedio.setQuantidade(dto.quantidade());
        remedio.setLaboratorio(dto.laboratorio());
        remedio.setVia(dto.via());

        criar(remedio);
    }
}
