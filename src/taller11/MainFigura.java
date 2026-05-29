/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller11;

public class MainFigura {

    public static void main(String[] args) {

        Figura figura1 =
                new Circulo(5);

        Figura figura2 =
                new Rectangulo(
                        10,
                        4
                );

        figura1.mostrarArea();

        figura2.mostrarArea();
    }
}
