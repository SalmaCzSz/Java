package seccion4;

public class MetodosCadenas {
    public static void main(String[] args) {
        // metodos de cadenas
        var cadena1 = "Hola Mundo";
        
        // obtener el largo de una cadena
        var longitud = cadena1.length();
        System.out.println("longitud = " + longitud);
        
        // reemplazar caracteres
        var nuevaCadena = cadena1.replace('o', 'a');
        System.out.println("nuevaCadena = " + nuevaCadena);
        
        // convertir a mayusculas
        var mayusculas = cadena1.toUpperCase();
        System.out.println("mayusculas = " + mayusculas);
        
        // convertir a minusculas
        var minusculas = cadena1.toLowerCase();
        System.out.println("minusculas = " + minusculas);

        // eliminar espacios al inicio y al final
        var cadena2 = " leo reyes    ";
        System.out.println("cadena2 con espacios = " + cadena2);
        System.out.println("cadena2 sin espacios = " + cadena2.trim());
    }
}
