/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller12;

public class Persona2
        implements Hablador, Trabajador {

    @Override
    public void hablar() {

        System.out.println(
                "La persona esta hablando."
        );
    }

    @Override
    public void trabajar() {

        System.out.println(
                "La persona esta trabajando."
        );
    }
}
