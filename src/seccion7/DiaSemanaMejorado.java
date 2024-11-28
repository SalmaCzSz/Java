package seccion7;

public class DiaSemanaMejorado {
    public static void main(String[] args) {
        System.out.println("* * * Día de la semana * * *");
        var dia = 7;

        switch (dia){ // no permite default
            case 1 -> System.out.println("Domingo");
            case 2 -> System.out.println("Lunes");
            case 3 -> System.out.println("Martes");
            case 4 -> System.out.println("Miércoles");
            case 5 -> System.out.println("Jueves");
            case 6 -> System.out.println("Viernes");
            case 7 -> System.out.println("Sábado");
        }
    }
}
