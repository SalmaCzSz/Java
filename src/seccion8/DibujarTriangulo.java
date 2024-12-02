package seccion8;

import java.util.Scanner;

public class DibujarTriangulo {
    public static void main(String[] args) {
        System.out.println("* * * Dibujar un triángulo * * *");
        var consola = new Scanner(System.in);

        System.out.print("Proporciona el numero de filas: ");
        var numeroFilas = consola.nextInt();

        // iteramos sobre cada fila
        for(var fila = 1; fila <=numeroFilas; fila++){
            var espacios = " ".repeat(numeroFilas - fila);
            var asteriscos = "*".repeat(2 * fila - 1);
            System.out.println(espacios + asteriscos);
        }
    }
}
