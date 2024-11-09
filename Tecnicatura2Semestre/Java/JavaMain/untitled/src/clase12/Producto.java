package clase12;

public class Producto {
    //atributos de la clase
    private int idProducto;
    private String nombre;
    private double precio;
    private static int contadorProducto;

    //constructo vacio
    public Producto() {
        this.idProducto = ++Producto.contadorProducto;
    }
    public Producto(String nombre, double precio) {
        this(); // llamamos al constructo vacio para el aumento de idProducto
        this.nombre = nombre;
        this.precio = precio;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public static int getContadorProducto() {
        return contadorProducto;
    }
    public static void setContadorProducto(int contadorProducto) {
        Producto.contadorProducto = contadorProducto;
    }

    @Override
    public String toString() {
        return "Producto{" + "idProducto=" + idProducto + ", nombre='" + nombre + '\'' + ", precio=" + precio + '}';
    }
}
