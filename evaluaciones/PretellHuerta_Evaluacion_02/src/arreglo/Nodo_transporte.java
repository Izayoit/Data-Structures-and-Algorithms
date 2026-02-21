
package arreglo;

import modelo.Empresa_transportes;


public class Nodo_transporte {
   private Nodo_transporte siguiente, anterior;
   private Empresa_transportes elemento;

    public Nodo_transporte(Empresa_transportes elemento) {
        this.elemento = elemento;
        siguiente=anterior=null;
    }

    public Nodo_transporte getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo_transporte siguiente) {
        this.siguiente = siguiente;
    }

    public Nodo_transporte getAnterior() {
        return anterior;
    }

    public void setAnterior(Nodo_transporte anterior) {
        this.anterior = anterior;
    }

    public Empresa_transportes getElemento() {
        return elemento;
    }

    public void setElemento(Empresa_transportes elemento) {
        this.elemento = elemento;
    }
   

   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
}
