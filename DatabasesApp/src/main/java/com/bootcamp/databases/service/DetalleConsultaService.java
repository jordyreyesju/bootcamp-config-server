package com.bootcamp.databases.service;

import com.bootcamp.databases.model.DetalleConsulta;

import java.util.List;

public interface DetalleConsultaService {
    public void registrar(DetalleConsulta m) throws Exception;

    public void modificar(DetalleConsulta c) throws Exception;

    public DetalleConsulta buscar(int id) throws Exception;

    public List<DetalleConsulta> listarTodos() throws Exception;
}
