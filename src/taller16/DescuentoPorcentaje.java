/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller16;

public class DescuentoPorcentaje
        extends Descuento {

    @Override
    public double aplicarDescuento(
            double precio
    ) {

        return precio * 0.90;
    }
}
