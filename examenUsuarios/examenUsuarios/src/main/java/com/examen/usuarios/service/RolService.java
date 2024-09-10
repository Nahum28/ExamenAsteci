package com.examen.usuarios.service;

import com.examen.usuarios.model.Rol;
import com.examen.usuarios.repository.RolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class RolService {

    @Autowired
    private RolRepository rolRepository;

    public Rol create(Rol rol) {

         Rol rolDB = rolRepository.save(rol);
         return rolDB;
    }
    public Rol read(Long id){
        Optional<Rol> rolOptional = rolRepository.findById(id);

        return rolOptional.isPresent()?rolOptional.get():new Rol();
    }
    public Rol update(Rol rol){
        Rol rolDB = rolRepository.save(rol);
        return rolDB;
    }
    public void delete(Long id){
        Rol rol = new Rol();
        rol.setId(id);
        rolRepository.delete(rol);
    }
    public List<Rol> listar(){
        return rolRepository.findAll();
    }
}
