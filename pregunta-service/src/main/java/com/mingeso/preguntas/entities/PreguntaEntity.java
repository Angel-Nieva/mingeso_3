package com.mingeso.preguntas.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "pregunta")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PreguntaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long id;

    @Column(name = "enunciado", nullable = false)
    private String enunciado;

    @Column(name = "codigo", nullable = false)
    private String codigo;

    @Column(name = "respuesta", nullable = false)
    private String respuesta;
}
