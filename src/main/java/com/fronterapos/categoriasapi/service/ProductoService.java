package com.fronterapos.categoriasapi.service;

import java.util.List;

import com.fronterapos.categoriasapi.model.Producto;

public interface ProductoService {

    Producto guardarProducto(Producto producto);

    List<Producto> listarProductos();

    Producto buscarProducto(Long idProducto);

    Producto actualizarProducto(Long idProducto, Producto producto);

    void eliminarProducto(Long idProducto);

}