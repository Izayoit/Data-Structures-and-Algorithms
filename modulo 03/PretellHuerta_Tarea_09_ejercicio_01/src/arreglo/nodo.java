
package arreglo;

import modelo.factura;


public class nodo {
    private nodo derecha,izquierda;
    private factura elemento;

    public nodo(factura elemento) {
        this.elemento = elemento;
        derecha=izquierda=null;
    }

    public nodo getDerecha() {
        return derecha;
    }

    public void setDerecha(nodo derecha) {
        this.derecha = derecha;
    }

    public nodo getIzquierda() {
        return izquierda;
    }

    public void setIzquierda(nodo izquierda) {
        this.izquierda = izquierda;
    }

    public factura getElemento() {
        return elemento;
    }

    public void setElemento(factura elemento) {
        this.elemento = elemento;
    }
    
    
    
    
    
}
