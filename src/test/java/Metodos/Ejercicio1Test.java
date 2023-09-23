/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package Metodos;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Oriana
 */
public class Ejercicio1Test {

    public Ejercicio1Test() {
    }

    @Test
    public void testCalculatedDiscount() {
        System.out.println("Calcular el descuento de un precio: ");
        double price = 10000;
        double discount = 40;
        double expResult = 7000;
        double result = (price * discount) / 100;
        assertEquals(expResult, result, 0);
    }
}
