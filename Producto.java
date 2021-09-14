/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.seaborgium;

import java.util.Objects;

/**
 *
 * @author Alexis
 */
class Producto {

    private ProductoTipo Tipo;
    private ProductoMarca Marca;
    private String ProductoModelo;

    public Producto(ProductoTipo Tipo, ProductoMarca Marca, String ProductoModelo) {
        this.Tipo = Tipo;
        this.Marca = Marca;
        this.ProductoModelo = ProductoModelo;
    }

    public ProductoTipo getTipo() {
        return Tipo;
    }

    public void setTipo(ProductoTipo Tipo) {
        this.Tipo = Tipo;
    }

    public ProductoMarca getMarca() {
        return Marca;
    }

    public void setMarca(ProductoMarca Marca) {
        this.Marca = Marca;
    }

    public String getProductoModelo() {
        return ProductoModelo;
    }

    public void setProductoModelo(String ProductoModelo) {
        this.ProductoModelo = ProductoModelo;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 79 * hash + Objects.hashCode(this.Tipo);
        hash = 79 * hash + Objects.hashCode(this.Marca);
        hash = 79 * hash + Objects.hashCode(this.ProductoModelo);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Producto other = (Producto) obj;
        if (!Objects.equals(this.ProductoModelo, other.ProductoModelo)) {
            return false;
        }
        if (this.Tipo != other.Tipo) {
            return false;
        }
        if (!Objects.equals(this.Marca, other.Marca)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Producto{Tipo=").append(Tipo);
        sb.append(", Marca=").append(Marca);
        sb.append(", ProductoModelo=").append(ProductoModelo);
        sb.append('}');
        return sb.toString();
    }
}
