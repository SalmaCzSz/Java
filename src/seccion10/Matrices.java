package seccion10;

public class Matrices {
    public static void main(String[] args) {
        var matriz = new int[2][3];

        matriz[0][0] = 100;
        matriz[0][1] = 200;
        matriz[0][2] = 300;
        matriz[1][0] = 400;
        matriz[1][1] = 500;
        matriz[1][2] = 600;

        System.out.println("Valor [0][0]: " + matriz[0][0]);
        System.out.println("Valor [1][1]: " + matriz[1][1]);
        System.out.println("Valor [1][2]: " + matriz[1][2]);
    }
}
