package seccion6;

import java.util.Scanner;

public class PrestamoLibros {
    public static void main(String[] args) {
        System.out.println("* * * Prestamo libros * * *");
        final var DISTANCIA_KM = 3;
        var consola = new Scanner(System.in);

        System.out.print("¿Cuentas con credencia de estudiante (true/false)? ");
        var tieneCredencial = Boolean.parseBoolean(consola.nextLine());
        System.out.print("¿A cuantos km vives de la biblioteca? ");
        var distanciaBiblioteca = Integer.parseInt(consola.nextLine());

        var elegiblePrestamo = tieneCredencial || distanciaBiblioteca <= DISTANCIA_KM;
        System.out.println("elegiblePrestamo = " + elegiblePrestamo);
    }
}
