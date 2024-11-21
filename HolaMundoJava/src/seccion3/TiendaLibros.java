package seccion3;

import java.util.Scanner;

public class TiendaLibros {
    public static void main(String args[]){
        String nombre;
        int id;
        double precio;
        boolean envioGratuito;
        Scanner lee = new Scanner(System.in);

        System.out.print("Proporciona el nombre del libro: ");
        nombre = lee.nextLine();
        System.out.print("Proporciona el id del libro: ");
        id = lee.nextInt();
        System.out.print("Proporciona el precio del libro: ");
        precio = lee.nextDouble();
        System.out.print("Proporciona si el envio del libro es gratuito: ");
        envioGratuito = lee.nextBoolean();

        System.out.println("* * * * * * * * * * \n" +
                           "R E S U M E N \n" +
                           "* * * * * * * * * *");
        System.out.println(nombre + " #" + id);
        System.out.println("Precio: $" + precio);
        System.out.println("Envio gratuito: " + envioGratuito);

    }
}
