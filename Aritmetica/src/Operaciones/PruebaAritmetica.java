package Operaciones;

public class PruebaAritmetica {

    public static void main(String[] args) {
        Aritmetica aritmetica = new Aritmetica();
        aritmetica.a = 2;
        aritmetica.b = 3;
        aritmetica.sumar();
        
        int resultado = aritmetica.suma();
        System.out.println("resultado = " + resultado);
    }
}
