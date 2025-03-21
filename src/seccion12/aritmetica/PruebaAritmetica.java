package seccion12.aritmetica;

public class PruebaAritmetica {
    public static void main(String[] args) {
        System.out.println("* * * Ejemplo aritmetica * * *");
        var aritmetica1 = new Aritmetica(5, 7);
        System.out.println("Atributo operando1: " + aritmetica1.getOperando1());
        aritmetica1.setOperando1(10);
        aritmetica1.setOperando2(15);
        aritmetica1.sumar();
        aritmetica1.restar();

        System.out.println();

        var aritmetica2 = new Aritmetica(12, 16);
        aritmetica2.sumar();
        aritmetica2.restar();

        System.out.println();

        var aritmetica3 = new Aritmetica();
        aritmetica3.sumar();
        aritmetica3.restar();

        aritmetica3.setOperando1(8);
        aritmetica3.setOperando2(12);
        aritmetica3.sumar();
        aritmetica3.restar();
    }
}
