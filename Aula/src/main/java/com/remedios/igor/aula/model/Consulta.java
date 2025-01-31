package com.remedios.igor.aula.model;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
public class Consulta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate data;
    private String diagnostico;

    @ManyToOne
    @JoinColumn(name = "medico_id")
    private Medico medico;

    @ManyToOne
    @JoinColumn(name = "paciente_id")
    private Paciente paciente;

    @OneToMany(mappedBy = "consulta", cascade = CascadeType.ALL)
    private List<Exame> exames;
}
