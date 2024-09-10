package com.examen.usuarios.repository;

import com.examen.usuarios.model.Persona;
import com.examen.usuarios.model.Rol;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RolRepository extends JpaRepository<Rol, Long> {
}
