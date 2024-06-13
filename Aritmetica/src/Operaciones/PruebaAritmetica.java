package Operaciones;

public class PruebaAritmetica {

    public static void main(String[] args) {
        Aritmetica aritmetica = new Aritmetica();
        aritmetica.a = 2;
        aritmetica.b = 3;
        aritmetica.sumar();
        
        int resultadoRetorno = aritmetica.suma();
        System.out.println("resultado = " + resultadoRetorno);
        
        int resultadoArgumento = aritmetica.suma(aritmetica.a, aritmetica.b);
        System.out.println("resultado = " + resultadoArgumento);
    }
}
