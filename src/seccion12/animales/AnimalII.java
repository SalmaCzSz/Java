package seccion12.animales;

import java.util.Arrays;

public class AnimalII {
    protected void hacerSonido(){
        System.out.println("El animal hace un sonido");
    }
}

class Perrito extends AnimalII{
    @Override
    protected void hacerSonido(){
        System.out.println("El perro hace wauf");
    }
}

class Gatito extends AnimalII{
    @Override
    protected void hacerSonido(){
        System.out.println("El gato hace meow");
    }
}

class PruebaAnimalII{
    static void imprimirSonido(AnimalII animal){ // método polimorfico
        animal.hacerSonido();
    }

    public static void main(String[] args) {
        System.out.println("* * * Clase padre * * *");
        var animal = new AnimalII();
        imprimirSonido(animal);

        System.out.println();

        System.out.println("* * * Clase hija 1 * * *");
        var perro = new Perrito();
        imprimirSonido(perro);

        System.out.println();

        System.out.println("* * * Clase hija 2 * * *");
        var gato = new Gatito();
        imprimirSonido(gato);
    }
}
