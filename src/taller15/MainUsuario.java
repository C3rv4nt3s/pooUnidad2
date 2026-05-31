/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller15;

public class MainUsuario {

    public static void main(String[] args) {

        Usuario usuario =
                new Usuario(
                        "Alexander",
                        "1234"
                );

        AutenticacionService auth =
                new AutenticacionService();

        ValidacionService validacion =
                new ValidacionService();

        System.out.println(
                "Usuario valido: "
                + validacion.validar(usuario)
        );

        System.out.println(
                "Autenticado: "
                + auth.autenticar(
                        usuario,
                        "1234"
                )
        );
    }
}
