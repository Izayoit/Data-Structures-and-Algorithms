
package arreglo;

import modelo.chofer_contratado;


public class Nodo_conductores {
  private Nodo_conductores siguiente, anterior;
  private chofer_contratado elemento;

    public Nodo_conductores(chofer_contratado elemento) {
        this.elemento = elemento;
        siguiente=anterior=null;
    }

    public Nodo_conductores getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo_conductores siguiente) {
        this.siguiente = siguiente;
    }

    public Nodo_conductores getAnterior() {
        return anterior;
    }

    public void setAnterior(Nodo_conductores anterior) {
        this.anterior = anterior;
    }

    public chofer_contratado getElemento() {
        return elemento;
    }

    public void setElemento(chofer_contratado elemento) {
        this.elemento = elemento;
    }
  
  
}
