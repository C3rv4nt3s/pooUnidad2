/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller7;

public class Empleado {

    // atributo público
    public String nombre;

    // atributo privado
    private double salario;

    // constructor
    public Empleado(String nombre, double salario) {
        this.nombre = nombre;
        setSalario(salario);
    }

    // getter
    public double getSalario() {
        return salario;
    }

    // setter con validación
    public void setSalario(double salario) {

        if (salario > 0) {
            this.salario = salario;
        } else {
            System.out.println("El salario no puede ser negativo.");
        }
    }

    // método público
    public void mostrarInformacion() {

        System.out.println("Nombre: " + nombre);
        System.out.println("Salario: " + salario);
    }
}