public class Operadores {
    public static void main(String args[]){
        /*
        * Operadores Aritmeticos
        * */
        int a = 3,
            b = 2;

        var resultado = a + b;
        System.out.println("Resultado suma: " + resultado);
        resultado = a - b;
        System.out.println("Resultado resta: " + resultado);
        resultado = a * b;
        System.out.println("Resultado multiplicacion: " + resultado);
        resultado = a / b;
        System.out.println("Resultado division: " + resultado); // 1 -> usamos literal de tipo int
        var resultado2 = 3.0 / b;
        System.out.println("Resultado division: " + resultado2); // 1.5 -> usamos literal de tipo flotante
        resultado = a % b;
        System.out.println("Resultado modulo: " + resultado);

        if(a % 2 == 0) // las llaves se pueden omitir si solo tenemos una linea de codigo en el bloque
            System.out.println("Numero par");
        else
            System.out.println("Numero impar");



        /*
         * Operadores de asignacion
         * */
        int c = a + 5 - b;
        System.out.println("Resultado 'c' = " + c);

        a += 1;
        System.out.println("Resultado 'a' = " + a);

        a += 3;
        System.out.println("Resultado 'a' = " + a);

        a -= 2;
        System.out.println("Resultado 'a' = " + a);

        b *= 4;
        System.out.println("Resultado 'b' = " + b);

        b /= 2;
        System.out.println("Resultado 'b' = " + b);

        b %= 5;
        System.out.println("Resultado 'b' = " + b);



        /*
         * Operadores unarios
         * */
        var d = 3;
        var e = -d;
        System.out.println("'d' = " + d);
        System.out.println("'e' = " + e);

        var f = true;
        var g = !f;
        System.out.println("'f' = " + f);
        System.out.println("'g' = " + g);

        var h = 3; // incremento
        var i = ++h; // preincremento -> primero se incrementa la variable y luego se usa su valor
        var j = 5;
        var k = j++; // preincremento -> primero se usa su valor y luego se incrementa
        System.out.println("'h' = " + h);
        System.out.println("'i' = " + i);
        System.out.println("'j' = " + j);
        System.out.println("'k' = " + k);

        var l = 2;
        var m = --i; // predecremento -> primero se decrementa la variable y luego se usa su valor
        var n = 4;
        var o = n--; // postdecremento -> primero se usa su valor y luego se decrementa
        System.out.println("'l' = " + l);
        System.out.println("'m' = " + m);
        System.out.println("'n' = " + n);
        System.out.println("'o' = " + o);



        /*
         * Operadores de igualdad
         * */
        var p = 3;
        var q = 2;
        var r = (p == q);
        var s = (p != q);
        System.out.println("'r' = " + r);
        System.out.println("'s' = " + s);

        var cadena1 = "Hola";
        var cadena2 = "Adios";
        var igualdadObjeto = (cadena1 == cadena2); // compara referencias de objetos
        var igualdadContenido = cadena1.equals(cadena2); // compara contenido
        System.out.println("cadenas = " + igualdadObjeto);
        System.out.println("cadenas = " + igualdadContenido);



        /*
         * Operadores relacionales
         * */
        var isMayor = a > b;
        System.out.println("isMayor = " + isMayor);
        if(a % 2 == 0){
            System.out.println("Es numero par");
        } else {
            System.out.println("Es numero impar");
        }

        var edad = 30;
        var adulto = 18;
        if( edad >= adulto){
            System.out.println("Es adulto");
        } else {
            System.out.println("No es adulto");
        }
    }
}
