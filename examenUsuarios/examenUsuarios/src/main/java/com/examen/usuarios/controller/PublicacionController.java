package com.examen.usuarios.controller;

import com.examen.usuarios.model.Publicacion;
import com.examen.usuarios.service.PublicacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/publicacion")
public class PublicacionController {

    @Autowired
    private PublicacionService publicacionService;

    @GetMapping("/")
    public List<Publicacion> listar() {
        return publicacionService.listar();
    }
    @GetMapping("/{id}")
    public Publicacion consultar(@PathVariable Long id) {
        return publicacionService.read(id);
    }
    @PostMapping("/")
    public Publicacion crear(@RequestBody Publicacion publicacion) {
        return publicacionService.create(publicacion);
    }
}