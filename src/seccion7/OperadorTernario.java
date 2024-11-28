package seccion7;

public class OperadorTernario {
    public static void main(String[] args) {
        System.out.println("Operador ternario");
        /* condicion ? true : false */

        // determinar si un numero es par o no
        var numero = 5;
        var resultado = (numero % 2 == 0) ? "Par" : "Impar";
        System.out.println("El numero " + numero + " es " + resultado);

        // calcular si es mayor de edad
        var edad = 17;
        var mensaje = (edad >= 18) ? "eres mayor de edad" : "eres menor de edad";
        System.out.println("Al tener " + edad + " años tú " + mensaje);

        // valor positio, negativo o cero
        numero = 10;
        resultado = (numero > 0) ? "positivo" : (numero > 0) ? "negativo" : "cero";
        System.out.println("El numero " + numero + " es " + resultado);
    }
}
