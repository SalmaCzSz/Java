package seccion5;

import java.util.Random;
import java.util.Scanner;

public class GeneradorId {
    public static void main(String[] args) {
        System.out.println("* * * Generador ID * * *");
        var consola = new Scanner(System.in);
        var random = new Random();

        System.out.print("Ingresa tu nombre: ");
        var nombre = consola.nextLine();
        System.out.print("Ingresa tu apellido: ");
        var apellido = consola.nextLine();
        System.out.print("Ingresa tu año de nacimiento (YYYY): ");
        var anio = consola.nextLine();

        // normalizar valores
        var nom = nombre.trim().toUpperCase().substring(0, 2);
        var app = apellido.trim().toUpperCase().substring(0, 2);
        var yyyy = String.valueOf(anio).substring(2,4);
        var id = random.nextInt(9999) + 1;

        // formato de 4 digitos
        var idFormat = String.format("%04d", id);

        // id final
        var idFinal = nom.concat(app).concat(yyyy).concat(idFormat);

        System.out.printf("""
                \nHola %s,
                Tu nuevo ID es: %s
                """,
                nombre, idFinal);

    }
}
