package com.examen.usuarios.service;

import com.examen.usuarios.model.Persona;
import com.examen.usuarios.repository.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class PersonaService {

    @Autowired
    private PersonaRepository personaRepository;

    public Persona create(Persona persona) {

         Persona personaDB = personaRepository.save(persona);
         return personaDB;
    }
    public Persona read(Long id){
        Optional<Persona> personaOptional = personaRepository.findById(id);

        return personaOptional.isPresent()?personaOptional.get():new Persona();
    }
    public Persona update(Persona persona){
        Persona personaDB = personaRepository.save(persona);
        return personaDB;
    }
    public void delete(Long id){
        Persona persona = new Persona();
        persona.setId(id);
        personaRepository.delete(persona);
    }
    public List<Persona> listar(){
        return personaRepository.findAll();
    }
}
