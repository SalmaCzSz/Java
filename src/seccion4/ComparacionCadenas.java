package seccion4;

public class ComparacionCadenas {
    public static void main(String[] args) {
        // comparacion de cadenas (pool de cadenas)
        var cadena1 = "Java";
        var cadena2 = "Java";
        var cadena3 = new String("Java");

        // comparacion de cadenas (compara la referencia en memoria, no el contenido)
        System.out.print("cadena1 es igual en referencia cadena2: ");
        System.out.println(cadena1 == cadena2);

        System.out.print("cadena1 es igual en referencia a cadena3: ");
        System.out.println(cadena1 == cadena3);

        // comparar contenido
        System.out.print("cadena1 es igual en contenido cadena3: ");
        System.out.println(cadena1.equals(cadena3));
    }
}
