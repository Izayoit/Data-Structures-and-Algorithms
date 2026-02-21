
package modelo;


public class producto {
     private String nombre;
    private String codigo;
    private String marca;
    private int stock;
    private almacen almacenAsignado;

    public producto(String nombre, String codigo, String marca, int stock, almacen almacenAsignado) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.marca = marca;
        this.stock = stock;
        this.almacenAsignado = almacenAsignado;
        
        
        
    }

    public producto(String nombre, String codigo, String marca, int stock) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.marca = marca;
        this.stock = stock;
    }
    
    public Object[] getRegistro(){
    
    Object[] dato ={getNombre(),getCodigo(),getMarca(),getStock(),getAlmacenAsignado()};
        
        return dato;
        
    }
    public Object getCadena(){
    return stock;
    }
    
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public almacen getAlmacenAsignado() {
        return almacenAsignado;
    }

    public void setAlmacenAsignado(almacen almacenAsignado) {
        this.almacenAsignado = almacenAsignado;
    }

    
    
    
    
    
}
