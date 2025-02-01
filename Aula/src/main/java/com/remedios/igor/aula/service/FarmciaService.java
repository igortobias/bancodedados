package com.remedios.igor.aula.service;

import com.remedios.igor.aula.dtos.request.ExameRequestDTO;
import com.remedios.igor.aula.dtos.request.FarmaciaRequestDTO;
import com.remedios.igor.aula.model.Farmacia;
import com.remedios.igor.aula.repository.FarmaciaRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class FarmciaService {

    private FarmaciaRepository farmaciaRepository;

    public FarmciaService(FarmaciaRepository farmaciaRepository) {
        this.farmaciaRepository = farmaciaRepository;
    }

    public Farmacia registrarFarmacia(Farmacia farmacia){
        return farmaciaRepository.save(farmacia);
    }


    public void registrarFarmacia(FarmaciaRequestDTO dto){
        Farmacia farmacia;

        if (farmaciaRepository.existsBynome(dto.name())){
            throw new ResponseStatusException(HttpStatus.CONFLICT, "Farmacia ja existe");
        }

        farmacia = new Farmacia(
                dto.name(),
                dto.endereco()
        );

        this.registrarFarmacia(farmacia);

    }
    }


