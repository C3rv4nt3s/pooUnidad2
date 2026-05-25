/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller7;

public class MainEmpleado {

    public static void main(String[] args) {

        Empleado empleado1 = new Empleado("Alexander", 2500000);

        empleado1.mostrarInformacion();

        empleado1.setSalario(3200000);

        System.out.println("Nuevo salario: " + empleado1.getSalario());
    }
}