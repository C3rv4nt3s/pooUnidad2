/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller12;

public class Animal2
        implements Volador, Nadador {

    @Override
    public void volar() {

        System.out.println(
                "El animal esta volando."
        );
    }

    @Override
    public void nadar() {

        System.out.println(
                "El animal esta nadando."
        );
    }
}
