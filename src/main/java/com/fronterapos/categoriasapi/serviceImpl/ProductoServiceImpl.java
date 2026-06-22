package com.fronterapos.categoriasapi.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fronterapos.categoriasapi.model.Producto;
import com.fronterapos.categoriasapi.repository.ProductoRepository;
import com.fronterapos.categoriasapi.service.ProductoService;

@Service
public class ProductoServiceImpl implements ProductoService {

    @Autowired
    private ProductoRepository productoRepository;

    @Override
    public Producto guardarProducto(Producto producto) {
        return productoRepository.save(producto);
    }

    @Override
    public List<Producto> listarProductos() {
        return productoRepository.findAll();
    }

    @Override
    public Producto buscarProducto(Long idProducto) {
        return productoRepository.findById(idProducto).orElse(null);
    }

    @Override
    public Producto actualizarProducto(Long idProducto, Producto producto) {

        producto.setIdProducto(idProducto);

        return productoRepository.save(producto);

    }

    @Override
    public void eliminarProducto(Long idProducto) {
        productoRepository.deleteById(idProducto);
    }

}