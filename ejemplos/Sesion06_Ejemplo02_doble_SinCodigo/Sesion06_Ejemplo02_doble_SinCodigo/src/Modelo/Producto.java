package Modelo;

public class Producto {
    private int codigo;
    private String descripcion;
    private int stock;
    
    

    public Producto(int codigo, String descripcion, int stock) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.stock = stock;
    }
    
    public Object[] getRegistro(){
        return new Object[]{codigo,descripcion,stock};
    }
    
    public String getCadena_Archivo(){
        return codigo + "%" + descripcion + "%" + stock;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
    
    
}
