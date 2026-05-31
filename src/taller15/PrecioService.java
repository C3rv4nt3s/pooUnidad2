/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller15;

public class PrecioService {

    public double calcularIVA(
            Producto producto
    ) {

        return producto.getPrecio() * 1.19;
    }
}
