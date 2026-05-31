/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller16;

public class DescuentoFijo
        extends Descuento {

    @Override
    public double aplicarDescuento(
            double precio
    ) {

        return precio - 10000;
    }
}
