package Control;

import Modelo.Ciudad;
import Modelo.Enlace;
import java.util.ArrayList;

public class Nodo {

    private Ciudad elemento;
    private ArrayList<Enlace> aristas = new ArrayList<>();
    private boolean visitado;

    public Ciudad getElemento() {
        return elemento;
    }

    public void setElemento(Ciudad elemento) {
        this.elemento = elemento;
    }

    public ArrayList<Enlace> getAristas() {
        return aristas;
    }

    public void setAristas(ArrayList<Enlace> aristas) {
        this.aristas = aristas;
    }

    public boolean isVisitado() {
        return visitado;
    }

    public void setVisitado(boolean visitado) {
        this.visitado = visitado;
    }

    public Nodo(Ciudad elemento) {
        this.elemento = elemento;
    }

    public void Agregar_Arista(Enlace arista) {
        aristas.add(arista);
    }

    public int Buscar_Aristas(String nombre) {
        
        for (int i = 0; i < aristas.size(); i++) {
            if (aristas.get(i).getEnlace().getElemento().getNombre().equals(nombre)) {
                return i;
            }
        }
     return -1;
     
    }

    public void Eliminar_Aristas(int pos) {
        aristas.remove(pos);
    }
    
public Enlace Buscar_EnlacePorNombre(String nombreDestino) {
    for (Enlace enlace : aristas) {
        if (enlace.getEnlace().getElemento().getNombre().equals(nombreDestino)) {
            return enlace;
        }
    }
    return null;
}
 public Enlace obtenerConexionMasCortaTiempo() {
    if (aristas == null || aristas.isEmpty()) {
        return null;
    }

    Enlace masCorta = aristas.get(0);

    for (int i = 1; i < aristas.size(); i++) {
        Enlace actual = aristas.get(i);
        if (actual.getTiempo() < masCorta.getTiempo()) {
            masCorta = actual;
        }
    }

    return masCorta;
}
  public Enlace obtenerConexionMasCortaCosto() {
    if (aristas == null || aristas.isEmpty()) {
        return null;
    }

    Enlace masCorta = aristas.get(0);

    for (int i = 1; i < aristas.size(); i++) {
        Enlace actual = aristas.get(i);
        if (actual.getCosto_Economico() < masCorta.getCosto_Economico()) {
            masCorta = actual;
        }
    }

    return masCorta;
}
   public Enlace obtenerConexionMasCortaCosto_y_Tiempo() {
    if (aristas == null || aristas.isEmpty()) {
        return null;
    }

    Enlace masCorta = aristas.get(0);

    for (int i = 1; i < aristas.size(); i++) {
        Enlace actual = aristas.get(i);
        
        
        if (actual.getCosto_Economico()+actual.getTiempo() < masCorta.getCosto_Economico()+masCorta.getTiempo()) {
            masCorta = actual;
        }
    }

    return masCorta;
}
  
  
  
}
