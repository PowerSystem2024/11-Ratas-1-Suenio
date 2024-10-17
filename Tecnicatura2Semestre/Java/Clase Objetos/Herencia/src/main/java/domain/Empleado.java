package domain;

public class Empleado extends Persona{
  private int idEmpleado;
  private double sueldo;
  private static int contadorEmpleado;

  //Constructor
  public Empleado(String nombre, double sueldo){
    super(nombre);
    this.sueldo = sueldo;
    this.idEmpleado = ++Empleado.contadorEmpleado;
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
