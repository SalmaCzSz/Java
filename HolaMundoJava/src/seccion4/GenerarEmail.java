package seccion4;

public class GenerarEmail {
    public static void main(String[] args) {
        var nombre = "Salma Cruz Sanchez";
        var empresa = "Udemy";
        var dominio = ".com.mx";

        System.out.println("nombre = " + nombre);
        System.out.println("empresa = " + empresa);
        System.out.println("dominio = " + dominio);
        
        var emailNormalizado = new StringBuilder();
            emailNormalizado.append(nombre.trim().replace(" ", ".").toLowerCase())
                            .append("@")
                            .append(empresa.strip().replace(" ", ".").toLowerCase())
                            .append(dominio);

        System.out.println("emailNormalizado = " + emailNormalizado);
    }
}
