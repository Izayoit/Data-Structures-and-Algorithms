package Control;

import Modelo.Ciudad;
import Modelo.Enlace;
import java.util.ArrayList;

public class Nodo {
    private ArrayList<Enlace> Aristas = new ArrayList<Enlace>(); //crea lista vacia de enlaces aun no creados
    private Ciudad elemento;
    private boolean visitado;

    public Nodo(Ciudad elemento) {
        this.elemento = elemento;
       
    }
    
    public void Agregar_Arista(Enlace arista){
        Aristas.add(arista); //creo la conexion que puede ser de un punto a otro
    
    }
    public int Buscar_Arista(String nombre){ //busca la posicion de destino
    for (int pos= 0; pos < Aristas.size(); pos++) {
            if (Aristas.get(pos).getEnlace().getElemento().getNombre().equals(nombre)) {
                return pos;
            }
            
        }
        return -1;
    }
    public void Eliminar_Arista(int pos){ //usando el metodo buscar hallas el destimo y lo eliminar usando este metodo
       Aristas.remove(pos);
    }

    public ArrayList<Enlace> getAristas() {
        return Aristas;
    }

    public void setAristas(ArrayList<Enlace> Aristas) {
        this.Aristas = Aristas;
    }

    public Ciudad getElemento() {
        return elemento;
    }

    public void setElemento(Ciudad elemento) {
        this.elemento = elemento;
    }

    public boolean isVisitado() {
        return visitado;
    }

    public void setVisitado(boolean visitado) {
        this.visitado = visitado;
    }
    
    
    
}
