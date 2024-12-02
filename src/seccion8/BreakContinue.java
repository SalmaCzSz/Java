package seccion8;

public class BreakContinue {
    public static void main(String[] args) {
        System.out.println("* * * Break * * *");

        for(var numero = 1; numero < 10; numero++){
            if(numero % 2 == 0){
                System.out.print(numero + " ");
                break;
            }
        }

        System.out.println("* * * Continue * * *");
        for(var numero = 1; numero < 10; numero++){
            if(numero % 2 == 1){ // numero impar
                continue; // salto a la siguiente iteracion
            }
            System.out.println(numero); // numeros pares
        }
    }
}
