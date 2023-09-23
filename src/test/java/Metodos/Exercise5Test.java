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
public class Exercise5Test {
    
    public Exercise5Test() {
    }

    @Test
    public void testDaysHoursMinutesSeconds() {
        System.out.println("daysHoursMinutesSeconds");
        int days = 2;
        int hours = 3;
        int minutes = 4;
        int expResult = 183;
        int result = Exercise5.daysHoursMinutesSeconds(days, hours, minutes);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }
    
}
