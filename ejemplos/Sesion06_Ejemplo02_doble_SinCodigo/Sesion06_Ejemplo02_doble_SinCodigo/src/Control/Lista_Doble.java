package Control;

import Modelo.Producto;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Lista_Doble {
    private Nodo inicio, fin;

    public Lista_Doble() {
        inicio = fin = null;
    }

    public Nodo getInicio() {
        return inicio;
    }

    public void setInicio(Nodo Inicio) {
        this.inicio = Inicio;
    }

    public Nodo getFin() {
        return fin;
    }

    public void setFin(Nodo Fin) {
        this.fin = Fin;
    }
    
  
    
    public void Agregar(Producto Elemento){
      Nodo nuevo = new Nodo(Elemento);
      
     if(inicio==null){
     
     inicio=fin=nuevo;
     
     }else{
         //hablamos de nuevo
     fin.setSiguiente(nuevo); //nuevo = todo el nodo 
     nuevo.setAnterior(fin);
     
     fin=nuevo;
     
     
     }
     //unaves echo ahora nuevo es fin entonces==
     fin.setSiguiente(inicio);
     inicio.setAnterior(fin);
        
          
    }
    
    public void Listar(JTable Control){
       String[]cabezera = {"codigo","descripcion","stock"};
       DefaultTableModel modtable = new DefaultTableModel(cabezera, 0);
        Control.setModel(modtable);
        
     
        
        if (inicio!=null) {            
               Nodo auxiliar = inicio;
            do {                
                  modtable.addRow(auxiliar.getElemento().getRegistro());
                  auxiliar=auxiliar.getSiguiente();
                    
            } while (auxiliar!=inicio);
            
  
            
        }              
    }
    
    public Nodo Buscar(int Codigo){
          
        
        
    if(inicio!=null){
         Nodo auxiliar = inicio;
        do {   
            if(auxiliar.getElemento().getCodigo()==Codigo){
            return auxiliar;
            
            } 
            auxiliar=auxiliar.getSiguiente();
        } while (auxiliar!=inicio);
    }
        return null;
    }
        
    
    
    // Inicio --> [34]  / Fin --> [15]
    // Lista  <-- [15 | 34 | 28]-->  <-- [ 34 | 28 | 15 ] --> <-- [ 28 | 15 | 34] -->
    
    public void Eliminar_Inicio(){
      
        
    }
    
    public void Eliminar(Nodo Auxiliar){
         if(inicio==fin){
      
           inicio=fin=null;
      
      }else if(inicio==Auxiliar){ 
        inicio=inicio.getSiguiente();
        inicio.setAnterior(fin);
        fin.setSiguiente(inicio);
        
        
        }else if(fin==Auxiliar){
        fin = fin.getAnterior();//retrocedo un nodo 
        fin.setSiguiente(inicio);
        inicio.setSiguiente(fin);
       
        
        
        }else{
        Nodo siguiente = Auxiliar.getSiguiente();//3
        Nodo anterior = Auxiliar.getAnterior();//1
        
        
        anterior.setSiguiente(siguiente);
        siguiente.setAnterior(anterior);
        
        }    
       
        
    }
    
    
    
    
    public void Ordenar_PorSeleccion(){

    }    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
