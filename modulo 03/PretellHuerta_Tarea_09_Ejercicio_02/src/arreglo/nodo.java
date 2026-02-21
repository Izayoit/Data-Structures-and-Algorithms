
package arreglo;

import modelo.alumno;

public class nodo {
    private nodo izquierda ,derecha;
    private alumno elemento;

    public nodo(alumno elemento) {
        this.elemento = elemento;
        izquierda=derecha=null;
    }

    
    public nodo getIzquierda() {
        return izquierda;
    }

    public void setIzquierda(nodo izquierda) {
        this.izquierda = izquierda;
    }

    public nodo getDerecha() {
        return derecha;
    }

    public void setDerecha(nodo derecha) {
        this.derecha = derecha;
    }

    public alumno getElemento() {
        return elemento;
    }

    public void setElemento(alumno elemento) {
        this.elemento = elemento;
    }
    
    
 
    
    
    
}
