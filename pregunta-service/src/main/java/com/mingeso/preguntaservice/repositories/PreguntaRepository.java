package com.mingeso.preguntaservice.repositories;

import com.mingeso.preguntaservice.entities.PreguntaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PreguntaRepository extends JpaRepository<PreguntaEntity, Integer> {
}
