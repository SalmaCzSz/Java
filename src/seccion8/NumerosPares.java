package seccion8;

public class NumerosPares {
    public static void main(String[] args) {
        System.out.println("* * * Numeros pares del 1 al 20 * * *");
        var contador = 1;

        while(contador <= 20){
            if(contador % 2 == 0) {
                System.out.print(contador + " ");
            }
            contador++;
        }

        System.out.println("\n\n* * * Numeros pares del 0 al 20");

        for(int i = 0; i <= 20; i ++){
            if(i % 2 == 0){
                System.out.print(i + " ");
            }
            i++;
        }
    }
}
