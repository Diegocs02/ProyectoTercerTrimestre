/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.aplicacionentornos;

import java.util.ArrayList;

/**
 *
 * @author dcast
 */
public class Precio {

    private double precio;
    private double precioIva;
    private double precioTotal;

    public double precioConIva(Producto pro) {
        precioIva = pro.getPrecio() * 1.21;

        if (precioIva < 0) {
            System.out.println("el precio no es válido");
            return 1;
        }

        return precioIva;

    }

    public double precioTotal(int unidades) {
        precioTotal = precioIva * unidades;

        if (precioIva < 0) {
            System.out.println("el precio no es válido");
            return 1;
        }

        return precioTotal;
    }
    
    

}
