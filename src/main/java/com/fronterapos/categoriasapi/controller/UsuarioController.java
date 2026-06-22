package com.fronterapos.categoriasapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fronterapos.categoriasapi.model.Usuario;
import com.fronterapos.categoriasapi.service.UsuarioService;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @PostMapping
    public Usuario guardarUsuario(@RequestBody Usuario usuario) {

        return usuarioService.guardarUsuario(usuario);

    }

    @PostMapping("/login")
    public String login(@RequestBody Usuario usuario) {

        return usuarioService.login(
                usuario.getUsername(),
                usuario.getPassword());

    }

}