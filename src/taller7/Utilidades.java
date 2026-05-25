/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package taller7;

public class Utilidades {

    // suma
    public static int sumar(int a, int b) {
        return a + b;
    }

    // resta
    public static int restar(int a, int b) {
        return a - b;
    }

    // multiplicación
    public static int multiplicar(int a, int b) {
        return a * b;
    }

    // división
    public static double dividir(double a, double b) {

        if (b != 0) {
            return a / b;
        } else {
            System.out.println("No se puede dividir entre cero.");
            return 0;
        }
    }
}