package com.remedios.igor.aula.dtos.request;

import java.time.LocalDate;

public record ConsultaRequestDTO(
        LocalDate data,
        String diagnostico,
        Long medicoId,
        Long pacienteId,
        String exames
)
{

}


