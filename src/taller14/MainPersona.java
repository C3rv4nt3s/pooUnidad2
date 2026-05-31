/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller14;

public class MainPersona {

    public static void main(String[] args) {

        Persona persona1 =
                new Persona();

        Persona persona2 =
                new Estudiante();

        Persona persona3 =
                new Profesor();

        persona1.presentarse();

        persona2.presentarse();

        persona3.presentarse();
    }
}
