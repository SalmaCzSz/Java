package seccion7;

import java.util.Scanner;

public class SistemaEnvios {
    public static void main(String[] args) {
        System.out.println("* * * Sistema de envios * * *");
        var consola = new Scanner(System.in);
        final var TARIFA_NACIONAL = 10;
        final var TARIFA_INTERNACIONAL = 20;

        System.out.print("Ingresa el destino (nacional/internacional): ");
        var destino = consola.nextLine().strip().toLowerCase();
        System.out.print("Ingresa el peso del paquete (kg): ");
        var peso = Double.parseDouble(consola.nextLine());

        var costoEnvio = switch (destino){
            case "nacional" -> TARIFA_NACIONAL * peso;
            case "internacional" -> TARIFA_INTERNACIONAL * peso;
            default -> {
                System.out.println("Destino no válido");
                yield null;
            }
        };

        if (costoEnvio != null)
            System.out.println("El costo de envio es: $" + costoEnvio);
    }
}
