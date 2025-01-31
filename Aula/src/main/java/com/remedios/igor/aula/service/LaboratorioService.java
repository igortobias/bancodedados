package com.remedios.igor.aula.service;

import com.remedios.igor.aula.dtos.LaboratorioRequestDTO;
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
        try {
            Laboratorio laboratorio;

            if (laboratotioRepo.existsByNome(dto.nome())){
                throw new ResponseStatusException(HttpStatus.CONFLICT, "Laboratorio ja existe");
            }

            laboratorio = new Laboratorio();
            laboratorio.setNome(dto.nome());
            laboratorio.setProvincia(dto.provincia());
            laboratorio.setDistrito(dto.distrito());
            laboratorio.setBairro(dto.bairro());
            laboratorio.setQuarteirao(dto.quarteirao());
            laboratorio.setAvenida(dto.avenida());
            laboratorio.setCelula(dto.celula());


            this.laboratorio(laboratorio);

        }catch (ResponseStatusException e){
            throw e;
        }catch (Exception e){
            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, "Ocorreu um erro ao criar laboratorio");
        }
    }
}
