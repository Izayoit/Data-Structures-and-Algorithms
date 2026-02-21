package Control;

import Modelo.Producto;

public class Nodo {
    private Producto Elemento;
    private Nodo siguiente,anterior;

    public Nodo(Producto Elemento) {
        this.Elemento = Elemento;
        siguiente= anterior=null;
    }

    public Nodo getAnterior() {
        return anterior;
    }

    public void setAnterior(Nodo anterior) {
        this.anterior = anterior;
    }

    public Producto getElemento() {
        return Elemento;
    }

    public void setElemento(Producto Elemento) {
        this.Elemento = Elemento;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
    
    
}
