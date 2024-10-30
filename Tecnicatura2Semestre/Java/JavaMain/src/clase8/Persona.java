package clase8;

public class Persona {

    //cargamos los atributos
    private int idPersona;
    private static int contadorPersona;
    private String nombre;

    //constructor
    public Persona(String nombre) {
        this.nombre = nombre;
        // incrementar el contador por cada objeto nuevo
        Persona.contadorPersona++; // no utilizar el operador this
        //vamos a asignar un nuevo valor a la variable idPersona
        this.idPersona = Persona.contadorPersona;
    }
    public int getIdPersona(){
        return this.idPersona;
    }
    public void setIdPersona(){
        this.idPersona = idPersona;
    }
    public String getNombre(){
        return this.nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    @Override
    public String toString(){
        return "Persona{"+"idPersona="+idPersona+", nombre="+nombre+"}";
    }
}
