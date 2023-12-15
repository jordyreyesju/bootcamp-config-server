package com.bootcamp.databases.service;

import com.bootcamp.databases.model.Consulta;

import java.util.List;

public interface ConsultaService {
    public void registrar(Consulta m) throws Exception;

    public void modificar(Consulta c) throws Exception;

    public Consulta buscar(int id) throws Exception;

    public List<Consulta> listarTodos() throws Exception;
}
