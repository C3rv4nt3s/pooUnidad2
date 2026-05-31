/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller15;

public class ValidacionService {

    public boolean validar(
            Usuario usuario
    ) {

        return usuario
                .getNombre()
                != null;
    }
}
