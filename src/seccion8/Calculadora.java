package seccion8;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);
        var salir = false;
        var num1 = 0.0;
        var num2 = 0.0;
        var resultado = 0.0;

        while(!salir) {
            System.out.println("* * * Calculadora * * *");
            System.out.print("""
                    Menú
                    1. Sumar
                    2. Restar
                    3. Multiplicar
                    4. Dividir
                    5. Salir
                    Escoge una opción:\s""");

            var opcion = consola.nextInt();

            if(opcion >=1 || opcion <= 4){
                System.out.print("Ingresa valor 1: ");
                num1 = consola.nextDouble();
                System.out.print("Ingresa valor 2: ");
                num2 = consola.nextDouble();
            }

            switch (opcion) {
                case 1 -> {
                    resultado = num1 + num2;
                    System.out.printf("El resultado de la suma es: %.2f%n%n", resultado);
                }
                case 2 -> {
                    resultado = num1 - num2;
                    System.out.printf("El resultado de la resta es: %.2f%n%n", resultado);
                }
                case 3 -> {
                    resultado = num1 * num2;
                    System.out.printf("El resultado de la multiplicacion es: %.2f%n%n", resultado);
                }
                case 4 -> {
                    if(num1 == 0 || num2 == 0){
                        System.out.println("No es posible divir entre 0");
                    } else {
                        resultado = num1 / num2;
                        System.out.printf("El resultado es: %.2f%n%n", resultado);
                    }
                }
                case 5 -> {
                    System.out.println("Saliendo del sistema. Hasta pronto!\n\n");
                    salir = true;
                }
                default -> System.out.println("Opcion inválida. Selecciona otra opción.\n\n");
            }
        }
    }
}
