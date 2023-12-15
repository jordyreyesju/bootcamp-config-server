package com.bootcamp.databases.repository;

import com.bootcamp.databases.model.Examen;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ExamenRepository extends MongoRepository<Examen, Integer> {
}
