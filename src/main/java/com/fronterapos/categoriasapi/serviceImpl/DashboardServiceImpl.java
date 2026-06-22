package com.fronterapos.categoriasapi.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fronterapos.categoriasapi.dto.DashboardDTO;
import com.fronterapos.categoriasapi.repository.CategoriaRepository;
import com.fronterapos.categoriasapi.repository.MesaRepository;
import com.fronterapos.categoriasapi.repository.ProductoRepository;
import com.fronterapos.categoriasapi.repository.UsuarioRepository;
import com.fronterapos.categoriasapi.service.DashboardService;

@Service
public class DashboardServiceImpl implements DashboardService {

    @Autowired
    private CategoriaRepository categoriaRepository;

    @Autowired
    private ProductoRepository productoRepository;

    @Autowired
    private MesaRepository mesaRepository;

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    public DashboardDTO obtenerResumen() {

        Long totalCategorias = categoriaRepository.count();

        Long totalProductos = productoRepository.count();

        Long totalMesas = mesaRepository.count();

        Long totalUsuarios = usuarioRepository.count();

        return new DashboardDTO(
                totalCategorias,
                totalProductos,
                totalMesas,
                totalUsuarios
        );

    }

}