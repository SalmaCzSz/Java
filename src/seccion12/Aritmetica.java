package seccion12;

public class Aritmetica {
    int operando1;
    int operando2;

    public Aritmetica(int op1, int op2){
        System.out.println("Ejecutando constructor");
        operando1 = op1;
        operando2 = op2;
    }

    void sumar(){
        var resultado = operando1 + operando2;
        System.out.println("resultado suma = " + resultado);
    }

    void restar(){
        var resultado = operando1 - operando2;
        System.out.println("resultado resta = " + resultado);
    }

    public static void main(String[] args) {
        System.out.println("* * * Ejemplo aritmetica * * *");
        var aritmetica1 = new Aritmetica(5, 7);
        //aritmetica1.operando1 = 5;
        //aritmetica1.operando2 = 7;
        aritmetica1.sumar();
        aritmetica1.restar();

        System.out.println();

        var aritmetica2 = new Aritmetica(12, 16);
        //aritmetica2.operando1 = 12;
        //aritmetica2.operando2 = 16;
        aritmetica2.sumar();
        aritmetica2.restar();
    }
}
