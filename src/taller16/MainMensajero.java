/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller16;

public class MainMensajero {

    public static void main(String[] args) {

        Mensajero email =
                new MensajeroEmail();

        Mensajero sms =
                new MensajeroSMS();

        Mensajero push =
                new MensajeroPush();

        email.enviar(
                "Hola mundo"
        );

        sms.enviar(
                "Hola mundo"
        );

        push.enviar(
                "Hola mundo"
        );
    }
}
