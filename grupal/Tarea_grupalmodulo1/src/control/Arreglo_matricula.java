
package control;

import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import modelo.matricula;

public class Arreglo_matricula {
    
 public matricula[] Arreglo = new matricula[100];
 public int i =0;
 
 public void listar(JTable control){
 
     String[] cabezera ={"codigo Matricula","codigo alumno ","carrera","ciclo","semestre"};
     DefaultTableModel modtable = new DefaultTableModel(cabezera, 0);
     control.setModel(modtable);
     
     //aplicar odrnamiento aqui
     
     for (int j = 0; j < 10; j++) {
         modtable.addRow(Arreglo[j].getRegistro());
     }
 
     
 }
 public void Registrar(matricula dato){
   if(i<Arreglo.length){
     Arreglo[i]=dato;
     i++;
   }else{ JOptionPane.showMessageDialog(null, "se paso del limte 100");}
   
 }
}
