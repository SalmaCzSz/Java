package seccion12.persona;

public class PruebaPersona {
    public static void main(String[] args) {
        System.out.println("* * * Creación de clase y objetos tipo persona * * *");
        var obj1 = new Persona("Laila", "Acosta");
        obj1.mostrarPersona();

        var obj2 = new Persona("Ian", "Gomez");
        obj2.mostrarPersona();
    }
}
