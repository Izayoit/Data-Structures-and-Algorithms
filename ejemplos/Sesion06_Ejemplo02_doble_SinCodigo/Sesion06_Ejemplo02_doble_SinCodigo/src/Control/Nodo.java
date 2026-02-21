package Control;

import Modelo.Producto;

public class Nodo {
    private Producto Elemento;
    private Nodo Siguiente, Anterior;

    public Nodo(Producto Elemento) {
        this.Elemento = Elemento;
        Siguiente = Anterior = null;
    }

    public Producto getElemento() {
        return Elemento;
    }

    public void setElemento(Producto Elemento) {
        this.Elemento = Elemento;
    }

    public Nodo getSiguiente() {
        return Siguiente;
    }

    public void setSiguiente(Nodo Siguiente) {
        this.Siguiente = Siguiente;
    }

    public Nodo getAnterior() {
        return Anterior;
    }

    public void setAnterior(Nodo Anterior) {
        this.Anterior = Anterior;
    }
    
    
}
