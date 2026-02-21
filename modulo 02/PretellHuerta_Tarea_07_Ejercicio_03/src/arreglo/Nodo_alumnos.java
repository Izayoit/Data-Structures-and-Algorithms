
package arreglo;

import modelo.numeros;


public class Nodo_alumnos {
 numeros elemento;
 Nodo_alumnos siguiente;

    public Nodo_alumnos(numeros elemento) {
        this.elemento = elemento;
        siguiente=null;
    }

    public numeros getElemento() {
        return elemento;
    }

    public void setElemento(numeros elemento) {
        this.elemento = elemento;
    }

    public Nodo_alumnos getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo_alumnos siguiente) {
        this.siguiente = siguiente;
    }
    
    

    
    
    
}
