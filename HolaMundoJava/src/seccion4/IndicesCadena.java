package seccion4;

public class IndicesCadena {
    public static void main(String[] args) {
        // manejo de indices
        var cadena1 = "hola mundo";
        
        // recuperar el primer caracter
        var primerCaracter = cadena1.charAt();
        System.out.println("primerCaracter = " + primerCaracter);
        
        // recuperar el ultimo caracter
        var ultimoCaracter = cadena1.charAt(9);
        System.out.println("ultimoCaracter = " + ultimoCaracter);
        
        // recuperar quinto caracter
        var quintoCaracter = cadena1.charAt(5);
        System.out.println("quintoCaracter = " + quintoCaracter);
    }
}
