package edu.comillas.icai.gitt.pat.spring.Cristina_P2.modelo;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;

public class Carrito {
    //evitamos valores negativos en ids, uds y precios
    @Positive
    private int idCarrito;
    @Positive
    private int idArticulo;
    @NotBlank
    private String descripcion;
    @Positive
    private int unidades;
    @Positive
    private double precioFinal;

    public Carrito(int idCarrito, int idArticulo, String descripcion, int unidades, double precioFinal) {
        this.idCarrito = idCarrito;
        this.idArticulo = idArticulo;
        this.descripcion = descripcion;
        this.unidades = unidades;
        this.precioFinal = precioFinal;
    }


    public int getIdCarrito() {
        return idCarrito;
    }

    public void setIdCarrito(int idCarrito) {
        this.idCarrito = idCarrito;
    }

    public int getIdArticulo() {
        return idArticulo;
    }

    public void setIdArticulo(int idArticulo) {
        this.idArticulo = idArticulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getUnidades() {
        return unidades;
    }

    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }

    public double getPrecioFinal() {
        return precioFinal;
    }

    public void setPrecioFinal(double precioFinal) {
        this.precioFinal = precioFinal;
    }


}