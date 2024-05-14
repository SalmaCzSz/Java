/**
 *
 * @author Salma
 */
public class HolaMundo {
    public static void main(String args[]){
        System.out.println("Hola mundo c:");
        
        // definicion de variable
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

        // concatenacion
        var usuario = "Juan";
        var titulo = "Ingeniero";
        var union = titulo + " " + usuario;
        System.out.println("union = " + union);

        var i = 3;
        var j = 4;
        System.out.println(i + j); // 7 -> devuelve la suma
        System.out.println(i + j + usuario); // 7Juan -> suma y concatena el nombre
        System.out.println(usuario + i + j); // Juan34 -> concatena toda la cadena
        System.out.println(usuario + (i + j)); // Juan7 -> concatena la cadena y el resultado de la suma
    }
}
