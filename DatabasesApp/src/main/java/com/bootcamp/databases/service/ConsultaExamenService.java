package com.bootcamp.databases.service;

import com.bootcamp.databases.model.ConsultaExamen;

import java.util.List;

public interface ConsultaExamenService {
    public void registrar(ConsultaExamen c) throws Exception;

    public void modificar(ConsultaExamen c) throws Exception;

    public ConsultaExamen buscar(int id) throws Exception;

    public List<ConsultaExamen> listarTodos() throws Exception;
}
