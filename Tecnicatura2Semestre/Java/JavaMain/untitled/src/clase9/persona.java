package clase9;

public class persona {
    protected String nombre;
    protected int genero;
    protected int edad;
    protected String direccion;

    //constructor vacio: este es para crear objetos sin nesecidad de inicializar
    //los atributos de la clase
    public persona(){ // constructo1

    }
    public Persona(String nombre){ //constructo2
        this.nombre = nombre;
    }

    public Persona(String nombre, int genero, int edad, String direccion) { // cons 3
        this.nombre = nombre;
        this.genero = genero;
        this.edad = edad;
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

    public String getDireccion() {
        return this.direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "persona{" +
                "nombre='" + nombre + '\'' +
                ", genero=" + genero +
                ", edad=" + edad +
                ", direccion='" + direccion + '\'' +
                '}';
    }
}
 // 9.2 Herencia parte 2
