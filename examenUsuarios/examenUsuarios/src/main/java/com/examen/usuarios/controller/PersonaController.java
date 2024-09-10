package com.examen.usuarios.controller;

import com.examen.usuarios.model.Persona;
import com.examen.usuarios.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/persona")
public class PersonaController {

    @Autowired
    private PersonaService personaService;

    @GetMapping("/")
    public List<Persona> listar() {
        return personaService.listar();
    }
    @GetMapping("/{id}")
    public Persona consultar(@PathVariable Long id) {
        return personaService.read(id);
    }
    @PostMapping("/")
    public Persona crear(@RequestBody Persona persona) {
        return personaService.create(persona);
    }
    @PutMapping("/")
    public Persona actualizar(@RequestBody Persona persona) {
        return personaService.update(persona);
    }

    @DeleteMapping("/{id}")
    public void borrar(@PathVariable Long id) {
        personaService.delete(id);
    }
}