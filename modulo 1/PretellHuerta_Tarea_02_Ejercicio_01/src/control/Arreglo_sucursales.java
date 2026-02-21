
package control;

import Modelo.sucursales;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class Arreglo_sucursales {
    private sucursales[] Arreglo = new sucursales[4];
    private int i =0;

public void listar(JTable control){
     
      String[] cabezera = {"nombre","direccion","ciudad","codigo sucursal"};
         
         DefaultTableModel modtable = new DefaultTableModel(cabezera, 0);
         control.setModel(modtable);
         for (int pos = 0; pos < i; pos++) {
             
             modtable.addRow(Arreglo[pos].getRegistro());
         }
         
         
     }
public void registrar(sucursales dato){
    if(i<Arreglo.length){
Arreglo[i]=dato;
        i++;
    }else{JOptionPane.showMessageDialog(null, "se paso del limite 4");}
}


public void eliminar(int pos){
    for (int j = pos; j < i-1; j++) {
        Arreglo[j]= Arreglo[j+1];
        
    }
    i--;
    
    

}

public void EliminarCombo(JComboBox combo){ 
combo.removeAllItems();
    for (int j = 0; j < i; j++) {
        
        combo.addItem(Arreglo[j].getNombre()+" "+Arreglo[j].getDireccion());
    }
  
  }  

    
    
    
    
    
    
    
    
    
    
    
    
    
}
