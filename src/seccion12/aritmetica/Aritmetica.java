package seccion12.aritmetica;

public class Aritmetica {
    int operando1;
    int operando2;

    public Aritmetica(){
    }

    public Aritmetica(int op1, int op2){
        System.out.println("Ejecutando constructor");
        this.operando1 = op1;
        this.operando2 = op2;
    }

    public void sumar(){
        var resultado = operando1 + operando2;
        System.out.println("resultado suma = " + resultado);
    }

    public void restar(){
        var resultado = operando1 - operando2;
        System.out.println("resultado resta = " + resultado);
    }
}
