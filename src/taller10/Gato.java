/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller10;

public class Gato extends Animal {

    // ERROR porque cambia la firma
    @Override
    public void sonido(String tipo) {

        System.out.println(
                "Miau"
        );
    }
}
