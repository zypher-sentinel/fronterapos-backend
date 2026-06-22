package com.fronterapos.categoriasapi.service;

import com.fronterapos.categoriasapi.model.Usuario;

public interface UsuarioService {

    public Usuario guardarUsuario(Usuario usuario);

    public String login(String username, String password);

}