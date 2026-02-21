
package Modelo;


public class Ciudad {
    private String nombre;
    private String pais;

    public Ciudad(String nombre, String pais) {
        this.nombre = nombre;
        this.pais = pais;
    }
    
    public Ciudad(Object[] registro){
    nombre = registro[0].toString();
    pais = registro[1].toString();
    }
    
    public Object[] getRegistro(){
    return new Object[]{nombre, pais};
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
    
    
}
