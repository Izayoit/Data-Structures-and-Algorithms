
package arreglo;

import modelo.ticket;


public class Nodo_ticket {
    
   private ticket elemento;
   private Nodo_ticket siguiente,anterior;

    public Nodo_ticket(ticket elemento) {
        this.elemento = elemento;
        anterior=siguiente =null;
    }

    public ticket getElemento() {
        return elemento;
    }

    public Nodo_ticket getAnterior() {
        return anterior;
    }

    public void setAnterior(Nodo_ticket anterior) {
        this.anterior = anterior;
    }

    public void setElemento(ticket elemento) {
        this.elemento = elemento;
    }

    public Nodo_ticket getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo_ticket siguiente) {
        this.siguiente = siguiente;
    }
   
   
   
    
    
}
