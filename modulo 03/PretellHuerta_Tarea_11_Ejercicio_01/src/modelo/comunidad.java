
package modelo;


public class comunidad {
    
    private String nombre;
    private int limite_poblacacion;
    private int poblacion_acutal;

    public comunidad(String nombre, int limite_poblacacion, int poblacion_acutal) {
        this.nombre = nombre;
        this.limite_poblacacion = limite_poblacacion;
        this.poblacion_acutal = poblacion_acutal;
    }
    
    public Object[] getRegistro(){
    return new Object[]{nombre,limite_poblacacion,poblacion_acutal};
    
    }    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getLimite_poblacacion() {
        return limite_poblacacion;
    }

    public void setLimite_poblacacion(int limite_poblacacion) {
        this.limite_poblacacion = limite_poblacacion;
    }

    public int getPoblacion_acutal() {
        return poblacion_acutal;
    }

    public void setPoblacion_acutal(int poblacion_acutal) {
        this.poblacion_acutal = poblacion_acutal;
    }
    
    
    
}
