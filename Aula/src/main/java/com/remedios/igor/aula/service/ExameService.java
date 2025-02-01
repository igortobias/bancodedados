package com.remedios.igor.aula.service;

import com.remedios.igor.aula.dtos.request.ConsultaRequestDTO;
import com.remedios.igor.aula.dtos.request.ExameRequestDTO;
import com.remedios.igor.aula.model.Consulta;
import com.remedios.igor.aula.model.Exame;
import com.remedios.igor.aula.repository.ConsultaRepositoty;
import com.remedios.igor.aula.repository.ExameRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class ExameService {

    private ExameRepository exameRepository;

    public ExameService(ExameRepository exameRepository) {
        this.exameRepository = exameRepository;
    }

    public Exame criarExame(Exame exame){
        return exameRepository.save(exame);
    }


    public void criarExame(ExameRequestDTO dto){
        Exame exame;

        if (exameRepository.existsByconsultaId(dto.consultaId())){
            throw new ResponseStatusException(HttpStatus.CONFLICT, "Exame ja existe");
        }

        exame = new Exame (
                dto.tipo(),
                dto.resultado(),
                dto.consultaId(),
                dto.laboratorioId()
        );

        this.criarExame(exame);

    }
}

