/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller15;

public class AutenticacionService {

    public boolean autenticar(
            Usuario usuario,
            String clave
    ) {

        return usuario
                .getContrasena()
                .equals(clave);
    }
}
