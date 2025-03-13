package seccion10;

import java.util.Scanner;

public class SumaDiagonal {
    public static void main(String[] args) {
        int renglones;
        int columnas;
        var consola = new Scanner(System.in);

        System.out.print("Ingresa el número de filas: ");
        renglones = Integer.parseInt(consola.nextLine());
        System.out.print("Ingresa el número de columnas: ");
        columnas = Integer.parseInt(consola.nextLine());

        var matriz = new int[renglones][columnas];
        var suma = 0;

        for(var ren = 0; ren < renglones; ren++){
            for(var col = 0; col < columnas; col++){
                System.out.print("Valor [ " + ren + " ][ " + col + " ]:" );
                matriz[ren][col] =  Integer.parseInt(consola.nextLine());
            }
        }

        for(var ren = 0; ren < matriz.length; ren++){
            for(var col = 0; col < matriz[ren].length; col++){
                System.out.println("Valor [ " + ren + " ] [ " + col + " ] = " + matriz[ren][col]);

                if(ren == col){
                    suma += matriz[ren][col];
                }
            }
        }

        System.out.println("Suma diagonal: " + suma);
    }
}
