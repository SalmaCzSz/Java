package seccion6;

import java.util.Scanner;

public class SistemaCalificaciones {
    public static void main(String args[]) {
        Scanner lee = new Scanner(System.in);
        var calificacion = 0;
        var nota = "Valor desconocido";

        System.out.print("Ingresa un valor entre 0 y 10: ");
        calificacion = Integer.parseInt(lee.nextLine());

        switch (calificacion){
            case 9: case 10:
                nota = "A";
                break;
            case 8:
                nota = "B";
                break;
            case 7:
                nota = "C";
                break;
            case 6:
                nota = "D";
                break;
            case 0: case 1: case 2: case 3: case 4: case 5:
                nota = "F";
                break;
        }

        System.out.println("nota = " + nota);
    }
}
