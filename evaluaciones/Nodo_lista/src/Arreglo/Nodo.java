
package Arreglo;

import modelo.SolicitudMatricula;


public class Nodo {
    private SolicitudMatricula dato;
    private Nodo siguiente;

    public Nodo(SolicitudMatricula dato) {
        this.dato = dato;
        siguiente =null;
    }
 
    public SolicitudMatricula getDato() {
        return dato;
    }

    public void setDato(SolicitudMatricula dato) {
        this.dato = dato;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
    
    
    
    
    
    
    
    
    
    
    
}
