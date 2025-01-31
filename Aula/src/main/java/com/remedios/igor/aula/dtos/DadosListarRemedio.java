package com.remedios.igor.aula.dtos;

import com.remedios.igor.aula.enums.Via;
import com.remedios.igor.aula.model.Remedio;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;

public record DadosListarRemedio(
        @NotNull
        Long id,
        String nome,
        Via via,
        String lote,
        LocalDate validade
) {

    public DadosListarRemedio(Remedio remedio) {

        this(
                remedio.getId(),
                remedio.getNome(),
                remedio.getVia(),
                remedio.getLote(),
                remedio.getValidade()
        );

}}
