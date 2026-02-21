package Control;


import Modelo.album;

public class Nodo_album {
    private album Elemento;
    private Nodo_album Siguiente, Anterior;

    public Nodo_album(album Elemento) {
        this.Elemento = Elemento;
        Siguiente = Anterior = null;
    }

    public album getElemento() {
        return Elemento;
    }

    public void setElemento(album Elemento) {
        this.Elemento = Elemento;
    }

    public Nodo_album getSiguiente() {
        return Siguiente;
    }

    public void setSiguiente(Nodo_album Siguiente) {
        this.Siguiente = Siguiente;
    }

    public Nodo_album getAnterior() {
        return Anterior;
    }

    public void setAnterior(Nodo_album Anterior) {
        this.Anterior = Anterior;
    }

   
   
    
    
}
