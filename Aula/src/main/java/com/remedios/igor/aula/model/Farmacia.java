package com.remedios.igor.aula.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity(name = "Farmacia")
@Table(name = "farmacia")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Farmacia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String endereco;

    @OneToMany(mappedBy = "farmacia", cascade = CascadeType.ALL)
    private List<Remedio> remedios;

    public Farmacia(String name, String endereco) {
    }
}
