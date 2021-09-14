/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.seaborgium;

import java.util.Date;
import java.util.List;

/**
 *
 * @author Alexis
 */
public class Movimiento implements Comparable<Movimiento>{

    private int numeroDeMovimiento;
    Date Fecha;
    private MovimientoTipo Tipo;
    private Persona Destinatario;
    private List<MovimientoDetalle> Detalle;

    public Movimiento(int numeroDeMovimiento, Date Fecha, MovimientoTipo Tipo, Persona Destinatario, List<MovimientoDetalle> Detalle) {
        this.numeroDeMovimiento = numeroDeMovimiento;
        this.Fecha = Fecha;
        this.Tipo = Tipo;
        this.Destinatario = Destinatario;
        this.Detalle = Detalle;
    }

    public int getNumeroDeMovimiento() {
        return numeroDeMovimiento;
    }

    public void setNumeroDeMovimiento(int numeroDeMovimiento) {
        this.numeroDeMovimiento = numeroDeMovimiento;
    }

    public Date getFecha() {
        return Fecha;
    }

    public void setFecha(Date Fecha) {
        this.Fecha = Fecha;
    }

    public MovimientoTipo getTipo() {
        return Tipo;
    }

    public void setTipo(MovimientoTipo Tipo) {
        this.Tipo = Tipo;
    }

    public Persona getDestinatario() {
        return Destinatario;
    }

    public void setDestinatario(Persona Destinatario) {
        this.Destinatario = Destinatario;
    }

    public List<MovimientoDetalle> getDetalle() {
        return Detalle;
    }

    public void setDetalle(List<MovimientoDetalle> Detalle) {
        this.Detalle = Detalle;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 73 * hash + this.numeroDeMovimiento;
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
        final Movimiento other = (Movimiento) obj;
        if (this.numeroDeMovimiento != other.numeroDeMovimiento) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Movimiento{numeroDeMovimiento=").append(numeroDeMovimiento);
        sb.append(", Fecha=").append(Fecha);
        sb.append(", Tipo=").append(Tipo);
        sb.append(", Destinatario=").append(Destinatario);
        sb.append(", Detalle=").append(Detalle);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public int compareTo(Movimiento o) {
        int res=0;
        if (this.getNumeroDeMovimiento()>o.getNumeroDeMovimiento()) {
            res=1;
        }
        else if (this.getNumeroDeMovimiento()<o.getNumeroDeMovimiento()) {
            res=-1;
        }
        return res;
        }
}
