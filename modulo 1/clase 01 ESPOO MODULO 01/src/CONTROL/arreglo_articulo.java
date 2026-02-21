
package CONTROL;

import MODELO.articulo;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class arreglo_articulo {
 
    private articulo[] arreglo= new articulo[4];
    private int i =0; // index del arreglo.
   
 
     public void registrar(articulo dato){
         
     if(i<arreglo.length){
     arreglo[i]=dato;
     i++;
     }else{JOptionPane.showMessageDialog(null, "se paso del limite");}
     
     
     };

   public void listar2(JTable control){
     String[] cabezera ={"codigo","nombre"};
     DefaultTableModel modtabla= new DefaultTableModel(cabezera, 0);
     control.setModel(modtabla);
       for (int pos = 0; pos < i; pos++) {  
           modtabla.addRow(arreglo[pos].getRegistro());
           
       }
   
   
   }
    
  
  
};