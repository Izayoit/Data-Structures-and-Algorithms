
package arreglo;

import java.util.ArrayList;
import modelo.Enlace;
import modelo.Estudiantes;

public class Grafo {
    
    private ArrayList<Nodo> lista = new ArrayList<>();

    public ArrayList<Nodo> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Nodo> lista) {
        this.lista = lista;
    }
    
    public void Agregar_Nodo(Estudiantes elemento){
    
        Nodo nuevo = new Nodo(elemento);
        lista.add(nuevo);
    }
    
    public void eliminar_Nodo(String nombre){
    
    Nodo buscado = Buscar_Nodo(nombre);
    lista.remove(buscado);
    Eliminar_Enlaces(nombre);
    
    }
    
    public void Eliminar_Enlaces(String nombre){
        for (int i = 0; i <lista.size(); i++) {
            ArrayList<Enlace> Arista = lista.get(i).getAristas();
            for (int j = 0; j < Arista.size(); j++) {
                if (Arista.get(j).getEnlace().getElemento().getNombre().equals(nombre)) {
                    Arista.remove(j);
                }
                
            }
            
        }
    
    }
    public Nodo Buscar_Nodo(String nombre){
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getElemento().getNombre().equals(nombre)) {
                return lista.get(i);
            }
            
        }
    return null;
    }
    
    public void Agregar_conexion(String origen,String destino,int peso){
    
     Nodo Origen = Buscar_Nodo(origen);
     Nodo Destino = Buscar_Nodo(destino);
     
     Enlace Arista1= new Enlace(peso, Destino);
     Enlace Arista2 = new Enlace(peso, Origen);
     
     Origen.Argregar_Arista(Arista1);
     Destino.Argregar_Arista(Arista2);
    
    
    }
    
    public void Eliminar_conexion(String origen ,String destino){
    
    Nodo CiudadOrigen = Buscar_Nodo(origen); //origen encontrado
    Nodo CiudadDestino = Buscar_Nodo(destino); //destino encontrado
    
    int pos1 = CiudadDestino.buscar_arista(origen);
    int pos2 = CiudadOrigen.buscar_arista(destino);
        if (pos1!=-1) {
            CiudadOrigen.Eliminar_Arista(pos1);
        }
        if (pos2!=-1) {
            CiudadDestino.Eliminar_Arista(pos2);
        }
    
    
    
    
    
    }
    
    
    
    
    
    
    
    
    
    
    
    
}
