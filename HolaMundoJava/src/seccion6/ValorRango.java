package seccion6;

import java.util.Scanner;

public class ValorRango {
    public static void main(String[] args) {
        System.out.println("* * * Validar rango * * *");
        final var MINIMO = 0;
        final var MAXIMO = 5;
        var consola = new Scanner(System.in);

        System.out.print("Proporciona un dato entre 0 y 5: ");
        var dato = Integer.parseInt(consola.nextLine());
        var dentroRango = dato >= MINIMO && dato <= MAXIMO;
        System.out.println("dentroRango = " + dentroRango);
    }
}
