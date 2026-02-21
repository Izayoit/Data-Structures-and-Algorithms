package Control;

import Modelo.usuario;

public class Nodo_Usuario {
    private usuario Elemento;
    private Nodo_Usuario Izquierda, Derecha;
    
    public Nodo_Usuario(usuario Elemento){
        this.Elemento = Elemento;
        Izquierda = Derecha = null;
    }

    public usuario getElemento() {
        return Elemento;
    }

    public void setElemento(usuario Elemento) {
        this.Elemento = Elemento;
    }

    public Nodo_Usuario getIzquierda() {
        return Izquierda;
    }

    public void setIzquierda(Nodo_Usuario Izquierda) {
        this.Izquierda = Izquierda;
    }

    public Nodo_Usuario getDerecha() {
        return Derecha;
    }

    public void setDerecha(Nodo_Usuario Derecha) {
        this.Derecha = Derecha;
    }
    
    
    
}
