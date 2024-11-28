package seccion7;

import java.util.Scanner;

public class SistemaBancario {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);

        System.out.println("Bienvenido al sistema bancario");
        System.out.print("¿Deseas salir del sistema (true/false)? ");
        var salirSistema = Boolean.parseBoolean(consola.nextLine());

        if(!salirSistema)
            System.out.println("Continuamos dentro del sistema...");
        else
            System.out.println("Saliendo del sistema...");
    }
}
