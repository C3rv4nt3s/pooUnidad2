/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller11;

public class MainEmpleado {

    public static void main(String[] args) {

        Gerente gerente1 =
                new Gerente(
                        "Alexander",
                        5000
                );

        Vendedor vendedor1 =
                new Vendedor(
                        "Carlos",
                        30000
                );

        gerente1.mostrarInformacion();

        vendedor1.mostrarInformacion();
    }
}
