package com.mingeso.preguntas.repositories;

import com.mingeso.preguntas.entities.PreguntaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PreguntaRepository extends JpaRepository<PreguntaEntity, Integer> {
}
