package Control;

import Modelo.Pais;

public class Nodo_Pais {
    private Pais Elemento;
    private Nodo_Pais Izquierda, Derecha;
    
    public Nodo_Pais(Pais Elemento){
        this.Elemento = Elemento;
        Izquierda = Derecha = null;
    }

    public Pais getElemento() {
        return Elemento;
    }

    public void setElemento(Pais Elemento) {
        this.Elemento = Elemento;
    }

    public Nodo_Pais getIzquierda() {
        return Izquierda;
    }

    public void setIzquierda(Nodo_Pais Izquierda) {
        this.Izquierda = Izquierda;
    }

    public Nodo_Pais getDerecha() {
        return Derecha;
    }

    public void setDerecha(Nodo_Pais Derecha) {
        this.Derecha = Derecha;
    }
    
    
    
}
