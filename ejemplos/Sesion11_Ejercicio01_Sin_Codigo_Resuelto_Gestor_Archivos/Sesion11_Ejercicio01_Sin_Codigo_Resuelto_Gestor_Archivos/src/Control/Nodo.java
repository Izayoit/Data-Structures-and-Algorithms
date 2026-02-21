package Control;

import Modelo.Ciudad;
import Modelo.Enlace;
import java.util.ArrayList;

public class Nodo 
{
    private Ciudad Elemento;
    private ArrayList<Enlace> Aristas = new ArrayList<Enlace>();
    private boolean Visitado;
    
    public Nodo(Ciudad Elemento){
        this.Elemento = Elemento;
    }
    
    //Agregar
    public void Agregar_Arista(Enlace Arista){
        Aristas.add(Arista);
    }
    
    //Eliminar
    public void Eliminar_Arista(int Pos){
        Aristas.remove(Pos);
    }
    
    //Buscar
    public int Buscar_Arista(String Nombre){
        for (int i = 0; i < Aristas.size(); i++) {
            if(Aristas.get(i).getEnlace().
                    getElemento().getNombre().equals(Nombre)){
                return i;
            }
        }
        return -1;
    }

    public Ciudad getElemento() {
        return Elemento;
    }

    public void setElemento(Ciudad Elemento) {
        this.Elemento = Elemento;
    }

    public ArrayList<Enlace> getAristas() {
        return Aristas;
    }

    public void setAristas(ArrayList<Enlace> Aristas) {
        this.Aristas = Aristas;
    }

    public boolean isVisitado() {
        return Visitado;
    }

    public void setVisitado(boolean Visitado) {
        this.Visitado = Visitado;
    }
    
    
    
}
