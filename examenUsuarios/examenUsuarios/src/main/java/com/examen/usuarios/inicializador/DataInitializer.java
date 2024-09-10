package com.examen.usuarios.inicializador;

import com.examen.usuarios.model.*;
import com.examen.usuarios.repository.PersonaRepository;
import com.examen.usuarios.repository.PublicacionRepository;
import com.examen.usuarios.repository.RolRepository;
import com.examen.usuarios.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

@Configuration
public class DataInitializer {

    @Autowired
    private PersonaRepository personaRepository;
    @Autowired
    private RolRepository rolRepository;
    @Autowired
    private UsuarioRepository usuarioRepository;
    @Autowired
    private PublicacionRepository publicacionRepository;

    @Bean
    CommandLineRunner initData() {
        return args -> {
            Set<Rol> roles = new HashSet<>();
            roles.add(new Rol(null, "ADMIN"));
            roles.add(new Rol(null, "GENERAL"));
            rolRepository.saveAll(roles);

            usuarioRepository.save(new Usuario(null, "adminUser", "admin123", Estado.ACTIVO, roles ));
            Persona persona1 = new Persona(null, "Luis", "Hernandez", Sexo.MASCULINO, "Mexico", "Av. principal #10", null);
            personaRepository.save(persona1);

            Publicacion publicacion1 = new Publicacion(null, persona1, "Mi primer publicacion");
            Publicacion publicacion2 = new Publicacion(null, persona1, "Mi segunda publicacion");
            publicacionRepository.save(publicacion1);
            publicacionRepository.save(publicacion2);

        };
    }
}