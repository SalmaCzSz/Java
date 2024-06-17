package Operaciones;

public class Aritmetica {
    /*
    * Atributos
    */
    int a;
    int b;

    /*
     * Constructor vacio
     */
    public Aritmetica(){
        System.out.println("Ejecutando constructor vacio");
    }



    /*
     * Constructor con argumentos
     */
    public Aritmetica(int a, int b){
        this.a = a;
        this.b = b;

        System.out.println("Ejecutando constructor con argumentos");
    }



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
        this.a = arg1;
        this.b = arg2;
        
        return a + b;
    }
}
