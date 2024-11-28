package seccion7;

import java.util.Scanner;

public class NumeroPositivo {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);

        System.out.println("* * * Valor positivo * * *");
        System.out.print("Proporciona un numero: ");
        var numero = Integer.parseInt(consola.nextLine());

        if(numero > 0){
            System.out.println(numero + " es positivo");
        } else if(numero < 0){
            System.out.println(numero + " es negativo");
        } else {
            System.out.println("Es numero 0");
        }
    }
}
