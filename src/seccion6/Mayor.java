package seccion6;

import java.util.Scanner;

public class Mayor {
    public static void main(String args[]){
        Scanner lee = new Scanner(System.in);
        int num1;
        int num2;
        int mayor;

        System.out.print("Proporciona el numero 1: ");
        num1 = Integer.parseInt(lee.nextLine());
        System.out.print("Proporciona el numero 2: ");
        num2 = Integer.parseInt(lee.nextLine());

        mayor = (num1 > num2) ? num1 : num2;
        System.out.println("El numero mayor es: " + mayor);
    }
}
