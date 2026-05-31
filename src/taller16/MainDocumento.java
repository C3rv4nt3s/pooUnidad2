/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller16;

public class MainDocumento {

    public static void main(String[] args) {

        Documento pdf =
                new DocumentoPDF();

        Documento word =
                new DocumentoWORD();

        Documento excel =
                new DocumentoExcel();

        pdf.exportar();

        word.exportar();

        excel.exportar();
    }
}
