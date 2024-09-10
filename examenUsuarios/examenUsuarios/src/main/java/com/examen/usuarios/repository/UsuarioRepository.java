package com.examen.usuarios.repository;

import com.examen.usuarios.model.Persona;
import com.examen.usuarios.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
