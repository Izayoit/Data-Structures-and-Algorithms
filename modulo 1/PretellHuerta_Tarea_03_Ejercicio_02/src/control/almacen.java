
package control;


public class almacen {
     private String nombre;
    private String direccion;
    private int cantidadProductosRegistrados;

    public almacen(String nombre, String direccion, int cantidadProductosRegistrados) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.cantidadProductosRegistrados = cantidadProductosRegistrados;
    }
    
    public Object[] getRegistroI(){
    
    Object[] dato= { getNombre(),getDireccion(), getCantidadProductosRegistrados() };
        
    return dato;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getCantidadProductosRegistrados() {
        return cantidadProductosRegistrados;
    }

    public void setCantidadProductosRegistrados(int cantidadProductosRegistrados) {
        this.cantidadProductosRegistrados = cantidadProductosRegistrados;
    }
    
    public String toString(){
    
    return nombre+" "+direccion;
    }
    
    
} 
