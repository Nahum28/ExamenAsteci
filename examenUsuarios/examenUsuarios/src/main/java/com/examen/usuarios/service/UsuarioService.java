package com.examen.usuarios.service;

import com.examen.usuarios.model.Rol;
import com.examen.usuarios.model.Usuario;
import com.examen.usuarios.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public Usuario create(Usuario usuario) {

         Usuario usuarioDB = usuarioRepository.save(usuario);
         return usuarioDB;
    }
    public Usuario read(Long id){
        Optional<Usuario> usuarioOptional = usuarioRepository.findById(id);

        return usuarioOptional.isPresent()?usuarioOptional.get():new Usuario();
    }
    public Usuario update(Usuario usuario){
        Usuario usuarioDB = usuarioRepository.save(usuario);
        return usuarioDB;
    }
    public void delete(Long id){
        Usuario usuario = new Usuario();
        usuario.setId(id);
        usuarioRepository.delete(usuario);
    }
    public List<Usuario> listar(){
        return usuarioRepository.findAll();
    }
}
