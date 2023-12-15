package com.bootcamp.databases.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.bootcamp.databases.model.DetalleConsulta;

public interface DetalleConsultaRepository extends MongoRepository<DetalleConsulta, Integer> {

}
