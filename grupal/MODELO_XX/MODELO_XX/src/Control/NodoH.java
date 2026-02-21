
package Control;

import ModeloMantenimiento.Hotel;


public class NodoH {
    private Hotel elemento;
    private NodoH der, izq;

    public NodoH(Hotel elemento) {
        this.elemento = elemento;
        der = izq = null;
    }

    public Hotel getElemento() {
        return elemento;
    }

    public void setElemento(Hotel elemento) {
        this.elemento = elemento;
    }

    public NodoH getDer() {
        return der;
    }

    public void setDer(NodoH der) {
        this.der = der;
    }

    public NodoH getIzq() {
        return izq;
    }

    public void setIzq(NodoH izq) {
        this.izq = izq;
    }
    
    
}
