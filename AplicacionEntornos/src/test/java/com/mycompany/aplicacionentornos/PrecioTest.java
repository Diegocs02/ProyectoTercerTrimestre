/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.aplicacionentornos;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Administrador
 */
public class PrecioTest {
    
    public PrecioTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of precioConIva method, of class Precio.
     */
    @Test
    public void testPrecioConIva() {
        System.out.println("precioConIva");
        Producto pro = null;
        Precio instance = new Precio();
        double expResult = 0.0;
        double result = instance.precioConIva(pro);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of precioTotal method, of class Precio.
     */
    @Test
    public void testPrecioTotal() {
        System.out.println("precioTotal");
        int unidades = 0;
        Precio instance = new Precio();
        double expResult = 0.0;
        double result = instance.precioTotal(unidades);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}