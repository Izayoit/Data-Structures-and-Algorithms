
package Modelo;


public class sucursales {

     private String nombre;
    private String direccion;
    private String ciudad;
    private String codigoSucursal;


    public sucursales(String nombre, String direccion, String ciudad, String codigoSucursal) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.ciudad = ciudad;
        this.codigoSucursal = codigoSucursal;
    }
    
   
    
   public Object[] getRegistro(){
   
   Object[] dato ={getNombre(),getDireccion(),getCiudad(),getCodigoSucursal()};
       
   return dato;
   }
    public String getNombre() {
        return nombre ;
    }
   public String toString() {
    return nombre +" "+ direccion;
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

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getCodigoSucursal() {
        return codigoSucursal;
    }

    public void setCodigoSucursal(String codigoSucursal) {
        this.codigoSucursal = codigoSucursal;
    }

    
    
}
