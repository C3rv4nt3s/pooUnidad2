/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller13;

public class Pato
        implements Volador, Nadador {

    @Override
    public void volar() {

        System.out.println(
                "El pato esta volando."
        );
    }

    @Override
    public void nadar() {

        System.out.println(
                "El pato esta nadando."
        );
    }
}
