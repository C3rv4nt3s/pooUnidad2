/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller15;

public class MainProducto {

    public static void main(String[] args) {

        Producto producto =
                new Producto(
                        "Mouse",
                        50000
                );

        EtiquetaService etiqueta =
                new EtiquetaService();

        PrecioService precio =
                new PrecioService();

        etiqueta.generarEtiqueta(producto);

        System.out.println(
                "Precio con IVA: "
                + precio.calcularIVA(producto)
        );
    }
}
