package seccion3;

import java.sql.SQLOutput;
import java.util.Scanner;

/**
 *
 * @author Salma
 */
public class Variables {
    public static void main(String args[]){
        // definicion de variable
        int miVariableEntera = 10;
        System.out.println(miVariableEntera);
        
        // modificando el valor de la variable
        miVariableEntera = 5;
        System.out.println(miVariableEntera);
        
        String miVariableCadena = "Saludos";
        System.out.println(miVariableCadena);
        
        miVariableCadena = "Adios";
        System.out.println(miVariableCadena);
        
        
        // inferencia de tipos
        var miVariableEntera2 = 15;
        System.out.println(miVariableEntera2);

        var miVariableCadena2 = "Adios";
        System.out.println(miVariableCadena2);

        
        // concatenacion
        var usuario = "Juan";
        var titulo = "Ingeniero";
        var union = titulo + " " + usuario;
        System.out.println("union = " + union);

        var i = 3;
        var j = 4;
        System.out.println(i + j); // 7 -> devuelve la suma
        System.out.println(i + j + usuario); // 7Juan -> suma y concatena el nombre
        System.out.println(usuario + i + j); // Juan34 -> concatena toda la cadena
        System.out.println(usuario + (i + j)); // Juan7 -> concatena la cadena y el resultado de la suma


        // caracteres especiales
        String nombre = "Karla";
        System.out.println("Nueva linea: \n" + nombre);
        System.out.println("Tabulador: \t" + nombre);
        System.out.println("Retroceso: \'" + nombre + "\'");
        System.out.println("Comilla simple: \'" + nombre + "\'");
        System.out.println("Comilla doble: \"" + nombre + "\"");

        
        // Scanner
        Scanner lee = new Scanner(System.in);
        var user = "";
        var title = "";

        System.out.print("Escribe tu nombre: ");
        user = lee.nextLine();
        System.out.println("usuario = " + user);
        System.out.print("Escribe tu titulo: ");
        title = lee.nextLine();
        System.out.println("titulo = " + title);
        
        
        
        // Constantes
        System.out.println("* * * Constantes en Java * * *");
        final var DIAS_SEMANA = 7;
        System.out.println("DIAS_sEMANA = " + DIAS_SEMANA);
        //DIAS_SEMANA = 8;
        
        final var PI = 3.1416;
        System.out.println("Math.PI = " + Math.PI);
        
        final var MENSAJE_BIENVENIDA = "Bienvenid@ a la Universidad Java";
        System.out.println("MENSAJE_BIENVENIDA = " + MENSAJE_BIENVENIDA);
        
        final var MINUTOS_POR_SEGUNDO = 60;
        System.out.println("MINUTOS_POR_SEGUNDO = " + MINUTOS_POR_SEGUNDO);
    }
}
