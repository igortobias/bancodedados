package com.remedios.igor.aula.service;

import com.remedios.igor.aula.dtos.request.MedicoRequestDTO;
import com.remedios.igor.aula.model.Medico;
import com.remedios.igor.aula.repository.MedicoRepository;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class MedicoService {

    private MedicoRepository medicoRepository;

    public MedicoService(MedicoRepository medicoRepository) {
        this.medicoRepository = medicoRepository;
    }

    public void registrarMedico(MedicoRequestDTO dto) {
        Medico medico = new Medico(dto.nome(), dto.especialidade());
        this.registrarMedico(medico);
    }

    public Medico registrarMedico(Medico medico) {
        return medicoRepository.save(medico);
    }
}


