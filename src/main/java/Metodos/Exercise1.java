/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Metodos;

/**
 *
 * @author Oriana
 */
public class Exercise1 {
    
    public static double calculateDiscount(double price, double discount) {
        discount = discount / 100;
        double importDescuento = price * discount;
        double finalPrice = price - importDescuento;
        return finalPrice;

    }

}
