/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.aplicacionentornos;

/**
 *
 * @author Administrador
 */
public class AplicacionEntornos {

    public static void main(String[] args) {
        Producto pro = new Producto("Galletas", 3.00, 1, 5);
        System.out.println(pro.toString());

        System.out.println("------------");

        Precio precio = new Precio();

        System.out.println(precio.precioConIva(pro));
        System.out.println(precio.precioTotal(pro.getUnidades()));

    }
}
