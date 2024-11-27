package seccion5;

import java.util.Random;

public class NumerosAleatorios {
    public static void main(String[] args) {
        System.out.println("* * * Numeros aleatorios * * *");
        var random = new Random();

        // generar numero aleatorio entre 0 y 9
        var numeroAleatorio = random.nextInt(10);
        System.out.println("numeroAleatorio entre 0 y 9 = " + numeroAleatorio);

        numeroAleatorio = random.nextInt(10) + 1;
        System.out.println("numeroAleatorio entre 1 y 10 = " + numeroAleatorio);
        
        var flotanteAleatorio = random.nextFloat();
        System.out.println("flotanteAleatorio = " + flotanteAleatorio);
        
        // simular lanzamiento de un dado
        var dado = random.nextInt(6) + 1;
        System.out.println("dado = " + dado);
    }
}
