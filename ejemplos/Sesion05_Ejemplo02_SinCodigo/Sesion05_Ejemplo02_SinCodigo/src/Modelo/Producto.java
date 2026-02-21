package Modelo;

public class Producto {
    private int codigo;
    private String descripcion;
    private int stock;
    
    public Producto(Object[] registro){
        codigo = Integer.parseInt(registro[0].toString());
        descripcion = registro[1].toString();
        stock = Integer.parseInt(registro[2].toString());
    }
    
    public Object[] getRegistro(){
        return new Object[]{codigo,descripcion,stock};
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
