package com.remedios.igor.aula.service;

import com.remedios.igor.aula.dtos.request.ConsultaRequestDTO;
import com.remedios.igor.aula.dtos.request.PacineteDTO;
import com.remedios.igor.aula.model.Consulta;
import com.remedios.igor.aula.model.Paciente;
import com.remedios.igor.aula.repository.ConsultaRepositoty;
import com.remedios.igor.aula.repository.PacienteRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;


@Service
public class ConsultaService {

    private final ConsultaRepositoty consultaRepositoty;

    public ConsultaService(ConsultaRepositoty consultaRepositoty) {
        this.consultaRepositoty = consultaRepositoty;
    }

    public Consulta crirConsulta(Consulta consulta){
        return consultaRepositoty.save(consulta);
    }


    public void criarConsulta(ConsultaRequestDTO dto){
        Consulta consulta;

        if (consultaRepositoty.existsBydiagnostico(dto.diagnostico())){
            throw new ResponseStatusException(HttpStatus.CONFLICT, "Consulta ja existe");
        }

        consulta = new Consulta (
                dto.diagnostico(),
                dto.medicoId(),
                dto.pacienteId(),
                dto.exames()
        );

        this.crirConsulta(consulta);

    }
}
