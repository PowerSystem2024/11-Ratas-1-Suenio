package clase10;

public class Persona {

    public final static int CONSTANTE_AQUI = 15; // esto es una constante
    private String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void imprimir() { // con final indicamos que las clases hijas no pueden modificar la clase padre
        System.out.println("Metodo para imprimir");
    }
}
