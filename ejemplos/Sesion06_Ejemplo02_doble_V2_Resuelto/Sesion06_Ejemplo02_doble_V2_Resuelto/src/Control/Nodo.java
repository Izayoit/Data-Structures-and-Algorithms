package Control;

import Modelo.Producto;

public class Nodo {
    private Producto elemento;
    private Nodo siguiente, anterior;
    
    public Nodo(Producto elemento){
        this.elemento = elemento;
        siguiente = anterior = null;
    }

    public Nodo getAnterior() {
        return anterior;
    }

    public void setAnterior(Nodo anterior) {
        this.anterior = anterior;
    }
    
    

    public Producto getElemento() {
        return elemento;
    }

    public void setElemento(Producto elemento) {
        this.elemento = elemento;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
    
    
}
