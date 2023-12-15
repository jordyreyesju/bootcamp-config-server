package com.bootcamp.databases.controller;


import com.bootcamp.databases.model.ConsultaExamen;
import com.bootcamp.databases.service.ConsultaExamenService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/consultaExamen")
public class ConsultaExamenController {
    private static final Logger logger = Logger.getLogger(ConsultaExamenController.class);

    @Autowired
    private ConsultaExamenService service;

    @PostMapping("/nuevo")
    public ResponseEntity<ConsultaExamen> registrar(@RequestBody ConsultaExamen c) {
        logger.info("Registrar nuevo ConsultaExamen");
        try {
            service.registrar(c);
            return ResponseEntity.ok(c);
        } catch (Exception e) {
            logger.error("No se pudo registrar el ConsultaExamen");
            logger.debug(e);
            return ResponseEntity.badRequest().body(c);
        }
    }

    @PutMapping("/actualizar")
    public ResponseEntity<ConsultaExamen> actualizar(@RequestBody ConsultaExamen c) throws Exception {
        service.registrar(c);
        return ResponseEntity.ok(c);
    }

    @GetMapping("/buscar")
    public ResponseEntity<ConsultaExamen> buscar(@RequestParam("id") int id) throws Exception {
        return ResponseEntity.ok(service.buscar(id));
    }

    @GetMapping("/listar")
    public ResponseEntity<List<ConsultaExamen>> listar() throws Exception {
        return ResponseEntity.ok(service.listarTodos());
    }

}
