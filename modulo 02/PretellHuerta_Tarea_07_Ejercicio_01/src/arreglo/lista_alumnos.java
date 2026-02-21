
package arreglo;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import modelo.Alumnos;

public class lista_alumnos {
    
    Nodo_alumnos fin,inicio;


    public lista_alumnos() {
        fin=null;
    }

    public Nodo_alumnos getFin() {
        return fin;
    }

    public void setFin(Nodo_alumnos fin) {
        this.fin = fin;
    }

    public Nodo_alumnos getInicio() {
        return inicio;
    }

    public void setInicio(Nodo_alumnos inicio) {
        this.inicio = inicio;
    }
    
    public void apilar(Alumnos elemento){
        
        Nodo_alumnos nuevo = new Nodo_alumnos(elemento);
        if(inicio==null){
        
        inicio=fin=nuevo;
        
        }else{
         fin.setSiguiente(nuevo);
         fin=nuevo;
        
        }
    
      
    }
    
 public void RecorrerFila(JTable control){
 String[] cabezera={"nombre","codigo","escuela","dni"};
     DefaultTableModel modtable =new DefaultTableModel(cabezera, 0);
     control.setModel(modtable);
   Nodo_alumnos auxiliar = inicio;
     while (auxiliar!=null) {         
         modtable.addRow(auxiliar.getElemento().getRegistro());
         auxiliar=auxiliar.getSiguiente();
     }
 
 
 }
 
 public Alumnos desapilar(){
     if (!InicioVacio()) {
         Alumnos temp=inicio.getElemento();
         inicio=inicio.getSiguiente();
         return temp;
        
     }
 
 return null;
 }
 public void decapitar(){
 
 if (!InicioVacio()) {
 
         inicio=inicio.getSiguiente();
         
        
     }
 
 }
 public Alumnos cima(){
 
 
  if (!InicioVacio()) {
 
         return inicio.getElemento();
         
        
     }
     return null;
 }
 
 public boolean InicioVacio(){
 return inicio==null;
 }
 
 public void eliminar(){
 
     inicio=null;
 
 }       
         
         
 
    
    
}
