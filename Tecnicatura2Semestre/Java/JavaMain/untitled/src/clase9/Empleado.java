package clase9;

public class Empleado extends Persona {
    private int idEmpleado;
    private double sueldo;
    private static int contadorEmpleado; // para incrementar

    public Empleado() { // cons 1
        this.idEmpleado = ++Empleado.contadorEmpleado;
    }

    // cons
    public Empleado(String nombre, double sueldo) { // cons 2
        // super(nombre);
        this(); // Estamos llamando desde aqui al constructor vacio (llamar a un constructor interno)
        this.nombre = nombre;
        this.sueldo = sueldo;
    }

    public int getIdEmpleado() {
        return this.idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }
    public double getSueldo() {
        return this.sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Persona{idEmpleado=").append(idEmpleado);
        sb.append(", sueldo=").append(sueldo);
        sb.append(", contadorEmpleado=").append(contadorEmpleado);
        sb.append('}').append(super.toString());
        return sb.toString();
    }
}
