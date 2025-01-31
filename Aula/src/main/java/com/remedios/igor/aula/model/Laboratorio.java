package com.remedios.igor.aula.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name = "Laboratorio")
@Table(name = "laboratorio")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Laboratorio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private String provincia;

    private String distrito;

    private String bairro;

    private String quarteirao;

    private String avenida;

    private String celula;
}
