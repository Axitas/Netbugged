/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.seaborgium;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Alexis
 */
public class StockAdmin extends StockAdminAbstract {

    public StockAdmin() {
        super();
    }

    @Override
    public List<Movimiento> salidas() {
        List<Movimiento> aDev = new ArrayList();
        movimientosList.stream().filter(e -> (e.getTipo() == MovimientoTipo.SALIDA)).forEachOrdered(e -> {
            aDev.add(e);
        });
        return aDev;
    }

    @Override
    public List<Movimiento> entradas() {
        List<Movimiento> aDev = new ArrayList();
        movimientosList.stream().filter(e -> (e.getTipo() == MovimientoTipo.ENTRADA)).forEachOrdered(e -> {
            aDev.add(e);
        });
        return aDev;
    }

    @Override
    public List<Movimiento> movimientosPorProducto(Producto producto) {
        List<Movimiento> aDev = new ArrayList();
        movimientosList.forEach(movimiento -> {
            movimiento.getDetalle().stream().filter(detalle -> (detalle.getProducto() == producto)).forEachOrdered(e -> {
                aDev.add(movimiento);
            });
        });

        return aDev;
    }

    @Override
    public List<Producto> productosPorPersona(Persona persona) {
        List<Producto> aDev = new ArrayList();
        movimientosList.stream().filter(movimiento -> (movimiento.getDestinatario() == persona)).forEachOrdered(movimiento -> {
            movimiento.getDetalle().forEach(e -> {
                aDev.add(e.getProducto());
            });
        });
        return aDev;
    }

    @Override
    public List<ProductoCantidad> stock() {
        List<ProductoCantidad> aDev = new ArrayList();
        for (Movimiento movimiento : movimientosList) {
            if (movimiento.getTipo() == MovimientoTipo.ENTRADA) {
                List<MovimientoDetalle> littleList = movimiento.getDetalle();
                for (MovimientoDetalle movimientoDetalle : littleList) {
                    ProductoCantidad aux = new ProductoCantidad(0, movimientoDetalle.getProducto());
                    if (!aDev.contains(aux)) {
                        aDev.add(new ProductoCantidad(movimientoDetalle.getCantidad(), movimientoDetalle.getProducto()));
                    } else if (aDev.contains(aux)) {
                        for (ProductoCantidad a : aDev) {
                            if (a.getProducto().equals(movimientoDetalle.getProducto())) {
                                a.agregarProducto(movimientoDetalle.getCantidad());
                            }

                        }
                    }
                }
            }
        else if (movimiento.getTipo() == MovimientoTipo.SALIDA) {
                List<MovimientoDetalle> littleList = movimiento.getDetalle();
                for (MovimientoDetalle movimientoDetalle : littleList) {
                    ProductoCantidad aux = new ProductoCantidad(0, movimientoDetalle.getProducto());
                    if (!aDev.contains(aux)) {
                        aDev.add(new ProductoCantidad(movimientoDetalle.getCantidad(), movimientoDetalle.getProducto()));
                    } else if (aDev.contains(aux)) {
                        for (ProductoCantidad a : aDev) {
                            if (a.getProducto().equals(movimientoDetalle.getProducto())) {
                                a.restarProducto(movimientoDetalle.getCantidad());
                            }

                        }
                    }
                }
            }
    }
    return aDev ;
}

@Override
public List<ProductoTipoCantidad> stockPorTipo() {
        List<ProductoTipoCantidad> aDev = new ArrayList();
        for (Movimiento movimiento : movimientosList) {
            if (movimiento.getTipo() == MovimientoTipo.ENTRADA) {
                List<MovimientoDetalle> littleList = movimiento.getDetalle();
                for (MovimientoDetalle movimientoDetalle : littleList) {
                    ProductoTipoCantidad aux = new ProductoTipoCantidad(0, movimientoDetalle.getProducto().getTipo());
                    if (!aDev.contains(aux)) {
                        aDev.add(new ProductoTipoCantidad(movimientoDetalle.getCantidad(), movimientoDetalle.getProducto().getTipo()));
                    } else if (aDev.contains(aux)) {
                        for (ProductoTipoCantidad a : aDev) {
                            if (a.getTipo().equals(movimientoDetalle.getProducto().getTipo())) {
                                a.agregarProductoTipo(movimientoDetalle.getCantidad());
                            }

                        }
                    }
                }
            }
        else if (movimiento.getTipo() == MovimientoTipo.SALIDA) {
                List<MovimientoDetalle> littleList = movimiento.getDetalle();
                for (MovimientoDetalle movimientoDetalle : littleList) {
                    ProductoTipoCantidad aux = new ProductoTipoCantidad(0, movimientoDetalle.getProducto().getTipo());
                    if (!aDev.contains(aux)) {
                        aDev.add(new ProductoTipoCantidad(movimientoDetalle.getCantidad(), movimientoDetalle.getProducto().getTipo()));
                    } else if (aDev.contains(aux)) {
                        for (ProductoTipoCantidad a : aDev) {
                            if (a.getTipo().equals(movimientoDetalle.getProducto().getTipo())) {
                                a.restarProductoTipo(movimientoDetalle.getCantidad());
                            }

                        }
                    }
                }
            }
    }
    return aDev ;
}
}
//new ProductoTipoCantidad(movimientoDetalle.getCantidad(),movimientoDetalle.getProducto().getTipo()));
