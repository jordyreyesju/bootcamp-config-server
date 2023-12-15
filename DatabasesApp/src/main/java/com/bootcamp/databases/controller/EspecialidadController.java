package com.bootcamp.databases.controller;


import com.bootcamp.databases.model.Especialidad;
import com.bootcamp.databases.service.EspecialidadService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/especialidad")
public class EspecialidadController {
    private static final Logger logger = Logger.getLogger(EspecialidadController.class);

    @Autowired
    private EspecialidadService service;

    @PostMapping("/nuevo")
    public ResponseEntity<Especialidad> registrar(@RequestBody Especialidad e) {
        logger.info("Registrar nuevo Especialidad");
        try {
            service.registrar(e);
            return ResponseEntity.ok(e);
        } catch (Exception a) {
            logger.error("No se pudo registrar el Especialidad");
            logger.debug(a);
            return ResponseEntity.badRequest().body(e);
        }
    }

    @PutMapping("/actualizar")
    public ResponseEntity<Especialidad> actualizar(@RequestBody Especialidad e) throws Exception {
        service.registrar(e);
        return ResponseEntity.ok(e);
    }

    @GetMapping("/buscar")
    public ResponseEntity<Especialidad> buscar(@RequestParam("id") int id) throws Exception {
        return ResponseEntity.ok(service.buscar(id));
    }

    @GetMapping("/listar")
    public ResponseEntity<List<Especialidad>> listar() throws Exception {
        return ResponseEntity.ok(service.listarTodos());
    }

}
