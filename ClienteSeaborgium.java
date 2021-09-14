/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.seaborgium;
import java.util.Date;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Alexis
 */
public class ClienteSeaborgium {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona per0= new Persona("Juanito" , "Laguna");
        Persona per1= new Persona("Yanina","Flores");
        Persona per2= new Persona("Rodrigo","Kukiel");
        Persona per3= new Persona("Villalba","Hector");
        ProductoMarca mar0= new ProductoMarca("Samsung");
        ProductoMarca mar1= new ProductoMarca("Hyundai");
        ProductoMarca mar2= new ProductoMarca("Huawei");
        Producto pro0 = new Producto(ProductoTipo.GABINETE, mar0, "RTX");
        Producto pro1 = new Producto(ProductoTipo.MOUSE,mar2,"Gamer");
        Producto pro2 = new Producto(ProductoTipo.IMPRESORA,mar1,"LaserJetmw102");
        Producto pro3 = new Producto(ProductoTipo.TECLADO,mar0,"Obsoleto");
        Producto pro4 = new Producto(ProductoTipo.TECLADO,mar2,"AlexanderMagnus");
        List<MovimientoDetalle> compragenerica01= new ArrayList();
        compragenerica01.add(new MovimientoDetalle(pro0, 10));
        compragenerica01.add(new MovimientoDetalle(pro1, 50));
        List<MovimientoDetalle> venta1= new ArrayList();
        venta1.add(new MovimientoDetalle(pro0,1));
        List<MovimientoDetalle> supercompra0= new ArrayList();
        supercompra0.add(new MovimientoDetalle(pro1,87));
        supercompra0.add(new MovimientoDetalle(pro2,95));
        supercompra0.add(new MovimientoDetalle(pro3, 101));
        supercompra0.add(new MovimientoDetalle(pro4, 1000));
        List<MovimientoDetalle> oferta3= new ArrayList();
        oferta3.add(new MovimientoDetalle(pro1, 29));
        oferta3.add(new MovimientoDetalle(pro4,2));
        List<MovimientoDetalle> oferta00= new ArrayList();
        oferta00.add(new MovimientoDetalle(pro0, 5));
        oferta00.add(new MovimientoDetalle(pro3,10));
        Movimiento mov0= new Movimiento(321, new Date(2021, 1, 24),MovimientoTipo.ENTRADA,per0,compragenerica01);
        Movimiento mov1= new Movimiento(000, new Date (2018, 3, 24),MovimientoTipo.ENTRADA,per2,supercompra0);
        Movimiento mov2= new Movimiento(24587, new Date(2020, 11, 12), MovimientoTipo.SALIDA,per1,venta1);
        Movimiento mov3= new Movimiento(105, new Date( 2020, 4, 9), MovimientoTipo.SALIDA,per3,oferta3);
        Movimiento mov4= new Movimiento(4001, new Date(2021, 7, 27), MovimientoTipo.SALIDA, per2, oferta00);
        Movimiento mov5= new Movimiento(587, new Date(2020, 5, 6), MovimientoTipo.ENTRADA, per0, oferta00);
        StockAdmin stockPrincipal= new StockAdmin();
        stockPrincipal.agregar(mov0);
        stockPrincipal.agregar(mov1);
        stockPrincipal.agregar(mov2);
        stockPrincipal.agregar(mov3);
        stockPrincipal.agregar(mov4);
        stockPrincipal.agregar(mov5);
        System.out.println("Entradas");
        System.out.println(stockPrincipal.entradas());
        System.out.println("Salidas");
        System.out.println(stockPrincipal.salidas());
        System.out.println("Movimientos por Producto: ");
        System.out.println(stockPrincipal.movimientosPorProducto(pro0));
        System.out.println("Productos por Persona, (per2)");
        System.out.println(stockPrincipal.productosPorPersona(per2));
        System.out.println("Stock disponible");
        System.out.println(stockPrincipal.stock().toString());
        System.out.println("Stock por Tipo: ");
        System.out.println(stockPrincipal.stockPorTipo());
    }
    
}
