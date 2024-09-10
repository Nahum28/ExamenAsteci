package com.examen.usuarios.repository;

import com.examen.usuarios.model.Persona;
import com.examen.usuarios.model.Publicacion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PublicacionRepository extends JpaRepository<Publicacion, Long> {
}
