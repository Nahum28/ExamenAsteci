package com.examen.usuarios.controller;

import com.examen.usuarios.model.Rol;
import com.examen.usuarios.service.RolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rol")
public class RolController {

    @Autowired
    private RolService rolService;

    @GetMapping("/")
    public List<Rol> listar() {
        return rolService.listar();
    }
    @GetMapping("/{id}")
    public Rol consultar(@PathVariable Long id) {
        return rolService.read(id);
    }
    @PostMapping("/")
    public Rol crear(@RequestBody Rol rol) {
        return rolService.create(rol);
    }
    @PutMapping("/")
    public Rol actualizar(@RequestBody Rol rol) {
        return rolService.update(rol);
    }

    @DeleteMapping("/{id}")
    public void borrar(@PathVariable Long id) {
        rolService.delete(id);
    }
}