/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.seaborgium;

/**
 *
 * @author Alexis
 */
class ProductoTipoCantidad {
    private int cantidad;
    private ProductoTipo tipo;

    public ProductoTipoCantidad(int cantidad, ProductoTipo tipo) {
        this.cantidad = cantidad;
        this.tipo = tipo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public ProductoTipo getTipo() {
        return  this.tipo;
    }

    public void setProductoTipo(ProductoTipo tipo) {
        this.tipo = tipo;
    }
    
    public void agregarProductoTipo(int aeo){
        this.cantidad+=aeo;
    }
    public void restarProductoTipo(int aeo){
        this.cantidad-=aeo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ProductoTipoCantidad{cantidad=").append(cantidad);
        sb.append(", tipo=").append(tipo);
        sb.append('}');
        return sb.toString();
    }
    
}
