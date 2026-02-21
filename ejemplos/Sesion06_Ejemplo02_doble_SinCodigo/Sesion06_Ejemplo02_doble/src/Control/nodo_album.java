
package Control;

import Modelo.album;


public class nodo_album {
    
  album elemento;
    nodo_album siguiente;
    nodo_album anterior;

    public nodo_album(album elemento) {
        this.elemento = elemento;
        siguiente=anterior =null;
    }

    public album getElemento() {
        return elemento;
    }

    public void setElemento(album elemento) {
        this.elemento = elemento;
    }

    public nodo_album getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(nodo_album siguiente) {
        this.siguiente = siguiente;
    }

    public nodo_album getAnterior() {
        return anterior;
    }

    public void setAnterior(nodo_album anterior) {
        this.anterior = anterior;
    }
  
  
    
    
    
    
    
}
