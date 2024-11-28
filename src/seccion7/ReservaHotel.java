package seccion7;

import java.util.Scanner;

public class ReservaHotel {
    public static void main(String[] args) {
        System.out.println("* * * Reserva hotel * * *");
        var consola = new Scanner(System.in);
        final var TARIFA_CON_VISTA_MAR = 190.50;
        final var TARIFA_SIN_VISTA_MAR = 150.50;

        System.out.print("¿Cuál es el nombre del cliente? ");
        var nombreCliente = consola.nextLine();
        System.out.print("¿Cuántos días se va a alojar? ");
        var diasEstancia = Integer.parseInt(consola.nextLine());
        System.out.print("¿Cuarto con vista al mar (true/false)?");
        var vistaMar = Boolean.parseBoolean(consola.nextLine());

        var tarifa = (vistaMar) ? TARIFA_CON_VISTA_MAR * diasEstancia : TARIFA_SIN_VISTA_MAR * diasEstancia;
        var mensaje = (vistaMar) ? "Si :)" : "No :(";

        System.out.printf("""
                %n* * * DETALLE RESERVA * * *
                Cliente: %s
                Dias estadia: %d
                Costo total: $%.2f
                Habitación con vista al mar: %s
                """, nombreCliente, diasEstancia, tarifa, mensaje);
    }
}
