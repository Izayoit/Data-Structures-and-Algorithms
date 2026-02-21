package Control;

import Modelo.Cliente;

public class Nodo {
    private Cliente elemento;
    private Nodo izq,der;

    public Nodo(Cliente elemento) {
        this.elemento = elemento;
        izq=der=null;
    }

    public Cliente getElemento() {
        return elemento;
    }

    public void setElemento(Cliente elemento) {
        this.elemento = elemento;
    }

    public Nodo getIzq() {
        return izq;
    }

    public void setIzq(Nodo izq) {
        this.izq = izq;
    }

    public Nodo getDer() {
        return der;
    }

    public void setDer(Nodo der) {
        this.der = der;
    }

   
    
}
