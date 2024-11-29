package seccion8;

import java.util.Random;
import java.util.Scanner;

public class JuegoAdivinanza {
    public static void main(String[] args) {
        System.out.println("* * * Numero secreto * * *");
        var consola = new Scanner(System.in);
        var intentos = 1;
        var random = new Random();
        var numeroAdivinar = random.nextInt(50) + 1;
        var intentoCorrecto = false;

        System.out.println("Generando numero aleatorio...");
        while (intentos <= 10 && !intentoCorrecto){
            System.out.print("Ingresa el numero que crees que salio (1 - 50): ");
            var numero = consola.nextInt();

            if(numeroAdivinar == numero) {
                System.out.printf("""
                        Felicidades!
                        El número secreto si era %d
                        Acertaste en %d intentos
                        """, numeroAdivinar, intentos);
                intentoCorrecto = true;
            } else if (numeroAdivinar != numero && intentos <= 10){
                System.out.println("Numero incorrecto. Intenta nuevamente.");
                System.out.println("Pista: El numero secreto es " + (numeroAdivinar > numero ? "mayor" : "menor") + " al numero que ingresaste.");
                // numero = consola.nextInt();
            }

            if(intentoCorrecto == false && intentos == 10)
                System.out.printf("""
                        Lo sentimos, has fallado por decima vez.
                        El numero secreto era %d.
                        Gracias por participar :)
                        """, numeroAdivinar);

            intentos++;
        }
    }
}
