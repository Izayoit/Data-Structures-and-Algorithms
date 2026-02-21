
package Arreglo;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import modelo.comunidad;
import modelo.enlace;


public class Grafo {
    
    ArrayList<Nodo> lista = new ArrayList<>();

    public ArrayList<Nodo> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Nodo> lista) {
        this.lista = lista;
    }
    
    public void Agregar_Nodo(comunidad elemento){
        
        if(elemento.getLimite_poblacacion()<=100&&elemento.getPoblacion_acutal()<elemento.getLimite_poblacacion()){
        
       Nodo nuevo = new Nodo(elemento);
       lista.add(nuevo);
        }else{
            JOptionPane.showMessageDialog(null, "el limite es 100 o no puede mas que el maximo del limite");
        }
       
       
    }
    public void eliminar_nodo(String nombre){
    
   Nodo buscado = buscar_Nodo(nombre);
   lista.remove(buscado);
   
    Eliminar_Enlaces(nombre);
   
    
    }
    public Nodo buscar_Nodo(String nombre){
        
        for (int pos = 0; pos < lista.size(); pos++) {
            if (lista.get(pos).getElemento().getNombre().equals(nombre)) {
                return lista.get(pos);
            }
        }
    
    return null;
    }
    
    public void Eliminar_Enlaces(String nombre){
    
        for (int pos = 0; pos < lista.size(); pos++) {
            ArrayList<enlace> arista = lista.get(pos).getArista();
            for (int i = 0; i < arista.size(); i++) {
                
                if (arista.get(i).getEnlace().getElemento().getNombre().equals(nombre)) {
                    arista.remove(i);
                }
                
            }
        }
    
    
    }
    
 public void editarNodo(String nombreOriginal, comunidad nuevosDatos) {
    Nodo nodoExistente = buscar_Nodo(nombreOriginal);

    if (nodoExistente != null) {
        if (nuevosDatos.getLimite_poblacacion() <= 100) {
            
            nodoExistente.getElemento().setNombre(nuevosDatos.getNombre());
            nodoExistente.getElemento().setPoblacion_acutal(nuevosDatos.getPoblacion_acutal());
            nodoExistente.getElemento().setLimite_poblacacion(nuevosDatos.getLimite_poblacacion());
            JOptionPane.showMessageDialog(null, "Comunidad actualizada correctamente.");
        } else {
            JOptionPane.showMessageDialog(null, "El límite poblacional no puede exceder los 100.");
        }
    } else {
        JOptionPane.showMessageDialog(null, "Comunidad no encontrada.");
    }
}
 
 
  public boolean desplazarPoblacion(String origen, String destino, int cantidad) {
    Nodo nodoOrigen = buscar_Nodo(origen);
    Nodo nodoDestino = buscar_Nodo(destino);

    if (nodoOrigen != null && nodoDestino != null) {
        comunidad comOrigen = nodoOrigen.getElemento();
        comunidad comDestino = nodoDestino.getElemento();

        if (comOrigen.getPoblacion_acutal() >= cantidad &&
            comDestino.getPoblacion_acutal() + cantidad <= comDestino.getLimite_poblacacion()) {
            
            comOrigen.setPoblacion_acutal(comOrigen.getPoblacion_acutal() - cantidad);
            comDestino.setPoblacion_acutal(comDestino.getPoblacion_acutal() + cantidad);
            return true; // Desplazamiento exitoso
        } else {
            JOptionPane.showMessageDialog(null, "No se puede desplazar. Revisa la población y el límite.");
        }
    }
    return false; //  No se pudo desplazar
}

    public void Agregar_Conexion(String origen ,String destino,int desplazamiento){
    if(desplazamiento<100){
    Nodo LugarOrigen = buscar_Nodo(origen);
    Nodo LugarDestino = buscar_Nodo(destino);
    
    enlace arista1= new enlace(desplazamiento, LugarOrigen);
    enlace arista2 = new enlace(desplazamiento, LugarDestino);
    
    LugarDestino.registrar_Arista(arista1);
    LugarOrigen.registrar_Arista(arista2);
    
    }else{JOptionPane.showMessageDialog(null, "el desplazamiento maximo es 100");}
  
    }
    
    public void eliminar_conexion(String origen,String destino){
    
    Nodo LugarOrigen = buscar_Nodo(origen);
   Nodo LugarDestino = buscar_Nodo(destino);
   
   int pos1 = LugarDestino.buscar_arista(origen);
   int pos2 = LugarOrigen.buscar_arista(destino);
   if(pos1!=-1){
   LugarDestino.eliminar_Arista(pos1);
   }
   if(pos2!=-1){
    LugarOrigen.eliminar_Arista(pos2);
   }
  
   
    }
    
    
    public void editarConexion(String origen, String destino, int nuevoDesplaz) {
    Nodo nodoOrigen = buscar_Nodo(origen);
    Nodo nodoDestino = buscar_Nodo(destino);

    int pos1 = nodoOrigen.buscar_arista(destino);
    int pos2 = nodoDestino.buscar_arista(origen);

    if (pos1 != -1 && pos2 != -1) {
        nodoOrigen.getArista().get(pos1).setDesplazamiento(nuevoDesplaz);
        nodoDestino.getArista().get(pos2).setDesplazamiento(nuevoDesplaz);
    } else {
        JOptionPane.showMessageDialog(null, "La conexión no existe");
    }
}
    
    public void listar(JTable control){
    
        DefaultTableModel modtable = new DefaultTableModel(new String[]{"nombre","limite","actual"}, 0);
    control.setModel(modtable);

        for (int i = 0; i < lista.size(); i++) {
            
            modtable.addRow(lista.get(i).getElemento().getRegistro());
            
        }
  
    
    }
    
}
