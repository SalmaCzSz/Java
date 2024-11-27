package seccion5;

import java.util.Scanner;

public class LeerTiposDatos {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);
        
        // leer int
        System.out.print("Inresa tu edad: ");
        var edad = consola.nextInt();
        System.out.println("edad = " + edad);

        // leer double
        System.out.print("Ingresa tu altura: ");
        var altura = consola.nextDouble();
        System.out.println("altura = " + altura);

        // consumimos el caracter de salto de línea para que no termine el proceso antes de dejar escribir el nombre
        consola.nextLine();

        // leer string
        System.out.print("Ingresa tu nombre: ");
        var nombre = consola.nextLine(); // lee saltos de línea
        System.out.println("nombre = " + nombre);


        // Conversion de datos
        System.out.print("Proporciona un valor entero: ");
        var enteroString = consola.nextLine();
        var entero = Integer.parseInt(enteroString);
        System.out.println("entero = " + entero);

        System.out.print("Proporciona un valor flotante: ");
        var flotante = Float.parseFloat(consola.nextLine());
        System.out.println("flotante = " + flotante);
    }
}
