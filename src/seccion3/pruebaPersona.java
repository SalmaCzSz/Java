package seccion3;

public class pruebaPersona {
    public static void main(String[] args){
        Persona persona1 = new Persona();
        persona1.nombre = "Salma";
        persona1.apellido = "Cruz";
        persona1.desplegarInformacion();
        
        Persona persona2 = new Persona();

        System.out.println("persona1 = " + persona1); // @referencia en memoria del objeto
        System.out.println("persona2 = " + persona2); // @referencia en memoria del objeto

        persona2.desplegarInformacion();
        persona2.nombre = "Thamar";
        persona2.apellido = "Sanchez";
        persona2.desplegarInformacion();
    }
}
