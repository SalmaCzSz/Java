package seccion4;

public class BusquedaSubcadenas {
    public static void main(String[] args) {
        // indexOf - Devuelve el indice de la primera aparicion de la subcadena
        var cadena1 = "Hola Mundo";
        
        // subcadena a buscar: hola
        var indice1 = cadena1.indexOf("Hola");
        System.out.println("indice1 = " + indice1);

        // lastIndexOf - Devuelve el indice de la ultima aparicion de la subcadena
        var indice2 = cadena1.lastIndexOf("Mundo");
        System.out.println("indice2 = " + indice2);
        
        // subcadena no encontrada
        var indice3 = cadena1.indexOf("Java");
        System.out.println("indice3 = " + indice3);
    }
}
