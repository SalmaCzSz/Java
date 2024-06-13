package Operaciones;

public class Aritmetica {
    /*
    * Atributos
    */
    int a;
    int b;
    
    /*
    * Metodos
    */
    public void sumar(){ // void no regresa informacion
       int resultado = a + b;
       System.out.println("resultado = " + resultado);
    }
    
    public int suma(){ // regresa información
        return a + b;
    }
    
    public int suma(int arg1, int arg2){
        a = arg1;
        b = arg2;
        
        return a + b;
    }
}
