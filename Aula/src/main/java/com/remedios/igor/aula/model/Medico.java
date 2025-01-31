package com.remedios.igor.aula.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Medico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String crm;
    private String especialidade;

    @OneToMany(mappedBy = "medico", cascade = CascadeType.ALL)
    private List<Consulta> consultas;
}
