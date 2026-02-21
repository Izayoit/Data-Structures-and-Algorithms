package Control;

import Modelo.Paquete;

public class Nodo_Paquete 
{
    private Paquete Elemento;
    private Nodo_Paquete Siguiente;

    public Nodo_Paquete(Paquete Elemento) {
        this.Elemento = Elemento;
        Siguiente = null;
    }

    public Paquete getElemento() { return Elemento; }
    public void setElemento(Paquete Elemento) { this.Elemento = Elemento; }
    public Nodo_Paquete getSiguiente() { return Siguiente; }
    public void setSiguiente(Nodo_Paquete Siguiente) { this.Siguiente = Siguiente; }
    
    
}
