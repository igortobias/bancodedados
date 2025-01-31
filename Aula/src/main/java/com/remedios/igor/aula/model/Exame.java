package com.remedios.igor.aula.model;

import jakarta.persistence.*;

@Entity
public class Exame {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String tipo;
    private String resultado;

    @ManyToOne
    @JoinColumn(name = "consulta_id")
    private Consulta consulta;

    @ManyToOne
    @JoinColumn(name = "laboratorio_id")
    private Laboratorio laboratorio;
}
