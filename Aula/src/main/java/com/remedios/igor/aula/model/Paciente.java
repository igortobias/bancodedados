package com.remedios.igor.aula.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name = "Paciente")
@Table(name = "Paciente")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Paciente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String BilhetedeIdentidade;
    private int idade;
    private String endereco;
    private String telefone;

    public Paciente(String nome, String bilhetedeidentidade, String endereco, int idade, String telefone) {
    }
}
