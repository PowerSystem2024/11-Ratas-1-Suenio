package domain;

public class Persona {
    //Carga de atributos
    private int idPersona;
    private static int contadorPersona;
    private String nombre;

    //Constructor
    public Persona(String nombre){
        this.nombre = nombre;

        Persona.contadorPersona++; //No se utiliza this
        this.idPersona = Persona.contadorPersona;
    }

    public int getIdPersona() {
        return this.idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public static int getContadorPersona() {
        return contadorPersona;
    }

    public static void setContadorPersona(int contadorPersona) {
        Persona.contadorPersona = contadorPersona;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "idPersona=" + idPersona +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
