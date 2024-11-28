package seccion7;

import java.util.Scanner;

public class SistemaAutenticacion {
    public static void main(String[] args) {
        System.out.println("* * * Sistema autenticacion * * *");
        final var USUARIO = "ADMIN";
        final var PASSWORD = "Admin123.";
        var consola = new Scanner(System.in);

        System.out.print("Ingrese usuario: ");
        var user = consola.nextLine();
        System.out.print("Ingrese password: ");
        var pass = consola.nextLine();

        if(USUARIO.equals(user) && PASSWORD.equals(pass)){
            System.out.println("Bienvenido al sistema");
        } else if(USUARIO.equals(user) && !PASSWORD.equals(pass)){
            System.out.println("Password no válido");
        } else if(!USUARIO.equals(user) && PASSWORD.equals(pass)){
            System.out.println("Usuario no válido");
        } else {
            System.out.println("Usuario y password no válidos");
        }
    }
}
