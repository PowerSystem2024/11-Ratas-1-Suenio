/*
                 Tarea:
crear mas objetos de tipo producto = 10
    crear objetos de tipo orden = 2
*/
package clase12;

public class VentasTest {
    public static void main(String[] args) {
        Producto producto1 = new Producto("Pantalon", 120000);
        Producto producto2 = new Producto("Campera", 299000);
        Producto producto3 = new Producto("Camisa", 85000);
        Producto producto4 = new Producto("Zapatos", 200000);
        Producto producto5 = new Producto("Corbata", 30000);
        Producto producto6 = new Producto("Gorra", 25000);
        Producto producto7 = new Producto("Bufanda", 40000);
        Producto producto8 = new Producto("Guantes", 45000);
        Producto producto9 = new Producto("Cinturon", 38000);
        Producto producto10 = new Producto("Chaqueta", 270000);

        Orden orden1 = new Orden();
        Orden orden2 = new Orden();

        //Productos por separado agregados al arreglo
        orden1.agregarProducto(producto1);
        orden1.agregarProducto(producto2);
        orden1.agregarProducto(producto3);
        orden1.agregarProducto(producto4);
        orden1.agregarProducto(producto5);
        orden1.mostrarOrden();
        orden2.agregarProducto(producto6);
        orden2.agregarProducto(producto7);
        orden2.agregarProducto(producto8);
        orden2.agregarProducto(producto9);
        orden2.agregarProducto(producto10);
        orden2.mostrarOrden();

        // muestra de los productos
        System.out.println("Orden 1:");
        orden1.mostrarOrden();
        System.out.println("Orden 2:");
        orden2.mostrarOrden();
    }
}
