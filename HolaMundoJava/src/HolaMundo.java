/**
 *
 * @author Salma
 */
public class HolaMundo {
    public static void main(String args[]){
        System.out.println("Hola mundo c:");
        
        // definición de variable
        int miVariableEntera = 10;
        System.out.println(miVariableEntera);
        
        // modificando el valor de la variable
        miVariableEntera = 5;
        System.out.println(miVariableEntera);
        
        String miVariableCadena = "Saludos";
        System.out.println(miVariableCadena);
        
        miVariableCadena = "Adios";
        System.out.println(miVariableCadena);
        
        // inferencia de tipos
        var miVariableEntera2 = 15;
        System.out.println(miVariableEntera2);

        var miVariableCadena2 = "Adios";
        System.out.println(miVariableCadena2);
    }
}
