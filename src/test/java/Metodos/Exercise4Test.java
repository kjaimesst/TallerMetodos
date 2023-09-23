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
public class Exercise4Test {
    
    public Exercise4Test() {
    }

    @Test
    public void testCalculate() {
        System.out.println("calculate");
        double radio = 2.8;
        int typeCalculation = 3;
        double expResult = 8.4;
        double result = Exercise4.calculate(radio, typeCalculation);
        assertEquals(expResult, result, 0);
        fail("The test case is a prototype.");
    }
    
}
