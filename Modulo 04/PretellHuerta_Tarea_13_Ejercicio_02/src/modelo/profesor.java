
package modelo;

import java.util.Date;


public class profesor {
    
    String id;
    String especialidad;
    Date horariosDisponibles;
    String departamento;

    public profesor(String id, String especialidad, Date horariosDisponibles, String departamento) {
        this.id = id;
        this.especialidad = especialidad;
        this.horariosDisponibles = horariosDisponibles;
        this.departamento = departamento;
    }

   
    
   public Object[] getRegistro(){
    
    return new Object[]{id,especialidad,horariosDisponibles,departamento};
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public Date getHorariosDisponibles() {
        return horariosDisponibles;
    }

    public void setHorariosDisponibles(Date horariosDisponibles) {
        this.horariosDisponibles = horariosDisponibles;
    }

    

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    
    
}
