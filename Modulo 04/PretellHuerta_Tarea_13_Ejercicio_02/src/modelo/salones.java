
package modelo;

import java.util.Date;


public class salones {
    String id;   
    int capacidad;
    String recursosTecnicos;
    Date horariosDisponibles;

    public salones(String id, int capacidad, String recursosTecnicos, Date horariosDisponibles) {
        this.id = id;
        this.capacidad = capacidad;
        this.recursosTecnicos = recursosTecnicos;
        this.horariosDisponibles = horariosDisponibles;
    }

   
    public Object[] getRegistro(){
    return new Object[]{id,capacidad,recursosTecnicos,horariosDisponibles};
    }
 
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public String getRecursosTecnicos() {
        return recursosTecnicos;
    }

    public void setRecursosTecnicos(String recursosTecnicos) {
        this.recursosTecnicos = recursosTecnicos;
    }

    public Date getHorariosDisponibles() {
        return horariosDisponibles;
    }

    public void setHorariosDisponibles(Date horariosDisponibles) {
        this.horariosDisponibles = horariosDisponibles;
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
}
