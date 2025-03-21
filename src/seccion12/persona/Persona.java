package seccion12.persona;

public class Persona {
    private static int contadorPersonas = 0;
    private String nombre;
    private String apellido;
    private int idPersona;

    public Persona(String nombre, String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
        //Persona.contadorPersonas++;
        this.idPersona = ++Persona.contadorPersonas;
    }

    @Override
    public String toString(){
        return "Id:" + this.idPersona + ", Nombre: " + this.nombre + ", Apellido: " + this.apellido + ", [ Dirección en memoria: " +super.toString() + " ]";
    }

    public int getIdPersona() {
        return this.idPersona;
    }

    public static int getContadorPersonas(){
        return Persona.contadorPersonas;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return this.apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
}
