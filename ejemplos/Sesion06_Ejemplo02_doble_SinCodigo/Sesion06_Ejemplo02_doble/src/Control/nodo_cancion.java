
package Control;

import Modelo.cancion;


public class nodo_cancion {
  cancion elemento;
    nodo_cancion siguiente;
    nodo_cancion anterior;

    public nodo_cancion(cancion elemento) {
        this.elemento = elemento;
        siguiente=anterior=null;
    }

    public cancion getElemento() {
        return elemento;
    }

    public void setElemento(cancion elemento) {
        this.elemento = elemento;
    }

    public nodo_cancion getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(nodo_cancion siguiente) {
        this.siguiente = siguiente;
    }

    public nodo_cancion getAnterior() {
        return anterior;
    }

    public void setAnterior(nodo_cancion anterior) {
        this.anterior = anterior;
    }
  
  
  
  
  
}
