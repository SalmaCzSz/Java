package seccion11;

public class Recursividad {
    static  void funcionRecursiva(int numero){
        if(numero == 1)
            System.out.print(numero + " ");
        else {
            funcionRecursiva(numero - 1);
            System.out.print(numero + " ");
        }
    }

    public static void main(String[] args) {
        funcionRecursiva(5);
    }
}
