/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller15;

public class MainLibro {

    public static void main(String[] args) {

        Libro libro =
                new Libro(
                        "Clean Code",
                        "Robert Martin"
                );

        ReporteLibroService reporte =
                new ReporteLibroService();

        LibroRepository repo =
                new LibroRepository();

        reporte.generarReporte(libro);

        repo.guardar(libro);
    }
}
