package seccion12.persona;

public class PruebaPersona {
    public static void main(String[] args) {
        System.out.println("* * * Creación de clase y objetos tipo persona * * *");
        System.out.println("Variable static: " + Persona.getContadorPersonas());

        System.out.println();

        var obj1 = new Persona("Laila", "Acosta");
        System.out.println(obj1.toString());
        System.out.println("Variable static: " + Persona.getContadorPersonas());

        var obj2 = new Persona("Ian", "Gomez");
        System.out.println(obj2.toString());
        System.out.println("Variable static: " + Persona.getContadorPersonas());
    }
}
