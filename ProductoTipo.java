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
public enum ProductoTipo {
     GABINETE("Gabinete"), IMPRESORA("Impresora"), TECLADO("Teclado"), MOUSE("Mouse");
     private final String descripcion;

    private ProductoTipo(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }
     
}
