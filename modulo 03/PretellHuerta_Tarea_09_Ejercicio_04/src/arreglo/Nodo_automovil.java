
package arreglo;

import modelo.automovil;


public class Nodo_automovil {
    private automovil elemento;
    private Nodo_automovil izquierda,derecha;

    public Nodo_automovil(automovil elemento) {
        this.elemento = elemento;
        izquierda=derecha=null;
    }

    public automovil getElemento() {
        return elemento;
    }

    public void setElemento(automovil elemento) {
        this.elemento = elemento;
    }

    public Nodo_automovil getIzquierda() {
        return izquierda;
    }

    public void setIzquierda(Nodo_automovil izquierda) {
        this.izquierda = izquierda;
    }

    public Nodo_automovil getDerecha() {
        return derecha;
    }

    public void setDerecha(Nodo_automovil derecha) {
        this.derecha = derecha;
    }
    
    
    
    
    
    
}
