/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller15;

public class EtiquetaService {

    public void generarEtiqueta(
            Producto producto
    ) {

        System.out.println(
                "Etiqueta: "
                + producto.getNombre()
        );
    }
}
