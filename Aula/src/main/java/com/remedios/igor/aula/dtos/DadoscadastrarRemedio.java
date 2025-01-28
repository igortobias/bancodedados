package com.remedios.igor.aula.dtos;

import com.remedios.igor.aula.enums.Laboratorio;
import com.remedios.igor.aula.enums.Via;

public record DadoscadastrarRemedio(
                String nome,
                Via via,
                String lote,
                String quantidade,
                String validade,
                Laboratorio laboratorio
) {
}
