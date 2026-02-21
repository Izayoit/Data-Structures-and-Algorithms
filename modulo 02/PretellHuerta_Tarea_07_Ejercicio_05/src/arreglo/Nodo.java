
package arreglo;

import modelo.numero;


public class Nodo {
    
 numero elemento;
private Nodo siguiente,anterior;

    public Nodo(numero elemento) {
        this.elemento = elemento;
        siguiente=anterior=null;
    }

    public numero getElemento() {
        return elemento;
    }

    public void setElemento(numero elemento) {
        this.elemento = elemento;
    }

  


    public Nodo getAnterior() {
        return anterior;
    }

    public void setAnterior(Nodo anterior) {
        this.anterior = anterior;
    }

  
    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }


    
    
}
