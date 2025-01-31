package com.remedios.igor.aula.dtos.request;

public record ExameRequestDTO(
        String tipo,
        String resultado,
        Long consultaId,
        Long laboratorioId
) {}

