package Operaciones;

public class PruebaAritmetica {

    public static void main(String[] args) {
        /*Aritmetica aritmetica = new Aritmetica();
        aritmetica.a = 2;
        aritmetica.b = 3;
        aritmetica.sumar();
        
        int resultadoRetorno = aritmetica.suma();
        System.out.println("resultado = " + resultadoRetorno);
        
        int resultadoArgumento = aritmetica.suma(aritmetica.a, aritmetica.b);
        System.out.println("resultado = " + resultadoArgumento);*/



        Aritmetica aritmetica1 = new Aritmetica();
        System.out.println("Aritmetica a: " + aritmetica1.a); // 0
        System.out.println("Aritmetica b: " + aritmetica1.b); // 0

        Aritmetica aritmetica2 = new Aritmetica(5, 8);
        System.out.println("Aritmetica a: " + aritmetica2.a); // 5
        System.out.println("Aritmetica b: " + aritmetica2.b); // 8
    }
}
