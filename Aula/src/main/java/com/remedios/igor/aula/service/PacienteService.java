package com.remedios.igor.aula.service;

import com.remedios.igor.aula.dtos.request.PacineteDTO;
import com.remedios.igor.aula.model.Paciente;
import com.remedios.igor.aula.repository.PacienteRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class PacienteService {

    private final PacienteRepository pacienteRepository;

    public PacienteService(PacienteRepository pacienteRepository) {
        this.pacienteRepository = pacienteRepository;
    }

    public Paciente crirPaciente(Paciente paciente){
        return pacienteRepository.save(paciente);
    }


    public void criarPaciente(PacineteDTO dto){
        Paciente paciente;

        if (pacienteRepository.existsByNome(dto.nome())){
            throw new ResponseStatusException(HttpStatus.CONFLICT, "Paciente ja existe");
        }

        paciente = new Paciente (
                dto.nome(),
                dto.Bilhetedeidentidade(),
                dto.endereco(),
                dto.idade(),
                dto.telefone()
        );

        this.crirPaciente(paciente);

    }
}
