package domain;

import java.lang.reflect.Constructor;
import java.util.Date;

public class Cliente extends Persona{
  private int idCliente;
  private Date fechaRegistro;
  private boolean vip;
  private static int contadorID;

  //Constructor
  public Cliente(String nombre,Date fechaRegistro, boolean vip){
    super(nombre);
    this.fechaRegistro =fechaRegistro;
    this.vip = vip;
    this.idCliente = ++Cliente.contadorID;
  }

  public int getIdCliente() {
    return idCliente;
  }
  public Date getFechaRegistro() {
    return fechaRegistro;
  }

  public void setFechaRegistro(Date fechaRegistro) {
    this.fechaRegistro = fechaRegistro;
  }

  public void setVip(boolean vip) {
    this.vip = vip;
  }

  public boolean isVip(){
    return isVip();
  }

  @Override
  public String toString() {
    final StringBuilder sb = new StringBuilder("Cliente{");
    sb.append("idCliente=").append(idCliente);
    sb.append(", fechaRegistro=").append(fechaRegistro);
    sb.append(", vip=").append(vip);
    sb.append(", nombre='").append(super.toString());
    sb.append('}');
    return sb.toString();
  }
}
