package Control;

import Modelo.Ciudad;
import Modelo.Enlace;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Grafo {

    private ArrayList<Nodo> lista = new ArrayList<Nodo>();

    public ArrayList<Nodo> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Nodo> lista) {
        this.lista = lista;
    }

    public void Agregar_Nodo(Ciudad elemento) {
        Nodo nuevo = new Nodo(elemento);
        lista.add(nuevo);

    }

    public void Eliminar_Nodo(String nombre) { //si quiero eliminar un nodo tengo que eliminar de la lista como us enlace

        Nodo buscado = Buscar_ciudad(nombre);
        lista.remove(buscado); //listapricipal
        Eliminar_Enlaces(nombre); //verifica si el nombre fue eliminado y si esta lo quita
    }

    public void Eliminar_Enlaces(String origen) {
        for (int x = 0; x < lista.size(); x++) { 
            ArrayList<Enlace> aristas = lista.get(x).getAristas(); //recupero las conexiones de cada nodo.
            for (int y = 0; y < aristas.size(); y++) {
                if(aristas.get(y).getEnlace().getElemento().getNombre().equals(origen)){
                aristas.remove(y);//recorro todas la aristas y procedo a remover si encuentra igualdad
                
                }
                
                
            }
        }
    }

    public Nodo Buscar_ciudad(String nombre) {
        for (int pos = 0; pos < lista.size(); pos++) {
            if(lista.get(pos).getElemento().getNombre().equals(nombre)){
            return lista.get(pos);
            
            }
        }
        return null;
    }
 //eliminar para la tarea 11.2
    public void Agregar_Enlace(String origen, String destino, int peso) { //agregar enlace

   Nodo CiudadOrigen= Buscar_ciudad(origen);
   Nodo CiudadDestino =Buscar_ciudad(destino);
   
    Enlace arista1 = new Enlace(peso, CiudadDestino);
   CiudadOrigen.Agregar_Arista(arista1);
   
     Enlace arista2 = new Enlace(peso, CiudadOrigen);
   CiudadDestino.Agregar_Arista(arista2);
        
    }
    
    public void Eliminar_Enlace(String origen, String destino) {
     Nodo CiudadOrigen= Buscar_ciudad(origen);
     Nodo CiudadDestino =Buscar_ciudad(destino);  
     int pos1 = CiudadOrigen.Buscar_Arista(destino);
     int pos2 = CiudadDestino.Buscar_Arista(origen);
        if (pos1!=-1) {
            CiudadOrigen.Eliminar_Arista(pos1);
        } 
        if(pos2!=-1){
            CiudadDestino.Eliminar_Arista(pos2);
        }
    }

    public void Recorrido_Anchura(JTable control) {

        
        
    }

}
