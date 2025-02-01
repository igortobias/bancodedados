package com.remedios.igor.aula.repository;

import com.remedios.igor.aula.model.Farmacia;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FarmaciaRepository extends JpaRepository<Farmacia, Long> {
    boolean existsBynome(String nome);
}
