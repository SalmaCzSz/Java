package seccion6;

import java.util.Scanner;

public class TicketVenta {
    public static void main(String[] args) {
        System.out.println("* * * Ticket de venta * * *");
        var consola = new Scanner(System.in);

        System.out.print("Precio leche: $");
        var precioLeche = Double.parseDouble(consola.nextLine());
        System.out.print("Precio pan: $");
        var precioPan = Double.parseDouble(consola.nextLine());
        System.out.print("Precio lechuga: $");
        var precioLechuga = Double.parseDouble(consola.nextLine());
        System.out.print("Precio platano: $");
        var precioPlatano = Double.parseDouble(consola.nextLine());

        // descuento
        System.out.print("¿Aplicar un descuento (%)? ");
        var descuentoPorcentaje  = Integer.parseInt(consola.nextLine());

        // calculo sin impuestos
        var subtotal = precioLeche + precioPan + precioLechuga + precioPlatano;
        // descuento
        var descuento = subtotal * (descuentoPorcentaje/100.0);
        // subtotal
        var subtotalConDescuento = subtotal - descuento;
        // calculo con impuestos
        var impuesto = subtotalConDescuento * 0.16;
        // calculo total
        var total = subtotalConDescuento + impuesto;

        System.out.printf("""
                --------------------------
                Ticket de venta
                --------------------------
                Subtotal: $%.2f
                Descuento: $%.2f (%d%%)
                Impuesto (16%%): $%.2f
                Total: $%.2f
                ---------------------------
                """, subtotal, descuento, descuentoPorcentaje, impuesto, total);


    }
}
