package clase9;
import java.util.Date;

public class Clientes extends Persona{
    //atributos
    private int idCliente;
    private Date fechaRegistro; // importar la clase
    private boolean vip; // very import person
    private static int contadorClientes; // tipo estatico

    // Construct
    public Clientes(Date fechaRegistro, boolean vip, String nombre,
                    char genero, int edad, String direccion) {
        super(nombre, genero, edad, direccion);
        this.idCliente = ++Clientes.contadorClientes;
        this.fechaRegistro = fechaRegistro;
        this.vip = vip;
    }

    public boolean isVip() {
        return this.vip;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }

    public Date getFechaRegistro() {
        return this.fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public int getIdCliente() {
        return this.idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Persona{idCliente=").append(idCliente);
        sb.append(", fechaRegistro=").append(fechaRegistro);
        sb.append(", vip=").append(vip);
        sb.append(", contadorClientes=").append(contadorClientes);
        sb.append('}').append(super.toString());
        return sb.toString();
    }
}
