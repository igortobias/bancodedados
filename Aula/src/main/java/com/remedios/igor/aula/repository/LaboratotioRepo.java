package com.remedios.igor.aula.repository;

import com.remedios.igor.aula.model.Laboratorio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LaboratotioRepo extends JpaRepository<Laboratorio, Long> {
    boolean existsByNome(String nome);

}

