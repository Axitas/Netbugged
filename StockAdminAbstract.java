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
import java.util.ArrayList;  import java.util.Collections; import java.util.List;
public abstract class StockAdminAbstract {
    
    protected List<Movimiento> movimientosList;
    
    public StockAdminAbstract() { this.movimientosList = new ArrayList(); }
    
    public void agregar(Movimiento mov) { this.movimientosList.add(mov); }
    public void ordenar() { Collections.sort(movimientosList); }
    
    /** Devuelve todos los movimientos de salida de productos. */
    public abstract List<Movimiento> salidas();
    
    /** Devuelve todos los movimientos de ingreso de productos. */
    public abstract List<Movimiento> entradas();
    
    /** Devuelve todos los movimientos de un producto */
    public abstract List<Movimiento> movimientosPorProducto(Producto producto);
            
    /** Devuelve todos los productos entregados a una persona. */
    public abstract List<Producto> productosPorPersona(Persona persona);
        
    /** Devuelve el stock de productos actual */
    public abstract List<ProductoCantidad> stock();
    
    /** Devuelve el stock de productos por tipo */
    public abstract List<ProductoTipoCantidad> stockPorTipo();
    
    public String toString(){
        String res = "";
        
        for (Movimiento mov : movimientosList) { res += mov.toString() + "\n"; }
        
        return res;
    }
            
}
