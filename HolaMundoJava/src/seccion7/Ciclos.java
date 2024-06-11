package seccion7;

public class Ciclos {
    public static void main(String args[]) {
        /*
        * While
        * */
        var contador = 0;

        while(contador < 3){
            System.out.println("contador = " + contador);
            contador++;
        }



        /*
         * Do While
         * */
        contador = 0;

        do{
            System.out.println("contador = " + contador);
            contador++;
        } while (contador < 3);



        /*
         * For
         * */
        inicio: //label
        for(var i = 0; i < 3; i ++){
            if(i % 2 != 0){
                continue inicio; // va a la siguiente iteracion
            }
            System.out.println("i = " + i); // imprime pares

            /*
            if(i % 2 == 0){
                System.out.println("i = " + i);
                break; // termina el ciclo
            }
             */
        }
    }
}
