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
public class Exercise2Test {

    @Test
    public void testExercise2Constructor() {
        double perimeter = 10;
        double base = 5;
        double height = 2;
        double area = 10;

        Exercise2 exercise2 = new Exercise2(perimeter, base, height, area);
        assertEquals(perimeter, exercise2.perimeter, 0.0);
        assertEquals(area, exercise2.area, 0.0);
    }

}
