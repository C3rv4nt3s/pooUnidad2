/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller14;

public class MainIncorrecto {

    public static void main(String[] args) {

        EjAnimal animal =
                new EjPerro();

        // ERROR:
        // correr() no existe
        // en Animal

        animal.correr();
    }
}
