package seccion12;

public class Persona {
    String nombre;
    String apellido;

    void mostrarPersona(){
        System.out.println("nombre = " + nombre);
        System.out.println("apellido = " + apellido);
    }

    public static void main(String[] args) {
        System.out.println("* * * Creación de clase y objetos tipo persona * * *");
        var obj1 = new Persona();
        obj1.nombre = "Laila";
        obj1.apellido = "Acosta";
        obj1.mostrarPersona();

        var obj2 = new Persona();
        obj2.nombre = "Santiago";
        obj2.apellido = "Acosta";
        obj2.mostrarPersona();
    }
}
