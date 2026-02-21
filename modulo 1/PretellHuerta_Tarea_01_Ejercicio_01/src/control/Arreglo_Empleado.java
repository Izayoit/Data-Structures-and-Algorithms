
package control;

import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import modelo.Empleado;


public class Arreglo_Empleado {
    private Empleado[] Arreglo = new Empleado[8];
    private int i =0;
    
 public void Registrar(Empleado dato){

     if(buscar(dato.getNombre())==-1){
     if(i<Arreglo.length){
     Arreglo[i]=dato;
     i++;
 
 }else{JOptionPane.showMessageDialog(null, "se paso del limite");}
     }else{JOptionPane.showMessageDialog(null, "es igual");}
 }
 
 public void listar(JTable control){
   
 String[]cabezera={"nombre","edad"};
     DefaultTableModel modtable = new DefaultTableModel(cabezera, 0);
     control.setModel(modtable);
     for (int pos = 0; pos < i; pos++) {
         modtable.addRow(Arreglo[pos].getRegistro());
         
     }
     
    
  
   
 
 }
  public int buscar(String pos){
      for (int j = 0; j < i; j++) {
         
          if(Arreglo[j].getNombre().equals(pos)){
          
              return j;
          
          }
      }
      
     
     return -1;
     }
     
} 
