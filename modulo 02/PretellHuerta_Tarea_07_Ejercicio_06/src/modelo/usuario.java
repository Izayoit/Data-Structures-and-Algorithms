
package modelo;


public class usuario {
    
    private String ID;
    private String carrito;

    public usuario(String ID, String carrito) {
        this.ID = ID;
        this.carrito = carrito;
    }
    public Object[] getRegistro(){
    return new Object[]{ID,carrito};
    }
    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getCarrito() {
        return carrito;
    }

    public void setCarrito(String carrito) {
        this.carrito = carrito;
    }
    
    
}
