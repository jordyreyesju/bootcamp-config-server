package com.bootcamp.databases.controller;


import com.bootcamp.databases.model.Paciente;
import com.bootcamp.databases.service.PacienteService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/paciente")
public class PacienteController {

    private static final Logger logger = Logger.getLogger(PacienteController.class);

    @Autowired
    private PacienteService service;

    @PostMapping("/nuevo")
    public ResponseEntity<Paciente> registrar(@RequestBody Paciente p) {
        logger.info("Registrar nuevo Paciente");
        try {
            service.registrar(p);
            return ResponseEntity.ok(p);
        } catch (Exception e) {
            logger.error("No se pudo registrar el Paciente");
            logger.debug(e);
            return ResponseEntity.badRequest().body(p);
        }
    }

    @PutMapping("/actualizar")
    public ResponseEntity<Paciente> actualizar(@RequestBody Paciente p) throws Exception {
        service.registrar(p);
        return ResponseEntity.ok(p);
    }

    @GetMapping("/buscar")
    public ResponseEntity<Paciente> buscar(@RequestParam("id") int id) throws Exception {
        return ResponseEntity.ok(service.buscar(id));
    }

    @GetMapping("/listar")
    public ResponseEntity<List<Paciente>> listar() throws Exception {
        return ResponseEntity.ok(service.listarTodos());
    }

}
