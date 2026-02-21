package Control;

import Modelo.Alumno;

public class Nodo_Doble {
    private Alumno Elemento;
    private Nodo_Doble Siguiente;
    private Nodo_Doble Anterior;
    
    public Nodo_Doble(Alumno Elemento){
        this.Elemento = Elemento;
        Siguiente = Anterior = null;
    }

    public Alumno getElemento() { return Elemento; }

    public void setElemento(Alumno Elemento) { this.Elemento = Elemento; }

    public Nodo_Doble getSiguiente() { return Siguiente; }

    public void setSiguiente(Nodo_Doble Siguiente) { this.Siguiente = Siguiente; }

    public Nodo_Doble getAnterior() { return Anterior; }

    public void setAnterior(Nodo_Doble Anterior) { this.Anterior = Anterior; }
    
    
}
