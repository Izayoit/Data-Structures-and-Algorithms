package Control;

import Modelo.Ciudad;
import Modelo.Enlace;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Grafo
{
    private ArrayList<Nodo> Lista = new ArrayList<Nodo>();

    public ArrayList<Nodo> getLista() {
        return Lista;
    }

    public void setLista(ArrayList<Nodo> Lista) {
        this.Lista = Lista;
    }
    
    //Agregar
    public void Agregar(Ciudad Elemento){
        Nodo Nuevo = new Nodo(Elemento);
        Lista.add(Nuevo);
    }
    
    //Eliminar
    public void Eliminar(String Nombre){        
        Lista.remove(BuscarCiudad(Nombre));
        Eliminar_Enlaces(Nombre);
    }
    
    //Eliminar Enlaces
    public void Eliminar_Enlaces(String Origen){
        for (int x = 0; x < Lista.size(); x++) {
            ArrayList<Enlace> Aristas = Lista.get(x).getAristas();
            for (int y = 0; y < Aristas.size(); y++) {
                if(Aristas.get(y).getEnlace().
                        getElemento().getNombre().equals(Origen)){
                    Aristas.remove(y);
                }
            }
        }
    }
    
    //Buscar
    public Nodo BuscarCiudad(String Nombre){
        for (int i = 0; i < Lista.size(); i++) {
            if(Lista.get(i).getElemento().getNombre().equals(Nombre)){
                return Lista.get(i);
            }
        }
        return null;
    }
    
    public void Agregar_Enlace(String Origen, String Destino, int Peso){
        Nodo CiudadOrigen = BuscarCiudad(Origen);
        Nodo CiudadDestino = BuscarCiudad(Destino);
        Enlace Arista1 = new Enlace(Peso, CiudadDestino);
        CiudadOrigen.Agregar_Arista(Arista1);
        Enlace Arista2 = new Enlace(Peso, CiudadOrigen);            
        CiudadDestino.Agregar_Arista(Arista2);
    }
    
    public void Eliminar_Enlace(String Origen, String Destino){
        Nodo CiudadOrigen = BuscarCiudad(Origen);
        int Pos1 = CiudadOrigen.Buscar_Arista(Destino);
        if(Pos1 != -1){
            CiudadOrigen.Eliminar_Arista(Pos1);
        }
        Nodo CiudadDestino = BuscarCiudad(Destino);
        int Pos2 = CiudadDestino.Buscar_Arista(Origen);
        if(Pos2 != -1){
            CiudadDestino.Eliminar_Arista(Pos2);
        }
    }
    
    public void Recorrido_Anchura(JTable control){
        String[] cabecera = {"Ciudad","Población",""};
        DefaultTableModel modTabla = new DefaultTableModel(cabecera,0);
        control.setModel(modTabla);
        
        for (int i = 0; i < Lista.size(); i++) {
            Lista.get(i).setVisitado(false);
        }
        
        Deque<Nodo> Cola = new ArrayDeque<Nodo>();
        Nodo Actual;
        
        if(Lista.isEmpty() == false){
            Lista.get(0).setVisitado(true);
            Cola.addLast(Lista.get(0));
            while(Cola.isEmpty() == false){
                Actual = Cola.removeFirst();
                modTabla.addRow(Actual.getElemento().getRegistro());
                String Enlaces = "";
                for (int i = 0; i < Actual.getAristas().size(); i++) {
                    Enlace Arista = Actual.getAristas().get(i);
                    Nodo Vecino = Arista.getEnlace();
                    if(Vecino.isVisitado() == false){
                        Cola.addLast(Vecino);
                        Vecino.setVisitado(true);
                    }
                    Enlaces = Enlaces + " [ " + 
                            Vecino.getElemento().getNombre() + 
                            " ( " + Arista.getPeso() + " ) ]";
                }
                if(modTabla.getColumnCount() > 0){
                    modTabla.setValueAt(Enlaces, 
                            modTabla.getRowCount() - 1, 2);
                }
            }
        }
    }
}
