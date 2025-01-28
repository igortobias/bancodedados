package com.remedios.igor.aula.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name = "Teste")
@Table(name = "teste")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Teste {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;
}