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
    }
}
