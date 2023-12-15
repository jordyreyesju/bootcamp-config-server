package com.bootcamp.databases.controller;


import com.bootcamp.databases.model.DetalleConsulta;
import com.bootcamp.databases.service.DetalleConsultaService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/detalleConsulta")
public class DetalleConsultaController {
    private static final Logger logger = Logger.getLogger(DetalleConsultaController.class);

    @Autowired
    private DetalleConsultaService service;

    @PostMapping("/nuevo")
    public ResponseEntity<DetalleConsulta> registrar(@RequestBody DetalleConsulta d) {
        logger.info("Registrar nuevo DetalleConsulta");
        try {
            service.registrar(d);
            return ResponseEntity.ok(d);
        } catch (Exception e) {
            logger.error("No se pudo registrar el DetalleConsulta");
            logger.debug(e);
            return ResponseEntity.badRequest().body(d);
        }
    }

    @PutMapping("/actualizar")
    public ResponseEntity<DetalleConsulta> actualizar(@RequestBody DetalleConsulta d) throws Exception {
        service.registrar(d);
        return ResponseEntity.ok(d);
    }

    @GetMapping("/buscar")
    public ResponseEntity<DetalleConsulta> buscar(@RequestParam("id") int id) throws Exception {
        return ResponseEntity.ok(service.buscar(id));
    }

    @GetMapping("/listar")
    public ResponseEntity<List<DetalleConsulta>> listar() throws Exception {
        return ResponseEntity.ok(service.listarTodos());
    }
}
