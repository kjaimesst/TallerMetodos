/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Metodos;

/**
 *
 * @author Oriana
 */
public class Exercise6 {

    public static int convertSeconds(int seconds, String type) {
        int conversion;
        switch (type) {
            case "dias":
                conversion = seconds / 86400;
                break;
            case "horas":
                conversion = seconds / 3600;
                break;
            case "minutos":
                conversion = seconds / 60;
                break;
            default:
                return 0;
        }
        return conversion;
    }
}
