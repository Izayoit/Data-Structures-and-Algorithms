
package modelo;


public class clientes {
   private String codigoCliente;
    private String nombre;
    private String apellido;
    private String dni;
    private String telefono;
    private String direccion;

    public clientes(String codigoCliente, String nombre, String apellido, String dni, String telefono, String direccion) {
        this.codigoCliente = codigoCliente;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.telefono = telefono;
        this.direccion = direccion;
    }
    
    public Object[] getRegistro(){
    
        Object[] dato ={getCodigoCliente(),getNombre(),getApellido(),getDni(),getTelefono(),getDireccion()};
        
    return dato;
    }

    public String getCodigoCliente() {
        return codigoCliente;
    }

    public void setCodigoCliente(String codigoCliente) {
        this.codigoCliente = codigoCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
     public String toString(){
        
    return codigoCliente;
        
    
    }
    
} 
