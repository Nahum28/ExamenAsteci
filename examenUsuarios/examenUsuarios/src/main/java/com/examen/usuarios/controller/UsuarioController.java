package com.examen.usuarios.controller;

import com.examen.usuarios.model.Usuario;
import com.examen.usuarios.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping("/")
    public List<Usuario> listar() {
        return usuarioService.listar();
    }
    @GetMapping("/{id}")
    public Usuario consultar(@PathVariable Long id) {
        return usuarioService.read(id);
    }
    @PostMapping("/")
    public Usuario crear(@RequestBody Usuario usuario) {
        return usuarioService.create(usuario);
    }
    @PutMapping("/")
    public Usuario actualizar(@RequestBody Usuario usuario) {
        return usuarioService.update(usuario);
    }

    @DeleteMapping("/{id}")
    public void borrar(@PathVariable Long id) {
        usuarioService.delete(id);
    }
}