/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.aplicacionentornos;

/**
 *
 * @author dcast
 */
public class Producto {
    private String nombre;
    private double precio;
    private int idProducto;
    private int unidades;
    
    public Producto(String nombre, double precio, int idProducto, int unidades){
        this.nombre = nombre;
        this.precio = precio;
        this.idProducto = idProducto;
        this.unidades = unidades;
    }

    public double getPrecio() {
        return precio;
    }

    public int getUnidades() {
        return unidades;
    }
   
}
