package com.bootcamp.databases.model;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "consultaExamen")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class ConsultaExamen {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idConsultaExamen;

    @Column(name = "examen", nullable = false)
    private Examen idExamen;

    @Column(name = "consulta", nullable = false)
    private Consulta idConsulta;
}
