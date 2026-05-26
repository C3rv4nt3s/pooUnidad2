/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller8;

public class Coche extends Vehiculo {

    private int numeroPuertas;

    public Coche(
            String marca,
            double velocidadMaxima,
            int numeroPuertas
    ) {

        super(marca, velocidadMaxima);

        this.numeroPuertas = numeroPuertas;
    }

    public void mostrarInformacionCoche() {

        mostrarInformacion();

        System.out.println("Numero de puertas: " + numeroPuertas);
    }
}
