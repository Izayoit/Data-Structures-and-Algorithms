package arreglo;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import modelo.Enlace;
import modelo.usuario;

public class grafo {

    ArrayList<Nodo> lista = new ArrayList<>();
Nodo raiz;

    public Nodo getRaiz() {
        return raiz;
    }

    public void setRaiz(Nodo raiz) {
        this.raiz = raiz;
    }
    public ArrayList<Nodo> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Nodo> lista) {
        this.lista = lista;
    }

    public void agregar_nodo(usuario elemento) {
      if(buscar_nodo(elemento.getTipo_conex())==null){//no repite nombres
        Nodo nuevo = new Nodo(elemento);
        lista.add(nuevo);
     }else{
          JOptionPane.showMessageDialog(null, "el nombre ya fue registrado");
      }
    }

    public Nodo buscar_nodo(String nombre) {

        for (int pos = 0; pos < lista.size(); pos++) {

            if (lista.get(pos).getElemento().getTipo_conex().equals(nombre)) {
                return lista.get(pos);
            }

        }
        return null;

    }

    public void eliminar_nodo(String nombre) {

        Nodo buscar = buscar_nodo(nombre);
        lista.remove(buscar);
        eliminar_enlaces(nombre);

    }

    public void eliminar_enlaces(String nombre) {

        for (int i = 0; i < lista.size(); i++) {
            ArrayList<Enlace> Aristas = lista.get(i).getArista();//obtener las arista relacionadas
            for (int j = 0; j < Aristas.size(); j++) {
                if (Aristas.get(j).getEnlace().getElemento().getTipo_conex().equals(nombre)) {
                    Aristas.remove(j);
                }
            }
        }

    }

    public void agregar_conexion(String origen, String destino, int litros_diarios,
           
       int capacidad_almacenimiento, int nivel_actual) {
        if (buscar_nodo(origen)!=buscar_nodo(destino)) {
            
        
       Nodo BuscarOrigen = buscar_nodo(origen);
        Nodo BuscarDestino = buscar_nodo(destino);
        
     Enlace arista1 = new Enlace(BuscarOrigen, litros_diarios, capacidad_almacenimiento, nivel_actual);
     Enlace arista2 = new Enlace(BuscarDestino, litros_diarios, capacidad_almacenimiento, nivel_actual);
        
     
     BuscarOrigen.agregar_Arista(arista2);
     BuscarDestino.agregar_Arista(arista1);
        }else {
            JOptionPane.showMessageDialog(null, "no se puede enlazar mismo nodo");
        
        }
        
        
    }
    public void eliminar_conexion(String origen,String destino){
    
     Nodo BuscarOrigen = buscar_nodo(origen);
     Nodo BuscarDestino = buscar_nodo(destino);
    
    int pos1 = BuscarDestino.buscar_Arista(origen);
    int pos2 = BuscarOrigen.buscar_Arista(destino);
    if(pos1!=-1){
    
      BuscarDestino.eliminar_arista(pos1);
    }
  if(pos2!=-1){
  BuscarOrigen.eliminar_arista(pos2);
  }
    
    
    
    
    
    
    
    }
    
    
    public Nodo insertar(usuario elemento,Nodo raiz){
        
    if(raiz==null){
        
    Nodo nuevo = new  Nodo(elemento);
    
    return nuevo;
    
    }else{
    
        if (elemento.getNumero_conexion()<raiz.getElemento().getNumero_conexion()) {
            raiz.setIzquierda(insertar(elemento, raiz.getIzquierda()));
        }else if(elemento.getNumero_conexion()>raiz.getElemento().getNumero_conexion()){
        raiz.setDerecha(insertar(elemento, raiz.getDerecha()));
        }else{
        
        JOptionPane.showMessageDialog(null, " esta conexion fue usada");
        } 
    }
    return raiz;
    }

    public void listar(JTable control){
    
    
        DefaultTableModel modtable = new DefaultTableModel(new String[]{"nombre","N°conexion","tipo conexion","monto"}, 0);
        control.setModel(modtable);
        inorder(modtable, raiz);
  
    }
    public void inorder(DefaultTableModel modtable, Nodo raiz){
       if(raiz!=null){
       
           inorder(modtable, raiz.getIzquierda());
          modtable.addRow(raiz.getElemento().getRegistro());
           inorder(modtable, raiz.getDerecha());
       }
   
   
   
   }
    
    
    
    
    
    
    
}
