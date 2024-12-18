package domain;

public class Persona {
  protected String nombre;
  protected char genero;
  protected int edad;
  protected String direccion;

  //Constructor vacío
  public Persona(){

  }
  //Constructor con parámetros

  public Persona(String nombre){
    this.nombre = nombre;
  }

  public Persona(String nombre, char genero, int edad, String direccion) {
    this.nombre = nombre;
    this.genero = genero;
    this.edad = edad;
    this.direccion = direccion;
  }

  //Getter & Setter

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public char getGenero() {
    return genero;
  }

  public void setGenero(char genero) {
    this.genero = genero;
  }

  public int getEdad() {
    return edad;
  }

  public void setEdad(int edad) {
    this.edad = edad;
  }

  public String getDireccion() {
    return direccion;
  }

  public void setDireccion(String direccion) {
    this.direccion = direccion;
  }

  @Override
  public String toString() {
    final StringBuilder sb = new StringBuilder("Persona{");
    sb.append("nombre='").append(nombre).append('\'');
    sb.append(", genero=").append(genero);
    sb.append(", edad=").append(edad);
    sb.append(", direccion='").append(direccion).append('\'');
    sb.append('}');
    return sb.toString();
  }
}
