package seccion7;

import java.util.Scanner;

public class MayorNumeros {
    public static void main(String[] args) {
        System.out.println("* * * Mayor de dos numeros * * *");
        var consola = new Scanner(System.in);

        System.out.print("Proporciona el numero 1: ");
        var num1 = Integer.parseInt(consola.nextLine());
        System.out.print("Proporciona el numero 2: ");
        var num2 = Integer.parseInt(consola.nextLine());

        if (num1 > num2)
            System.out.println("El numero " + num1 + " es mayor que el numero " + num2);
        else
            System.out.println("El numero " + num2 + " es mayor que el numero " + num1);
    }
}
