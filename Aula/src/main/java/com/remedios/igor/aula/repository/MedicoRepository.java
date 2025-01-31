package com.remedios.igor.aula.repository;

import com.remedios.igor.aula.model.Medico;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedicoRepository extends JpaRepository<Medico, Long> {
}
