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
public class Exercise6Test {
    
    public Exercise6Test() {
    }

    @Test
    public void testConvertSeconds() {
        System.out.println("convertSeconds");
        int seconds = 345;
        String type = "";
        int expResult = 23;
        int result = Exercise6.convertSeconds(seconds, type);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }
    
}
