package com.bootcamp.databases.service.impl;


import com.bootcamp.databases.model.ConsultaExamen;
import com.bootcamp.databases.repository.ConsultaExamenRepository;
import com.bootcamp.databases.service.ConsultaExamenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ConsultaExamenServiceImpl implements ConsultaExamenService {
    @Autowired
    private ConsultaExamenRepository repo;

    @Override
    public void registrar(ConsultaExamen c) throws Exception {
        repo.save(c);

    }

    @Override
    public void modificar(ConsultaExamen c) throws Exception {
        repo.save(c);

    }

    @Override
    public ConsultaExamen buscar(int id) throws Exception {
        Optional<ConsultaExamen> op = repo.findById(id);
        return op.isPresent() ? op.get() : new ConsultaExamen();
    }

    @Override
    public List<ConsultaExamen> listarTodos() throws Exception {
        return repo.findAll();
    }
}
