package com.remedios.igor.aula.model;

import com.remedios.igor.aula.enums.Via;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;


@Entity (name = "Remedio")
@Table (name = "remedio")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Remedio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    @Enumerated(EnumType.STRING)
    private Via via;
    private String lote;
    private int quantidade;
    private LocalDate validade;

    @ManyToOne
    @JoinColumn(name = "laboratorio_id")
    private Laboratorio laboratorio;

    @ManyToOne
    @JoinColumn(name = "farmacia_id")
    private Farmacia farmacia;

}