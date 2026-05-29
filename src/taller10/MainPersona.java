/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller10;

public class MainPersona {

    public static void main(String[] args) {

        Persona persona1 =
                new Persona();

        Persona estudiante1 =
                new Estudiante();

        Persona profesor1 =
                new Profesor();

        persona1.presentarse();

        estudiante1.presentarse();

        profesor1.presentarse();
    }
}
