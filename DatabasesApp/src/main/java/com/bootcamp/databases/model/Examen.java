package com.bootcamp.databases.model;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "examen")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Examen {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idExamen;

    @Column(name = "nombre", nullable = false, length = 200)
    private String nombre;
    @Column(name = "descripcion", nullable = false, length = 250)
    private String descripcion;
}
