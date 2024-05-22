import java.util.Scanner;

public class TiposPrimitivos {
    public static void main(String args[]){
        /*
        * Tipos primitivos enteros
        * */
        byte numByte = (byte)10;
        System.out.println("Valor byte:" + numByte);
        System.out.println("Valor minimo byte: " + Byte.MIN_VALUE);
        System.out.println("Valor maximo byte: " + Byte.MAX_VALUE);


        short numShort = (short) 32768;
        System.out.println("Valor short: " + numShort);
        System.out.println("Valor minimo short: " + Short.MIN_VALUE);
        System.out.println("Valor maximo short: " + Short.MAX_VALUE);


        int numInt = (int)2147483648L; // L -> literal de tipo long
        System.out.println("Valor int: " + numInt);
        System.out.println("Valor minimo int: " + Integer.MIN_VALUE);
        System.out.println("Valor maximo int: " + Integer.MAX_VALUE);


        long numLong = 10;
        System.out.println("Valor long: " + numLong);
        System.out.println("Valor minimo long: " + Long.MIN_VALUE);
        System.out.println("Valor maximo long: " + Long.MAX_VALUE);



        /*
         * Tipos primitivos flotantes
         * */
        float numFloat = 10.0F; // F -> literal de tipo float
        System.out.println("Valor float: " + numFloat);
        System.out.println("Valor minimo float: " + Float.MIN_VALUE);
        System.out.println("Valor maximo float: " + Float.MAX_VALUE);


        double numDouble = 1.7676931348; // tipo de dato mas grande
        System.out.println("Valor double: " + numDouble);
        System.out.println("Valor minimo double: " + Double.MIN_VALUE);
        System.out.println("Valor maximo double: " + Double.MAX_VALUE);



        /*
         * Inferencia de tipos
         * */
        var numeroEntero = 10;
        System.out.println("numeroEntero = " + numeroEntero);
        
        var numeroDouble = 10.0;
        System.out.println("numeroDouble = " + numDouble);
        
        var numeroFloat = 10.0F;
        System.out.println("numeroFloat = " + numeroFloat);



        /*
         * char
         * */
        char miCaracter = 'a';
        System.out.println("miCaracter = " + miCaracter);

        char varChar = '\u0021'; // indicamos que vamos a usar un valor unicode
        System.out.println("varChar = " + varChar); // salida = !
        
        char varCharDecimal = 33; // representa el valor deimal asociado al caracter
        System.out.println("varCharDecimal = " + varCharDecimal); // salida = !

        char varCharSimbolo = '!';
        System.out.println("varCharSimbolo1 = " + varCharSimbolo); // salida = !

        var varChar1 = '\u0021';
        System.out.println("varChar1 = " + varChar1); // salida = !

        var varCharDecimal1 = 33;
        System.out.println("varCharDecimal1 = " + varCharDecimal1); // salida = 33

        var varCharSimbolo1 = '!';
        System.out.println("varCharSimbolo1 = " + varCharSimbolo1); // saida = !
        
        int variableEnteraSimbolo = '!'; // toma el codigo decimal asociado al simbolo
        System.out.println("variableEnteraSimbolo = " + variableEnteraSimbolo); // salida = 33
        
        int letra = 'a';
        System.out.println("letra = " + letra); // salida = 97



        /*
         * boolean
         * */
        boolean varBoolean = false;
        System.out.println("varBoolean = " + varBoolean);

        if(varBoolean){
            System.out.println("La bandera es verdadera");
        } else {
            System.out.println("La bandera es falsa");
        }

        var edad = 30;
        var esAdulto = edad >= 18;

        if(esAdulto){
            System.out.println("Eres mayor de edad");
        } else {
            System.out.println("Eres menor de edad");
        }
        
        
        
        /*
        * Conversión de tipos
        * */
        var anios = Integer.parseInt("20");
        System.out.println("anios = " + anios); 
        System.out.println("(anios + 1) = " + (anios + 1));
        
        var valorPI = Double.parseDouble("3.1416");
        System.out.println("valorPI = " + valorPI);
        
        var consola = new Scanner(System.in);
        System.out.print("Proporciona tu edad: ");
        edad = Integer.parseInt(consola.nextLine());
        System.out.println("edad = " + edad);
    }
}
