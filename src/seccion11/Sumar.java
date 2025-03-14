package seccion11;

public class Sumar {
    static int sumar(int a, int b){
        var resultado = a + b;

        return  resultado;
    }

    public static void main(String[] args) {
        int arg1 = 3, arg2 = 8;
        
        var resultado = sumar(arg1, arg2);
        System.out.println("resultado = " + resultado);
    }
}
