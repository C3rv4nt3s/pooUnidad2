/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller14;

public class Rectangulo extends Figura {

    private double base;
    private double altura;

    public Rectangulo(
            double base,
            double altura
    ) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public void calcularArea() {

        System.out.println(
                "Area del rectangulo: "
                + (base * altura)
        );
    }
}
