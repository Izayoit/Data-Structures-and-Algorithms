
package arreglo;

import java.util.ArrayList;
import modelo.Enlace;
import modelo.usuario;


public class Nodo {
    Nodo izquierda ,derecha;
    
    ArrayList<Enlace> Arista = new ArrayList<>();
    usuario elemento;

    

    

    public Nodo(usuario elemento) {
        this.elemento = elemento;
        izquierda=derecha=null;
    }

    public ArrayList<Enlace> getArista() {
        return Arista;
    }

    public Nodo getIzquierda() {
        return izquierda;
    }

    public void setIzquierda(Nodo izquierda) {
        this.izquierda = izquierda;
    }

    public Nodo getDerecha() {
        return derecha;
    }

    public void setDerecha(Nodo derecha) {
        this.derecha = derecha;
    }
    

    public void setArista(ArrayList<Enlace> Arista) {
        this.Arista = Arista;
    }

    public usuario getElemento() {
        return elemento;
    }

    public void setElemento(usuario elemento) {
        this.elemento = elemento;
    }

    
    public void agregar_Arista(Enlace nombre){
    Arista.add(nombre);
    
    }
    
    public int buscar_Arista(String nombre){
        for (int i = 0; i < Arista.size(); i++) {
            if (Arista.get(i).getEnlace().getElemento().getTipo_conex().equals(nombre)) {
                return i;
            }
        }
    return 0;
    }
    public void eliminar_arista(int pos){ //por la posicion
    Arista.remove(pos);
    
    }
    
    
    
    
    
    
    
    
    
}
