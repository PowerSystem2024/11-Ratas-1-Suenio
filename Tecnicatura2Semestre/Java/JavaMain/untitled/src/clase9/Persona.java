package clase9;

public class Persona {
    // atributos de herencia
    protected String nombre;
    protected int genero;
    protected int edad;
    protected String direccion;

    //constructor vacio: este es para crear objetos sin nesecidad de inicializar
    //los atributos de la clase
    public Persona(){ // constructo 1

    }
    public Persona(String nombre){ //constructo 2
        this.nombre = nombre;
    }

    public Persona(String nombre, char genero, int edad, String direccion) { // cons 3
        this.nombre = nombre;
        this.genero = genero;
        this.edad = edad;
        this.direccion = direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public String getNombre() {
        return this.nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getGenero() {
        return this.genero;
    }
    public void setGenero(int genero) {
        this.genero = genero;
    }
    public int getEdad() {
        return this.edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Persona{nombre=").append(nombre);
        sb.append(", genero=").append(genero);
        sb.append(", edad=").append(edad);
        sb.append(", direccion=").append(direccion);
        sb.append('}').append(super.toString());
        return sb.toString();

    }
}

// 10.2 Sobrecarga de Métodos: Lo hacemos en carpeta Leccion7
