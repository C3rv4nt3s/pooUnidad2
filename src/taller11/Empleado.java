/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller11;

public abstract class Empleado {

    protected String nombre;

    public Empleado(String nombre) {

        this.nombre = nombre;
    }

    public abstract double calcularSalario();

    public void mostrarInformacion() {

        System.out.println(
                "Empleado: " + nombre
        );

        System.out.println(
                "Salario: "
                + calcularSalario()
        );
    }
}
