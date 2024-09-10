package com.examen.usuarios.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombres;
    private String apellidos;
    @Enumerated
    private Sexo sexo;
    private String pais;
    private String direccion;
    @OneToMany(fetch = FetchType.EAGER, mappedBy = "persona", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Publicacion> publicaciones;
}