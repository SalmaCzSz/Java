package seccion3;

public class DetalleLibro {
    public static void main(String[] args) {
        // detalle de un libro
        String tituloLibro = "El señor de los anillos";
        int anioPublicacion = 1954;
        boolean libroDisponible = true;
        double precio = 500.50;

        // imprimir el valor de las variables
        System.out.println(tituloLibro);
        System.out.println(anioPublicacion);
        System.out.println(libroDisponible);
        System.out.println(precio);

        // modificar el titulo del libro
        tituloLibro = "Orgullo y prejuicio";
        System.out.println(tituloLibro);
    }
}
