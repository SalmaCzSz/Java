package seccion5;

import java.util.Scanner;

public class SistemaEmpleado {
    public static void main(String[] args) {
        System.out.println("* * * Sistema de empleados * * *");

        var consola = new Scanner(System.in);

        System.out.print("Nombre del empleado: ");
        var nombreEmpleado = consola.nextLine();

        System.out.print("Edad del empleado: ");
        var edadEmpleado = Integer.parseInt(consola.nextLine());

        System.out.print("Salario del empleado: ");
        var salarioEmpleado = Double.parseDouble(consola.nextLine());

        System.out.print("¿Es jefe de departamento?: ");
        var esJefe = Boolean.parseBoolean(consola.nextLine());

        System.out.println("\nDatos del empleado");
        System.out.println("\tNombre: " + nombreEmpleado);
        System.out.println("\tEdad: " + edadEmpleado);
        System.out.printf("\tSalario: $%.2f%n", salarioEmpleado);
        System.out.println("\tEs jefe: " + esJefe);
    }
}
