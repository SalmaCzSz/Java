package seccion4;

public class ReemplazarSubcadenas {
    public static void main(String[] args) {
        var cadena = "Hola Mundo";
        System.out.println("cadena = " + cadena);
        
        // reemplazar "mundo"
        var nuevaCadena = cadena.replace("Mundo", "a todos");
        System.out.println("nuevaCadena = " + nuevaCadena);
        
        // reemplazar "hola"
        nuevaCadena = cadena.replace("Hola", "Saludos");
        System.out.println("nuevaCadena = " + nuevaCadena);
    }
}
