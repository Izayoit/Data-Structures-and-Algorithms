package Control;

import Modelo.Producto;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Lista_Simple {

    private Nodo inicio, fin;
    
    public Lista_Simple() {
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
    
    public void Registrar(Producto dato) {
        
        
      if(buscar(dato.getCodigo())==null) { 
          
        Nodo nuevo = new Nodo(dato);
        if (inicio == null) {
            inicio = fin = nuevo;
            
        } else {
            fin.setSiguiente(nuevo);
         //   nuevo.setAnterior(fin); para dobles
            fin = nuevo; 
        }
        
      }else{
          JOptionPane.showMessageDialog(null, "Ya existe un producto con este codigo");}
        
        
        
    }
    
    public void listar(JTable control) {
        String[] cabezera = {"codigo", "descripcion", "stock"};
        DefaultTableModel modtable = new DefaultTableModel(cabezera, 0);
        control.setModel(modtable);
        
        
        Nodo auxiliar = inicio;
        while (auxiliar != null) {            
            modtable.addRow(auxiliar.getElemento().getRegistro());
            auxiliar = auxiliar.getSiguiente();
        }
        
        
    }

    public Nodo buscar(int codigo) {
        Nodo auxiliar = inicio;
        
        while (auxiliar != null) {  
            
            if (auxiliar.getElemento().getCodigo() == codigo) {
                
                return auxiliar;
            }
            auxiliar = auxiliar.getSiguiente();
        }
        return null;
    }    

       public void elimnar(Nodo auxiliar) {
        
        if (auxiliar == inicio) {   
            
            inicio = inicio.getSiguiente();
            
        } else {
            
            Nodo anterior = inicio;
            while (anterior.getSiguiente() != auxiliar) {                
                anterior = anterior.getSiguiente();// el inicio ahora es b
            }
            
            if (auxiliar == fin) {
                anterior.setSiguiente(null);
                fin = anterior;
                
            } else {
                anterior.setSiguiente(auxiliar.getSiguiente());
            }
            
        }
    } 
    
}
