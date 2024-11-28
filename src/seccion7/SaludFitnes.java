package seccion7;

import java.util.Scanner;

public class SaludFitnes {
    public static void main(String[] args) {
        System.out.println("* * * Salud y Fitnes * * *");
        final var META_PASOS_DIARIOS = 10000;
        final var CALORIAS_POR_PASO = 0.04;
        var consola = new Scanner(System.in);

        System.out.print("¿Cual es tu nombre? ");
        var nombre = consola.nextLine();
        System.out.print("¿Cuantos pasos has caminado hoy? ");
        var pasos = Integer.parseInt(consola.nextLine());

        var metaAlcanzada = (pasos >= META_PASOS_DIARIOS) ? "Si :)" : "No :(";
        var calorias = pasos * CALORIAS_POR_PASO;

        System.out.printf("""
                %nUsuario: %s
                -----------------------------
                Pasos dados hoy: %d
                Calorias quemadas: %.2f kcal
                Meta pasos alzanzada: %s
                ------------------------------
                La meta de pasos diarios es de %d pasos
                """, nombre, pasos, calorias, metaAlcanzada, META_PASOS_DIARIOS);
    }
}
