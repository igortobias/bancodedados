package com.remedios.igor.aula.model;

import com.remedios.igor.aula.dtos.DadoscadastrarRemedio;
import com.remedios.igor.aula.enums.Laboratorio;
import com.remedios.igor.aula.enums.Via;
import jakarta.persistence.*;
import lombok.*;


@Entity (name = "Remedio")
@Table (name = "remedio")
public class Remedio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nome;
    @Enumerated(EnumType.STRING)
    private Via via;
    private String lote;
    private String quantidade;
    private String validade;
    @Enumerated(EnumType.STRING)
    private Laboratorio laboratorio;

    public Remedio(long id, String nome, Via via, String lote, String quantidade, String validade, Laboratorio laboratorio) {
        this.id = id;
        this.nome = nome;
        this.via = via;
        this.lote = lote;
        this.quantidade = quantidade;
        this.validade = validade;
        this.laboratorio = laboratorio;
    }

    public Remedio() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Via getVia() {
        return via;
    }

    public void setVia(Via via) {
        this.via = via;
    }

    public String getLote() {
        return lote;
    }

    public void setLote(String lote) {
        this.lote = lote;
    }

    public String getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(String quantidade) {
        this.quantidade = quantidade;
    }

    public String getValidade() {
        return validade;
    }

    public void setValidade(String validade) {
        this.validade = validade;
    }

    public Laboratorio getLaboratorio() {
        return laboratorio;
    }

    public void setLaboratorio(Laboratorio laboratorio) {
        this.laboratorio = laboratorio;
    }
}
