package com.fronterapos.categoriasapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fronterapos.categoriasapi.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long>{

}