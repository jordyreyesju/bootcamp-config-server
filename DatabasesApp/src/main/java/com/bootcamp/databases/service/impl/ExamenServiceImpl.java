package com.bootcamp.databases.service.impl;


import com.bootcamp.databases.model.Examen;
import com.bootcamp.databases.repository.DetalleConsultaRepository;
import com.bootcamp.databases.repository.ExamenRepository;
import com.bootcamp.databases.service.ExamenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ExamenServiceImpl  implements ExamenService {

    @Autowired
    private ExamenRepository repo;

    @Override
    public void registrar(Examen e) throws Exception {
        repo.save(e);

    }

    @Override
    public void modificar(Examen e) throws Exception {
        repo.save(e);

    }

    @Override
    public Examen buscar(int id) throws Exception {
        Optional<Examen> op = repo.findById(id);
        return op.isPresent() ? op.get() : new Examen();
    }

    @Override
    public List<Examen> listarTodos() throws Exception {
        return repo.findAll();
    }
}
