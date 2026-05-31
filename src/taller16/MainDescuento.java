/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller16;

public class MainDescuento {

    public static void main(String[] args) {

        Descuento porcentaje =
                new DescuentoPorcentaje();

        Descuento fijo =
                new DescuentoFijo();

        System.out.println(
                porcentaje.aplicarDescuento(
                        100000
                )
        );

        System.out.println(
                fijo.aplicarDescuento(
                        100000
                )
        );
    }
}
