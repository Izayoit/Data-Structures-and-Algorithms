package Modelo;

public class Ciudad 
{
    private String Nombre;
    private String Poblacion;

    public Ciudad(String Nombre, String Poblacion) {
        this.Nombre = Nombre;
        this.Poblacion = Poblacion;
    }
    
  
    
    public String[] getRegistro(){
        
        return new String[] {Nombre, Poblacion};
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getPoblacion() {
        return Poblacion;
    }

    public void setPoblacion(String Poblacion) {
        this.Poblacion = Poblacion;
    }
    
    
}
