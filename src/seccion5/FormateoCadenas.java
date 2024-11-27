package seccion5;

public class FormateoCadenas {
    public static void main(String[] args) {
        System.out.println("* * * Formateo de cadenas * * *");
        var nombre = "Matias";
        var edad = 35;
        var salario = 21000.50;

        // String.format
        var mensaje = String.format("Nombre: %s, Edad: %d, Salario: $%.2f", nombre, edad, salario);
        System.out.println("mensaje = " + mensaje);

        // printf
        System.out.printf("Nombre: %s, Edad: %d, Salario: $%.2f", nombre, edad, salario);

        var noEmpleado = 12;
        // formateo con text block
        mensaje = """
                %nDetalle persona: \s
                ---------------------
                \tNombre: %s
                \tNo. Empeado: %04d
                \tEdad: %d años
                \tSalario: $%.2f
                """.formatted(nombre, noEmpleado, edad, salario);
        System.out.println("mensaje = " + mensaje);

        // formateo con text block y printf
        System.out.printf("""
                %nDetalle persona: \s
                ---------------------
                \tNombre: %s
                \tNo. Empeado: %04d
                \tEdad: %d años
                \tSalario: $%.2f
                """,
                nombre, noEmpleado, edad, salario);
    }
}
