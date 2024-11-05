package ar.com.codesystem.ventas.test;

import ar.com.codesystem.ventas.Producto;
import ar.com.codesystem.ventas.Orden;

// Tarea: Crear mas objetos de tipo producto = 10
//Crear mas objetos de tipo orden = 2

public class VentasTest {
    public static void main(String[] args) {
        // Crear 10 productos
        Producto[] productos = new Producto[10];
        productos[0] = new Producto("Pantalon", 9500.00);
        productos[1] = new Producto("Campera", 29900.00);
        productos[2] = new Producto("Zapatos", 12000.00);
        productos[3] = new Producto("Camiseta", 4500.00);
        productos[4] = new Producto("Gorro", 2500.00);
        productos[5] = new Producto("Bufanda", 1500.00);
        productos[6] = new Producto("Chaqueta", 34900.00);
        productos[7] = new Producto("Jean", 8500.00);
        productos[8] = new Producto("Shorts", 3500.00);
        productos[9] = new Producto("Sudadera", 7000.00);

        // Crear 2 órdenes
        Orden orden1 = new Orden();
        orden1.agregarProducto(productos[0]); // Pantalon
        orden1.agregarProducto(productos[1]); // Campera
        orden1.agregarProducto(productos[2]); // Zapatos
        orden1.mostrarOrden();

        System.out.println();

        Orden orden2 = new Orden();
        orden2.agregarProducto(productos[3]); // Camiseta
        orden2.agregarProducto(productos[4]); // Gorro
        orden2.agregarProducto(productos[5]); // Bufanda
        orden2.mostrarOrden();
    }
}
