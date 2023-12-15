package com.bootcamp.databases.controller;


import com.bootcamp.databases.model.Examen;
import com.bootcamp.databases.service.ExamenService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/examen")
public class ExamenController {
    private static final Logger logger = Logger.getLogger(ExamenController.class);

    @Autowired
    private ExamenService service;

    @PostMapping("/nuevo")
    public ResponseEntity<Examen> registrar(@RequestBody Examen e) {
        logger.info("Registrar nuevo Examen");
        try {
            service.registrar(e);
            return ResponseEntity.ok(e);
        } catch (Exception a) {
            logger.error("No se pudo registrar el Examen");
            logger.debug(a);
            return ResponseEntity.badRequest().body(e);
        }
    }

    @PutMapping("/actualizar")
    public ResponseEntity<Examen> actualizar(@RequestBody Examen e) throws Exception {
        service.registrar(e);
        return ResponseEntity.ok(e);
    }

    @GetMapping("/buscar")
    public ResponseEntity<Examen> buscar(@RequestParam("id") int id) throws Exception {
        return ResponseEntity.ok(service.buscar(id));
    }

    @GetMapping("/listar")
    public ResponseEntity<List<Examen>> listar() throws Exception {
        return ResponseEntity.ok(service.listarTodos());
    }
}
