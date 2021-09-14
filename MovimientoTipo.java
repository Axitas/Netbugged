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
public enum MovimientoTipo {
    ENTRADA,
    SALIDA;

    public static MovimientoTipo getENTRADA() {
        return ENTRADA;
    }

    public static MovimientoTipo getSALIDA() {
        return SALIDA;
    }

    @Override
    public String toString() {
        return "MovimientoTipo{" + '}';
    }
    
}
