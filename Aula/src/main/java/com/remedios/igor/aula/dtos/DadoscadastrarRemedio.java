package com.remedios.igor.aula.dtos;

import com.remedios.igor.aula.enums.Via;
import jakarta.persistence.Enumerated;
import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.NotBlank;

import java.time.LocalDate;

public record DadoscadastrarRemedio(

                @NotBlank
                String nome,

                @Enumerated
                Via via,
                @NotBlank
                String lote,

                Integer quantidade,

                @Future
                LocalDate validade,

                Long laboratorioId
             )
  {
}
