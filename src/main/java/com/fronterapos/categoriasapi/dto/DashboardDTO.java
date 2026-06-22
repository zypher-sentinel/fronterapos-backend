package com.fronterapos.categoriasapi.dto;

public class DashboardDTO {

    private Long totalCategorias;
    private Long totalProductos;
    private Long totalMesas;
    private Long totalUsuarios;

    public DashboardDTO() {
    }

    public DashboardDTO(Long totalCategorias,
                        Long totalProductos,
                        Long totalMesas,
                        Long totalUsuarios) {

        this.totalCategorias = totalCategorias;
        this.totalProductos = totalProductos;
        this.totalMesas = totalMesas;
        this.totalUsuarios = totalUsuarios;
    }

    public Long getTotalCategorias() {
        return totalCategorias;
    }

    public void setTotalCategorias(Long totalCategorias) {
        this.totalCategorias = totalCategorias;
    }

    public Long getTotalProductos() {
        return totalProductos;
    }

    public void setTotalProductos(Long totalProductos) {
        this.totalProductos = totalProductos;
    }

    public Long getTotalMesas() {
        return totalMesas;
    }

    public void setTotalMesas(Long totalMesas) {
        this.totalMesas = totalMesas;
    }

    public Long getTotalUsuarios() {
        return totalUsuarios;
    }

    public void setTotalUsuarios(Long totalUsuarios) {
        this.totalUsuarios = totalUsuarios;
    }

}