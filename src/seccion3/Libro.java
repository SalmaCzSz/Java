package seccion3;

import java.util.Scanner;

public class Libro {
    public static void main(String args[]){
        String titulo = "";
        String autor = "";
        Scanner lee = new Scanner(System.in);

        System.out.print("Proporciona el título del libro: ");
        titulo = lee.nextLine();
        System.out.print("Proporciona el autor del libro: ");
        autor = lee.nextLine();

        System.out.println("El libro '" + titulo + "' fue escrito por " + autor);
    }
}
