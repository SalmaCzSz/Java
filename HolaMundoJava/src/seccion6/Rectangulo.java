package seccion6;

import java.util.Scanner;

public class Rectangulo {
    public static void main(String args[]){
        Scanner lee = new Scanner(System.in);
        int alto;
        int ancho;
        int area;
        int perimetro;

        System.out.print("Proporciona el alto: ");
        alto = Integer.parseInt(lee.nextLine());
        System.out.print("Proporciona el ancho: ");
        ancho = lee.nextInt();

        area = ancho * alto;
        perimetro = (ancho + alto) * 2;

        System.out.println("Area = " + area);
        System.out.println("Perimetro = " + perimetro);
    }
}
