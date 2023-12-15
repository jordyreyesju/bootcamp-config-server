package com.bootcamp.databases.service.impl;


import com.bootcamp.databases.model.DetalleConsulta;
import com.bootcamp.databases.repository.DetalleConsultaRepository;
import com.bootcamp.databases.service.DetalleConsultaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DetalleConsultaServiceImpl implements DetalleConsultaService {
    @Autowired
    private DetalleConsultaRepository repo;

    @Override
    public void registrar(DetalleConsulta d) throws Exception {
        repo.save(d);

    }

    @Override
    public void modificar(DetalleConsulta d) throws Exception {
        repo.save(d);

    }

    @Override
    public DetalleConsulta buscar(int id) throws Exception {
        Optional<DetalleConsulta> op = repo.findById(id);
        return op.isPresent() ? op.get() : new DetalleConsulta();
    }

    @Override
    public List<DetalleConsulta> listarTodos() throws Exception {
        return repo.findAll();
    }
}
