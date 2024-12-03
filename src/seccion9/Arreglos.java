package seccion9;

import java.util.Scanner;

public class Arreglos {
    public static void main(String[] args) {
        // declarar arreglo
        int[] enteros;

        // inicializar arreglo
        // int[] numeros = new int[2];
        enteros = new int[5];
        //var numeros = new int[2];

        // modificar los elementos
        enteros[0] = 13;
        enteros[1] = 21;
        enteros[4] = 62;

        // leer los elementos de un arreglo
        System.out.println("Valor 1: " + enteros[0]);
        System.out.println("Valor 2: " + enteros[1]);
        System.out.println("Valor 5: " + enteros[4]);

        // sintaxis simplificada
        var num = new int[]{100, 200, 300, 400, 500};
        for(var i = 0; i < num.length; i++){
            System.out.print(num[i] + " ");
        }

        // introducir valores
        System.out.println();
        System.out.println("* * * Arreglos dinámicos * * *");
        var consola = new Scanner(System.in);
        System.out.print("Proporciona el largo del arreglo: ");
        var largoArreglo = Integer.parseInt(consola.nextLine());
        var datosArreglo = new int[largoArreglo];
        // solicitar valores
        for(var i = 0; i < largoArreglo; i++){
            System.out.print("Proporciona entero[ " + i + " ] : ");
            datosArreglo[i] = Integer.parseInt(consola.nextLine());
        }
        // imprimir valores
        for(var i = 0; i < largoArreglo; i++){
            System.out.print(datosArreglo[i] + " ");
        }
    }
}
