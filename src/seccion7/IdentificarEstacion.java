package seccion7;

import java.util.Scanner;

public class IdentificarEstacion {
    public static void main(String[] args) {
        System.out.println("* * * Determinar estacion * * *");
        var consola = new Scanner(System.in);
        var estacion = "";

        System.out.print("Proporciona el numero de mes (1-12): ");
        var mes = Integer.parseInt(consola.nextLine());

        switch (mes){
            case 1, 2, 12:
                estacion = "invierno";
                break;
            case 3, 4, 5:
                estacion = "primavera";
                break;
            case 6, 7, 8:
                estacion = "verano";
                break;
            case 9, 10, 11:
                estacion = "Otoño";
                break;
            default:
                estacion = "desconocida";
        }

        System.out.println("Al mes " + mes + " corresponde la estacion " + estacion);
    }
}
