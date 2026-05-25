/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller7;

public class CuentaBancaria {

    // atributos privados
    private String numeroCuenta;
    private double saldo;

    // atributo público
    public String tipoCuenta;

    // constructor
    public CuentaBancaria(String numeroCuenta, double saldo, String tipoCuenta) {

        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.tipoCuenta = tipoCuenta;
    }

    // getter saldo
    public double getSaldo() {
        return saldo;
    }

    // setter saldo
    public void setSaldo(double saldo) {

        if (saldo >= 0) {
            this.saldo = saldo;
        } else {
            System.out.println("El saldo no puede ser negativo.");
        }
    }

    // método público
    public void mostrarDetalles() {

        System.out.println("Número de cuenta: " + numeroCuenta);
        System.out.println("Saldo: " + saldo);
        System.out.println("Tipo de cuenta: " + tipoCuenta);
    }
}
