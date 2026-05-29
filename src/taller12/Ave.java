/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller12;

public class Ave
        implements Volador, Cantante {

    @Override
    public void volar() {

        System.out.println(
                "El ave esta volando."
        );
    }

    @Override
    public void cantar() {

        System.out.println(
                "El ave esta cantando."
        );
    }
}
