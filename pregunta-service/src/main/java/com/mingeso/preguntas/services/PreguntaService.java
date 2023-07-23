package com.mingeso.preguntas.services;

import com.mingeso.preguntas.repositories.PreguntaRepository;
import com.mingeso.preguntas.entities.PreguntaEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class PreguntaService {
    @Autowired
    private PreguntaRepository preguntasRepository;

    public ArrayList<PreguntaEntity> obtenerData(){
        return (ArrayList<PreguntaEntity>) preguntasRepository.findAll();
    }
}
