
package arreglo;

import modelo.numero;


public class Nodo_numero {
    
   private numero elemento;
   private Nodo_numero siguiente;

    public Nodo_numero(numero elemento) {
        this.elemento = elemento;
        siguiente=null;
    }

    public numero getElemento() {
        return elemento;
    }

    public void setElemento(numero elemento) {
        this.elemento = elemento;
    }

    public Nodo_numero getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo_numero siguiente) {
        this.siguiente = siguiente;
    }

   
 
    
    
}
