
package control;

import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import modelo.Clientes;


public class Arreglo_clientes {
    
    private Clientes[] Arreglo = new Clientes[12];
    private int i =0;
    
    public void listar(JTable control){
    
    String[] cabezera = {"nombre completo","edad","dni","telefono"};
    
        DefaultTableModel modtable = new DefaultTableModel(cabezera, 0);
        control.setModel(modtable);
        for (int pos = 0; pos < i; pos++) {
           
            modtable.addRow( Arreglo[pos].getRegistro());
           
            
            
            
        }
    }
    public void registrar(Clientes dato){
   if(buscar(dato.getNombre_completo())==-1) {    
    if(i<Arreglo.length){
    
    Arreglo[i]=dato;
    i++;
    }else{JOptionPane.showMessageDialog(null, "SE PASO DEL LIMITE");}
    }else{JOptionPane.showMessageDialog(null, "hay otro nombre igual");
        
    }
    
    
    }
    public int buscar(String dato){
    
        for (int j = 0; j < i; j++) {
            if(Arreglo[j].getNombre_completo().equals(dato)){
            return j;
            }
        }
    return -1;
    }
   
    
}
