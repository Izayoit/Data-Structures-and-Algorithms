
package control;

import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import modelo.alumno;


public class Arreglo_alumno {
 public alumno[] Arreglo = new alumno[100];
 public int i =0;
 
 public void listar(JTable control){
 
     String[] cabezera ={"codigo","codigo Estudiante "};
     DefaultTableModel modtable = new DefaultTableModel(cabezera, i);
     control.setModel(modtable);
     
     //aplicar odrnamiento aqui
     
     for (int j = 0; j < 10; j++) {
         modtable.addRow(Arreglo[j].getRegistro());
     }
 
     
 }
 public void Registrar(alumno dato){
   if(i<Arreglo.length){
     Arreglo[i]=dato;
     i++;
   }else{ JOptionPane.showMessageDialog(null, "se paso del limte 100");}
   
 }
 
 
  
  

  
  
}
