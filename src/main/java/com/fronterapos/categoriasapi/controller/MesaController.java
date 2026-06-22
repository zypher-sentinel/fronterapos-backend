package com.fronterapos.categoriasapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.fronterapos.categoriasapi.model.Mesa;
import com.fronterapos.categoriasapi.service.MesaService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/mesas")
public class MesaController {

    @Autowired
    private MesaService mesaService;

    @PostMapping
    public Mesa guardarMesa(@RequestBody Mesa mesa) {
        return mesaService.guardarMesa(mesa);
    }

    @GetMapping
    public List<Mesa> listarMesas() {
        return mesaService.listarMesas();
    }

    @GetMapping("/{id}")
    public Mesa buscarMesa(@PathVariable Long id) {
        return mesaService.buscarMesa(id);
    }

    @PutMapping("/{id}")
    public Mesa actualizarMesa(@PathVariable Long id,
                               @RequestBody Mesa mesa) {

        return mesaService.actualizarMesa(id, mesa);

    }

    @DeleteMapping("/{id}")
    public void eliminarMesa(@PathVariable Long id) {
        mesaService.eliminarMesa(id);
    }

}