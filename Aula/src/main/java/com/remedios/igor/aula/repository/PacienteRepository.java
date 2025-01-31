package com.remedios.igor.aula.repository;

import com.remedios.igor.aula.model.Paciente;
import com.remedios.igor.aula.model.Remedio;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PacienteRepository extends JpaRepository<Paciente, Long> {

    boolean existsByNome(String nome);

}