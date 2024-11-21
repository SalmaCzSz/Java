package seccion3;

public class ReservaHotel {
    public static void main(String[] args) {
        String nombreCliente = "Salma";
        int diasEstancia = 3;
        float tarifaDiaria = 1000.00F;
        boolean vistaMar = false;

        System.out.println("* * * Detalle reserva * * *");
        System.out.println("Cliente: " + nombreCliente);
        System.out.println("Dias estancia: " +diasEstancia);
        System.out.println("Tarifa diaria: " +tarifaDiaria);
        System.out.println("Vista al mar: " + vistaMar);

        diasEstancia = 5;
        tarifaDiaria = 1550.00F;
        vistaMar = true;

        System.out.println("* * * Detalle reserva actualizado * * *");
        System.out.println("Cliente: " + nombreCliente);
        System.out.println("Dias estancia: " +diasEstancia);
        System.out.println("Tarifa diaria: " +tarifaDiaria);
        System.out.println("Vista al mar: " + vistaMar);
    }
}
