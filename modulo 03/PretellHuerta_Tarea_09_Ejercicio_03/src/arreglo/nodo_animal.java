
package arreglo;

import modelo.animal;


public class nodo_animal {
    
 private animal elemento;
private nodo_animal izquierda,derecha;

    public nodo_animal(animal elemento) {
        this.elemento = elemento;
        izquierda=derecha=null;
    }

    public animal getElemento() {
        return elemento;
    }

    public void setElemento(animal elemento) {
        this.elemento = elemento;
    }

    public nodo_animal getIzquierda() {
        return izquierda;
    }

    public void setIzquierda(nodo_animal izquierda) {
        this.izquierda = izquierda;
    }

    public nodo_animal getDerecha() {
        return derecha;
    }

    public void setDerecha(nodo_animal derecha) {
        this.derecha = derecha;
    }
    
    
    
    
    
    
}
