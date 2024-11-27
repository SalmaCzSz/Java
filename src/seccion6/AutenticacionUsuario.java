package seccion6;

import java.util.Scanner;

public class AutenticacionUsuario {
    public static void main(String[] args) {
        final var USUARIO = "ADMIN";
        final var PASSWORD = "Admin123";
        var consola = new Scanner(System.in);

        System.out.println("* * * Sistema autenticacion * * *");
        System.out.print("Ingresa el usuario: ");
        var user = consola.nextLine();
        System.out.print("Ingresa la contraseña: ");
        var pass = consola.nextLine();

        var datosCorrectos = USUARIO.equals(user) && PASSWORD.equals(pass);
        System.out.println("datosCorrectos = " + datosCorrectos);
    }
}
