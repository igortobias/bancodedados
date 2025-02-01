package com.remedios.igor.aula.repository;

import com.remedios.igor.aula.model.Consulta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConsultaRepositoty extends JpaRepository<Consulta, Long> {
    boolean existsBydiagnostico(String diagnostico);
}
