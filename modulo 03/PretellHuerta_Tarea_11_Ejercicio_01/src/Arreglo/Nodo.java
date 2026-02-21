
package Arreglo;

import java.util.ArrayList;
import modelo.comunidad;
import modelo.enlace;


public class Nodo {
    private ArrayList <enlace> arista = new ArrayList<>();
    private comunidad elemento;

    public Nodo(comunidad elemento) {
        this.elemento = elemento;
    }

    public ArrayList<enlace> getArista() {
        return arista;
    }

    public void setArista(ArrayList<enlace> arista) {
        this.arista = arista;
    }

    public comunidad getElemento() {
        return elemento;
    }

    public void setElemento(comunidad elemento) {
        this.elemento = elemento;
    }
    public void registrar_Arista(enlace dato){
        arista.add(dato);
    
    }
    public int buscar_arista(String nombre){
    
        for (int i = 0; i < arista.size(); i++) {
            if (arista.get(i).getEnlace().getElemento().getNombre().equals(nombre)) {
                return i;
            }
        }
    return -1;
    }
    public void eliminar_Arista(int pos){
    
     arista.remove(pos);
    
    }
    
    
}
