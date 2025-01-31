package com.remedios.igor.aula.dtos;

import com.remedios.igor.aula.enums.Via;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;

public record DadosatualizarRemedio(
        @NotNull
        Long id,

        @NotBlank(message = "O nome nao pode ser nulo")
        String nome,

        @NotNull
        Via    via,

        @NotBlank
        String lote,

        LocalDate validade,

        @NotNull
        Integer quantidade
)
{

}
