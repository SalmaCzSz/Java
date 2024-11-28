package seccion7;

import java.util.Scanner;

public class DescuentosTienda {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);
        final var MONTO_MINIMO = 1000.00;
        var porcentajeDescuento = 0.0;

        System.out.println("* * * Tienda en linea * * *");
        System.out.print("¿Cual fue el monto de tu compra? ");
        var monto = Double.parseDouble(consola.nextLine());
        System.out.print("¿Eres miembro de la tienda? ");
        var miembro = Boolean.parseBoolean(consola.nextLine());

        if(monto > MONTO_MINIMO && miembro){
            porcentajeDescuento = 0.10;
        } else if( monto < MONTO_MINIMO && miembro){
            porcentajeDescuento = 0.05;
        }

        var montoDescuento = monto * porcentajeDescuento;
        var total = monto - montoDescuento;

        if(miembro)
            System.out.printf("""
                    \nFelicidades, has obtenido un descuento del %.0f%%
                    Monto de la compra: $%.2f
                    Monto del descuento: $%.2f
                    Monto final: $%.2f
                    """, porcentajeDescuento * 100, monto, montoDescuento, total);
        else
            System.out.printf("""
                    \nNo obtuviste ningun tipo de descuento
                    Te invitamos a hacerte miembro de la tienda
                    Monto final: $%.2f
                    """, total);
    }
}
