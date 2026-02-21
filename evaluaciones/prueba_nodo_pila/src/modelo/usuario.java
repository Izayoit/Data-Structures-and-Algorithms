
package modelo;


public class usuario {
    
    private String nombre;
    private String apeliido;

    public usuario(String nombre, String apeliido) {
        this.nombre = nombre;
        this.apeliido = apeliido;
    }
     
    public Object[] getRegistro(){
    return new Object[]{nombre,apeliido};
    }
    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApeliido() {
        return apeliido;
    }

    public void setApeliido(String apeliido) {
        this.apeliido = apeliido;
    }
    
    
    
}
