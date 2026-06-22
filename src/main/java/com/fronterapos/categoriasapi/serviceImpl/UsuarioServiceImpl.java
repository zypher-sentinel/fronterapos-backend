package com.fronterapos.categoriasapi.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fronterapos.categoriasapi.model.Usuario;
import com.fronterapos.categoriasapi.repository.UsuarioRepository;
import com.fronterapos.categoriasapi.service.UsuarioService;

@Service
public class UsuarioServiceImpl implements UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    public Usuario guardarUsuario(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    @Override
    public String login(String username, String password) {

        Usuario usuarioEncontrado = usuarioRepository.findByUsername(username);

        if (usuarioEncontrado == null) {

            return "Usuario no encontrado";

        } else if (!usuarioEncontrado.getPassword().equals(password)) {

            return "Contraseña incorrecta";

        } else {

            return "Inicio exitoso";

        }

    }

}