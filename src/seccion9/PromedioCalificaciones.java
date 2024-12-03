package seccion9;

import java.util.Scanner;

public class PromedioCalificaciones {
    public static void main(String[] args) {
        System.out.println("* * * Promedio de calificaciones * * *");
        var consola = new Scanner(System.in);

        System.out.print("¿Cuántas calificaciones deseas agregar? ");
        var tamArreglo = consola.nextInt();
        var arregloCalif = new Double[tamArreglo];
        var sumCalif = 0.0;
        var promedio = 0.0;
        
        for(var i = 0; i < tamArreglo; i++){
            System.out.print("Ingresa calificación [" + i + "] : ");
            arregloCalif[i] = consola.nextDouble();
            sumCalif += arregloCalif[i];
        }
        
        promedio = sumCalif/tamArreglo;
        System.out.println("promedio = " + promedio);
    }
}
