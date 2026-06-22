package com.fronterapos.categoriasapi.service;

import java.util.List;

import com.fronterapos.categoriasapi.model.Mesa;

public interface MesaService {

    Mesa guardarMesa(Mesa mesa);

    List<Mesa> listarMesas();

    Mesa buscarMesa(Long idMesa);

    Mesa actualizarMesa(Long idMesa, Mesa mesa);

    void eliminarMesa(Long idMesa);

}