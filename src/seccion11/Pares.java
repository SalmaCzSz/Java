package seccion11;

import java.util.Scanner;

public class Pares {
    static boolean isPar(int numero){
        return (numero % 2 == 0 ? true : false);
    }
    public static void main(String[] args) {
        var consola = new Scanner(System.in);

        System.out.print("Ingresa un valor numérico: ");
        var numero = Integer.parseInt(consola.nextLine());

        System.out.println("¿Número par? " + isPar(numero));
    }
}
