package com.fronterapos.categoriasapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fronterapos.categoriasapi.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

    public Usuario findByUsername(String username);

}