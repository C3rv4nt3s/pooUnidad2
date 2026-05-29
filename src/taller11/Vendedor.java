/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller11;

public class Vendedor extends Empleado {

    private double ventas;

    public Vendedor(
            String nombre,
            double ventas
    ) {

        super(nombre);

        this.ventas = ventas;
    }

    @Override
    public double calcularSalario() {

        return ventas * 0.10;
    }
}
