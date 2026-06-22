package com.fronterapos.categoriasapi.service;

import java.util.List;

import com.fronterapos.categoriasapi.model.Categoria;

public interface CategoriaService {

    public Categoria guardarCategoria(Categoria categoria);

    public List<Categoria> listarCategorias();

    public Categoria buscarCategoria(Long id);

    public Categoria actualizarCategoria(Categoria categoria);

    public void eliminarCategoria(Long id);

}