package domain;

public class Empleado extends Persona{
  private int idEmpleado;
  private double sueldo;
  private static int contadorEmpleado;

  //Constructores
  public Empleado(){//Constuctor 1
    this.idEmpleado = ++Empleado.contadorEmpleado;
  }

  public Empleado(String nombre, double sueldo){//Constructor 2
    //super(nombre);
    this(); //Estamos llamando desde aquí al constructor vacio (llamar a un constructor vacio)
    this.nombre = nombre;
    this.sueldo = sueldo;
  }

  public int getIdEmpleado() {
    return idEmpleado;
  }

  public double getSueldo() {
    return sueldo;
  }

  public void setSueldo(double sueldo) {
    this.sueldo = sueldo;
  }

  @Override
  public String toString() {
    final StringBuilder sb = new StringBuilder("Empleado{");
    sb.append("idEmpleado=").append(idEmpleado);
    sb.append(", sueldo=").append(sueldo);
    sb.append(", ").append(super.toString());
    sb.append('}');
    return sb.toString();
  }
}
