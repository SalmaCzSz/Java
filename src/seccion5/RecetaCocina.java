package seccion5;

import java.util.Scanner;

public class RecetaCocina {
    public static void main(String[] args) {
        System.out.println("* * * Recetas de cocina * * *");
        var consola = new Scanner(System.in);

        System.out.print("Ingresa el nombre: ");
        var nombre = consola.nextLine();
        System.out.print("Ingresa los ingredientes (separados por \',\'): ");
        var ingredientes = consola.nextLine();
        System.out.print("Ingresa el tiempo de preparacion (min): ");
        var tiempoPreparacion = Integer.parseInt(consola.nextLine());
        System.out.print("Ingresa el nivel de dificultad: ");
        var dificultad = consola.nextLine();

        System.out.println("- - - Receta - - -");
        System.out.println("Nombre receta: " + nombre);
        System.out.println("Ingredientes: " + ingredientes);
        System.out.println("Tiempo de preparacion: "+ tiempoPreparacion + " min");
        System.out.println("Nivel de dificultad: " + dificultad);
    }
}
