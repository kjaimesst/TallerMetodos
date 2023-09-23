/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Metodos;

import static java.lang.Math.PI;

/**
 *
 * @author Oriana
 */
public class Exercise4 {

    public static double calculate(double radio, int typeCalculation) {
        double result = 0;
        switch (typeCalculation) {
            case 1: //Perimetro
                result = 2 * PI * radio;
                break;
            case 2: //Area
                result = PI * Math.pow(radio, 2);
                break;
            case 3: //Volumen de la esfera 
                result = (4 * PI * Math.pow(radio, 3)) / 3;
                break;
            default:
                System.out.println("");
                break;
        }
        return result;
    }
}
