/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller7;

public class MainCuenta {

    public static void main(String[] args) {

        CuentaBancaria cuenta1 =
                new CuentaBancaria(
                        "123456789",
                        500000,
                        "Ahorros"
                );

        cuenta1.mostrarDetalles();

        cuenta1.setSaldo(800000);

        System.out.println("Nuevo saldo: " + cuenta1.getSaldo());

        // acceso al atributo público
        System.out.println("Tipo de cuenta: " + cuenta1.tipoCuenta);
    }
}
