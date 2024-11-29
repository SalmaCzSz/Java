package seccion8;

import java.util.Scanner;

public class ValidacionPassword {
    public static void main(String[] args) {
        // 6 caracteres para continua
        System.out.println("* * * Validar password * * *");
        var consola = new Scanner(System.in);
        var password = "";

        do {
            System.out.print("Proporciona un password de al menos 6 caracteres: ");
            password = consola.nextLine();

            if(password.length() < 6){
                System.out.println("El password debe tener al menos 6 caracteres");
            } else {
                System.out.println("Password " + password + " válido");
            }
        } while(password.length() < 6);
    }
}
