package seccion4;

public class InmutabilidadCadenas {
    public static void main(String[] args) {
        var cadena1 = "hola";
        System.out.println("cadena1 = " + cadena1);

        cadena1 = "adios";
        System.out.println("cadena1 = " + cadena1);

        /*
        memoria                 object
        Variables               String
        cadena1         ->      "hola"
                        ->      "adios"     se pierde la referencia de arriba
        */

        var cadena2 = "hola";
        System.out.println("cadena2 = " + cadena2);
        var cadena2aux = cadena2;
        cadena2 = "adios";

        /*
        memoria                 object
        Variables               String
        cadena2         ->      "hola"
        cadena2aux      ->      "hola"
        cadena2         ->      "adios"
        */
    }
}
