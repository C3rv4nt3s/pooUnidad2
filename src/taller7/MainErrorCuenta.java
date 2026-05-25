/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller7;

public class MainErrorCuenta {

    public static void main(String[] args) {

        CuentaBancaria cuenta1 =
                new CuentaBancaria(
                        "123456789",
                        500000,
                        "Ahorros"
                );

        // ERROR
        System.out.println(cuenta1.numeroCuenta);
    }
}
