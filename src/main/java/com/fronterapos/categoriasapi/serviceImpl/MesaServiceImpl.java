package com.fronterapos.categoriasapi.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fronterapos.categoriasapi.model.Mesa;
import com.fronterapos.categoriasapi.repository.MesaRepository;
import com.fronterapos.categoriasapi.service.MesaService;

@Service
public class MesaServiceImpl implements MesaService {

    @Autowired
    private MesaRepository mesaRepository;

    @Override
    public Mesa guardarMesa(Mesa mesa) {
        return mesaRepository.save(mesa);
    }

    @Override
    public List<Mesa> listarMesas() {
        return mesaRepository.findAll();
    }

    @Override
    public Mesa buscarMesa(Long idMesa) {
        return mesaRepository.findById(idMesa).orElse(null);
    }

    @Override
    public Mesa actualizarMesa(Long idMesa, Mesa mesa) {

        mesa.setIdMesa(idMesa);

        return mesaRepository.save(mesa);

    }

    @Override
    public void eliminarMesa(Long idMesa) {
        mesaRepository.deleteById(idMesa);
    }

}