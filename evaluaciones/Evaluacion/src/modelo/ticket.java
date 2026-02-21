
package modelo;

import java.util.Date;


public class ticket {
    private int NumeroCorrelativo ;
    private String nombre;
    private Date Hora_creacion;
    private Date Atencion;
    private String estado;

    public ticket(int NumeroCorrelativo, String nombre, Date Hora_creacion, Date Atencion, String estado) {
        this.NumeroCorrelativo = NumeroCorrelativo;
        this.nombre = nombre;
        this.Hora_creacion = Hora_creacion;
        this.Atencion = Atencion;
        this.estado = estado;
    }
   public Object[] getRegistro(){
   
   return new Object[]{NumeroCorrelativo,nombre,Hora_creacion,Atencion,estado};
   }
    
    public int getNumeroCorrelativo() {
        return NumeroCorrelativo;
    }

    public void setNumeroCorrelativo(int NumeroCorrelativo) {
        this.NumeroCorrelativo = NumeroCorrelativo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getHora_creacion() {
        return Hora_creacion;
    }

    public void setHora_creacion(Date Hora_creacion) {
        this.Hora_creacion = Hora_creacion;
    }

    public Date getAtencion() {
        return Atencion;
    }

    public void setAtencion(Date Atencion) {
        this.Atencion = Atencion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    
    
    
}
