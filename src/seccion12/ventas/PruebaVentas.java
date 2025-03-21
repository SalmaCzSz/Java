package seccion12.ventas;

public class PruebaVentas {
    public static void main(String[] args) {
        System.out.println("* * * Sistema de ventas * * *");
        
        var producto1 = new Producto("Blusa", 30.00);
        //System.out.println("producto1 = " + producto1);
        var producto2 = new Producto("Zapatos", 50.00);
        //System.out.println("producto2 = " + producto2);

        var orden1 = new Orden();
        orden1.agregarProductos(producto1);
        orden1.agregarProductos(producto2);
        System.out.println(orden1);

        var orden2 = new Orden();
        orden2.agregarProductos(new Producto("Playera", 15.00));
        orden2.agregarProductos(producto1);
        orden2.agregarProductos(producto2);
        System.out.println(orden2);
    }
}
