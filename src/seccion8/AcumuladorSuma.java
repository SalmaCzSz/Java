package seccion8;

public class AcumuladorSuma {
    public static void main(String[] args) {
        System.out.println("* * * Suma iterativa");

        var contador = 1;
        var suma = 0;
        final var MAXIMO = 5;

        while(contador <= MAXIMO){
            suma += contador;
            //System.out.println("Suma acumulativa: " + suma);
            contador++;
        }

        System.out.println("Total: " + suma);
    }
}
