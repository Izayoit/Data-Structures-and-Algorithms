
package arreglo;

import java.util.ArrayList;
import modelo.enlace;
import modelo.numero;


public class Nodo {
    private ArrayList<enlace> Arista = new ArrayList<>();
    private numero elemento;
    private boolean Visitado;

    public Nodo(numero elemento) {
        this.elemento = elemento;
    }

    public boolean isVisitado() {
        return Visitado;
    }

    public void setVisitado(boolean Visitado) {
        this.Visitado = Visitado;
    }

    public ArrayList<enlace> getArista() {
        return Arista;
    }

    public void setArista(ArrayList<enlace> Arista) {
        this.Arista = Arista;
    }

    public numero getElemento() {
        return elemento;
    }

    public void setElemento(numero elemento) {
        this.elemento = elemento;
    }
    
    public void agreger_arista(enlace enlace1){
    
        Arista.add(enlace1);
     
}
    public int buscar_arista(int numero){
        for (int pos = 0; pos < Arista.size(); pos++) {
            
            if (Arista.get(pos).getEnlace().getElemento().getNumero()==numero) {
                return pos;
            }
        }
    return -1;
    
    }
    
    
    public void eliminar_arista(int pos){
    Arista.remove(pos);
    
    }
    
    
    
    
    
}
