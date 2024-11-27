package seccion6;

import java.util.Scanner;

public class RangoVariable {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);

        System.out.print("Proporciona un dato entero: ");
        var dato = Integer.parseInt(consola.nextLine());
        
        var dentroRango = dato >= 1 && dato <= 10;
        System.out.println("dentroRango = " + dentroRango);
        
        var fueraRango = !(dato >= 1 && dato <= 10);
        System.out.println("fueraRango = " + fueraRango);
    }
}
