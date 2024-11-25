package seccion4;

public class ConcatenacionCadenas {
    public static void main(String[] args) {
        var cadena1 = "Hola";
        var cadena2 = "Mundo";
        var cadena3 = cadena1 + " " + cadena2;
        System.out.println("cadena3 usando '+' = " + cadena3);
        
        // metodo concat
        cadena3 =cadena1.concat(" ").concat("Mundo");
        System.out.println("cadena3 usando concat = " + cadena3);
        
        // stringbuilder -> genera en memoria un solo objeto de tipo cadena
        var constructorCadenas = new StringBuilder();
            constructorCadenas.append(cadena1);
            constructorCadenas.append(" ");
            constructorCadenas.append(cadena2);
        var resultado = constructorCadenas.toString();
        System.out.println("resultado StringBuilder = " + resultado);
        
        // stringbuffer -> para trabajo con hilos o varios procesos a la vez
        var stringBuffer = new StringBuffer();
            stringBuffer.append(cadena1)
                        .append(" ")
                        .append(cadena2);
        resultado = stringBuffer.toString();
        System.out.println("resultado StringBuffer = " + resultado);

        // join
        resultado = String.join(" ", cadena1, cadena2);
        System.out.println("resultado Join = " + resultado);
    }
}
