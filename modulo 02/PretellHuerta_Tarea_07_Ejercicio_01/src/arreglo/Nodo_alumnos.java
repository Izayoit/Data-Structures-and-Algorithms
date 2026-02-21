
package arreglo;

import modelo.Alumnos;


public class Nodo_alumnos {
    
    private Alumnos elemento;
    private Nodo_alumnos siguiente,anterior;

    public Nodo_alumnos(Alumnos elemento) {
        this.elemento = elemento;
        siguiente=anterior=null;
    }

    public Alumnos getElemento() {
        return elemento;
    }

    public Nodo_alumnos getAnterior() {
        return anterior;
    }

    public void setAnterior(Nodo_alumnos anterior) {
        this.anterior = anterior;
    }
    

    public void setElemento(Alumnos elemento) {
        this.elemento = elemento;
    }

    public Nodo_alumnos getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo_alumnos siguiente) {
        this.siguiente = siguiente;
    }
    
    
    
}
