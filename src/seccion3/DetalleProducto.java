package seccion3;

public class DetalleProducto {
    public static void main(String[] args) {
        String nombreProducto = "Libro Orgullo y prejuicio edicion ilustrada";
        float precio = 890.56F;
        int cantidadDisponible = 10;
        boolean isDisponible = true;

        System.out.println("* * * Tienda online * * *");
        System.out.println(nombreProducto);
        System.out.println(precio);
        System.out.println(cantidadDisponible);
        System.out.println(isDisponible);

        nombreProducto = "Lo que la nieve susurra al caer";
        precio = 299.00F;
        cantidadDisponible = 5;
        isDisponible = true;

        System.out.println("* * * Tienda online * * *");
        System.out.println(nombreProducto);
        System.out.println(precio);
        System.out.println(cantidadDisponible);
        System.out.println(isDisponible);
    }
}
