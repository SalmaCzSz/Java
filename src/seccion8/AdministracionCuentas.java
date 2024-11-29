package seccion8;

import java.util.Scanner;

public class AdministracionCuentas {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);
        var salir = false;

        while(!salir){
            System.out.println("* * * AdministracionCuentas * * *");
            System.out.print("""
                    Menú
                    1. Crear cuenta.
                    2. Eliminar cuenta
                    3. Salir
                    Escoge una opción:\s""");

            var opcion = consola.nextInt();

            switch (opcion){
                case 1 -> System.out.println("Creando tu cuenta...\n");
                case 2 -> System.out.print("Eliminando tu cuenta...\n");
                case 3 -> {
                    System.out.println("Saliendo del sistema. Hasta pronto!");
                    salir = true;
                }
                default -> System.out.println("Opcion inválida.");
            }
        }
    }
}
