package seccion10;

import java.util.Scanner;

public class DatosMatriz {
    public static void main(String[] args) {
        int renglones, columnas;
        var consola = new Scanner(System.in);

        System.out.print("Proporciona el numero de renglones: ");
        renglones = Integer.parseInt(consola.nextLine());
        System.out.print("Proporciona el numero de columnas: ");
        columnas = Integer.parseInt(consola.nextLine());

        var matriz = new int[renglones][columnas];

        for(var ren = 0; ren < renglones; ren++){
            for(var col = 0; col < columnas; col++){
                System.out.print("Valor [ " + ren + " ][ " + col + " ]:" );
                matriz[ren][col] =  Integer.parseInt(consola.nextLine());
            }
        }

        for(var ren = 0; ren < renglones; ren++){
            for(var col = 0; col < columnas; col++){
                System.out.println("Valor [ " + ren + " ][ " + col + " ] = " + matriz[ren][col]);
            }
        }
    }
}
