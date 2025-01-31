package com.remedios.igor.aula.service;

import com.remedios.igor.aula.dtos.request.LaboratorioRequestDTO;
import com.remedios.igor.aula.model.Laboratorio;
import com.remedios.igor.aula.repository.LaboratotioRepo;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class LaboratorioService {

    private final LaboratotioRepo laboratotioRepo;

    public LaboratorioService(LaboratotioRepo laboratotioRepo) {
        this.laboratotioRepo = laboratotioRepo;
    }

    public Laboratorio laboratorio(Laboratorio laboratorio){
        return laboratotioRepo.save(laboratorio);
    }

    public void criarLab(LaboratorioRequestDTO dto){
            Laboratorio laboratorio;

            if (laboratotioRepo.existsByNome(dto.nome())){
                throw new ResponseStatusException(HttpStatus.CONFLICT, "Laboratorio ja existe");
            }

       laboratorio = new Laboratorio (
                dto.nome(),
                dto.provincia(),
                dto.distrito(),
                dto.bairro(),
                dto.quarteirao(),
                dto.avenida(),
                dto.celula()
        );

            this.laboratorio(laboratorio);

    }

}
