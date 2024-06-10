package seccion6;

import java.util.Scanner;

public class SistemaCalificaciones {
    public static void main(String args[]) {
        Scanner lee = new Scanner(System.in);
        var calificacion = 0.0;
        var nota = "Valor desconocido";

        System.out.print("Ingresa un valor entre 0 y 10: ");
        calificacion = Double.parseDouble(lee.nextLine());

        /*switch (calificacion){
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
        } */

        if (calificacion >= 0 && calificacion < 6){
            nota = "F";
        } else if (calificacion >= 6 && calificacion < 7){
            nota = "D";
        } else if (calificacion >= 7 && calificacion < 8){
            nota = "C";
        } else if (calificacion >= 8 && calificacion < 9){
            nota = "B";
        } else if (calificacion >= 9 && calificacion <= 10){
            nota = "A";
        }

        System.out.println("nota = " + nota);
    }
}
