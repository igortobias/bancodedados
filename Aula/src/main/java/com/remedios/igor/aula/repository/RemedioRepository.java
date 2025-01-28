package com.remedios.igor.aula.repository;

import com.remedios.igor.aula.model.Remedio;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RemedioRepository extends JpaRepository<Remedio, Long> {
}
