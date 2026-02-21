
package modelo;


public class productos {
    
private String marca;
private String categoria;
private int stock;
private int costo;
private String nombre;
private String descripcion;

    public productos(String marca, String categoria, int stock, int costo, String nombre, String descripcion) {
        this.marca = marca;
        this.categoria = categoria;
        this.stock = stock;
        this.costo = costo;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public Object[] getRegistro(){
    
    Object[] dato ={getMarca(),getCategoria(),getStock(),getCosto(),getNombre(),getDescripcion()};
    
    return dato;
    }
    
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }




}
