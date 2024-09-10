package com.examen.usuarios.service;

import com.examen.usuarios.model.Publicacion;
import com.examen.usuarios.repository.PublicacionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class PublicacionService {

    @Autowired
    private PublicacionRepository publicacionRepository;

    public Publicacion create(Publicacion publicacion) {

         Publicacion publicacionDB = publicacionRepository.save(publicacion);
         return publicacionDB;
    }
    public Publicacion read(Long id){
        Optional<Publicacion> publicacionOptional = publicacionRepository.findById(id);

        return publicacionOptional.isPresent()?publicacionOptional.get():new Publicacion();
    }
    public List<Publicacion> listar(){
        return publicacionRepository.findAll();
    }
}
