package Control;

import Modelo.Producto;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Lista_Simple_Circular {
    private Nodo inicio;
    private Nodo fin;
    
    public Lista_Simple_Circular(){
        inicio = fin = null;
    }

    public Nodo getInicio() {
        return inicio;
    }

    public void setInicio(Nodo inicio) {
        this.inicio = inicio;
    }

    public Nodo getFin() {
        return fin;
    }

    public void setFin(Nodo fin) {
        this.fin = fin;
    }        
    
    public void Agregar(Producto elemento){
     Nodo nuevo = new Nodo(elemento);
     
     if(inicio==null){
     
     inicio=fin=nuevo;
     
     }else{
         
     fin.setSiguiente(nuevo); //nuevo = todo el nodo 
     
     fin=nuevo;
     
     
     }
     
     fin.setSiguiente(inicio);
     
        
        
    }
    
    // Inicio --> [8]  / Fin --> [24]
    // Lista [ 8 | 5 ] -> [ 5 | 3 ] -> [ 3 | 89 ] -> [ 89 | 24 ] --> [ 24 | 8 ]
    
    // Nuevo --> [ 24 | null]
    
    public void Listar(JTable control){
       String[]cabezera = {"codigo","descripcion","stock"};
       DefaultTableModel modtable = new DefaultTableModel(cabezera, 0);
        control.setModel(modtable);
        
     
        
        if (inicio!=null) {            
               Nodo auxiliar = inicio;
            do {                
                  modtable.addRow(auxiliar.getElemento().getRegistro());
                  auxiliar=auxiliar.getSiguiente();
                    
            } while (auxiliar!=inicio);
            
  
            
        }
    }
    
    public Nodo Buscar(int codigo){
   
    if(inicio!=null){
         Nodo auxiliar = inicio;
        do {   
            if(auxiliar.getElemento().getCodigo()==codigo){
            return auxiliar;
            
            } 
            auxiliar=auxiliar.getSiguiente();
        } while (auxiliar!=inicio);
    }
        return null;
    }
    
    
    
}
