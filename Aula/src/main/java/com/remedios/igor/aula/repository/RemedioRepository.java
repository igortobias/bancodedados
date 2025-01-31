package com.remedios.igor.aula.repository;

import com.remedios.igor.aula.enums.Via;
import com.remedios.igor.aula.model.Remedio;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Arrays;
import java.util.List;

public interface RemedioRepository extends JpaRepository<Remedio, Long> {

    List<Remedio> findByVia(Via via);
}
