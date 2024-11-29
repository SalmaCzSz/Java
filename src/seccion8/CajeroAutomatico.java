package seccion8;

import java.util.Scanner;

public class CajeroAutomatico {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);
        var salir = false;
        var montoCuenta = 1000.00;

        while(!salir) {
            System.out.println("* * * Cajero * * *");
            System.out.print("""
                    Menú
                    1. Consultar saldo
                    2. Retirar
                    3. Depositar
                    4. Salir
                    Escoge una opción:\s""");

            var opcion = consola.nextInt();

            switch (opcion) {
                case 1 -> System.out.printf("Tu saldo es: $%.2f%n%n", montoCuenta);
                case 2 -> {
                    System.out.print("Ingresa monto a retirar: ");
                    var montoRetiro = consola.nextDouble();

                    if (montoRetiro > montoCuenta) {
                        System.out.printf("Operacion no realizada. La cantidad máxima de retiro es: $%.2f%n%n", montoCuenta);
                    } else {
                        montoCuenta -= montoRetiro;
                        System.out.printf("Operacion realizada. Tu nuevo saldo es: $%.2f%n%n", montoCuenta);
                    }
                }
                case 3 -> {
                    System.out.print("Ingresa monto a depositar: ");
                    var montoDepositar = consola.nextDouble();
                    montoCuenta += montoDepositar;
                    System.out.printf("Operacion realizada. Tu nuevo saldo es: $%.2f%n%n", montoCuenta);
                }
                case 4 -> {
                    System.out.println("Saliendo del sistema. Hasta pronto!\n\n");
                    salir = true;
                }
                default -> System.out.println("Opcion inválida. Selecciona otra opción.\n\n");
            }
        }
    }
}
