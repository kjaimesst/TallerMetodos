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
public class Exercise3Test {
    
    public Exercise3Test() {
    }

    @Test
    public void testExchangeDollarsAEuros() {
        System.out.println("exchangeDollarsAEuros");
        double dollars = 100;
        double expResult = 133.25;
        double result = Exercise3.exchangeDollarsAEuros(dollars);
        assertEquals(expResult, result, 0);
        fail("The test case is a prototype.");
    }
    
}
