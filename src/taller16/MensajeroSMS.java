/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller16;

public class MensajeroSMS
        extends Mensajero {

    @Override
    public void enviar(
            String mensaje
    ) {

        System.out.println(
                "SMS: "
                + mensaje
        );
    }
}
