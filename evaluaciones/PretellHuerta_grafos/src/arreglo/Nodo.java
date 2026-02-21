
package arreglo;

import java.util.ArrayList;
import modelo.Enlace;
import modelo.Estudiantes;


public class Nodo {
    
    private ArrayList<Enlace> Aristas = new ArrayList<>();
    private Estudiantes Elemento;

    public Nodo(Estudiantes Elemento) {
        this.Elemento = Elemento;
    }

    public ArrayList<Enlace> getAristas() {
        return Aristas;
    }

    public void setAristas(ArrayList<Enlace> Aristas) {
        this.Aristas = Aristas;
    }

    public Estudiantes getElemento() {
        return Elemento;
    }

    public void setElemento(Estudiantes Elemento) {
        this.Elemento = Elemento;
    }
    
    public void Argregar_Arista(Enlace elemento){
        
    Aristas.add(elemento);

    }
    public int buscar_arista(String nombre){
    
        for (int pos = 0; pos < Aristas.size(); pos++) {
            if (Aristas.get(pos).getEnlace().getElemento().getNombre().equals(nombre)) {
                return pos;
            }
        }
        return -1;
    }
    public void Eliminar_Arista(int pos){
        
        Aristas.remove(pos);
        
   
}
}