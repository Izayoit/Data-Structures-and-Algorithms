
package Modelo;


public class empleado {
     private String nombre;
    private String codigoEmpleado;
    private int edad;
    private  sucursales sucursalAsignada;

    public empleado(String nombre, String codigoEmpleado, int edad, sucursales sucursalAsignada) {
        this.nombre = nombre;
        this.codigoEmpleado = codigoEmpleado;
        this.edad = edad;
        this.sucursalAsignada = sucursalAsignada;
    }
    public String getCadena(){
    return nombre+" "+codigoEmpleado+" "+sucursalAsignada;
    }
    
    
    
    public Object[] getRegistro(){
    
    Object[]dato = {getNombre(),getCodigoEmpleado(),getEdad(),getSucursalAsignada()};
        
    return dato;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigoEmpleado() {
        return codigoEmpleado;
    }

    public void setCodigoEmpleado(String codigoEmpleado) {
        this.codigoEmpleado = codigoEmpleado;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public sucursales getSucursalAsignada() {
        return sucursalAsignada;
    }

    public void setSucursalAsignada(sucursales sucursalAsignada) {
        this.sucursalAsignada = sucursalAsignada;
    }
    
    
    
    
}
