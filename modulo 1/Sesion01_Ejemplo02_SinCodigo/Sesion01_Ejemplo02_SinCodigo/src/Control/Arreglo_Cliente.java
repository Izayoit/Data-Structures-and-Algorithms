package Control;

import Modelo.Cliente;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableColumnModel;
import javax.swing.table.DefaultTableModel;

public class Arreglo_Cliente {
    private Cliente[] arreglo = new Cliente[15];
    private int i =0;
   
 public void insertar(Cliente dato){
 
 arreglo[i]=dato;
 i++;
 
 }
 
 public void listar(JTable control){
     String[] cabezera ={"nombre","codigo"};
     DefaultTableModel modtable = new DefaultTableModel(cabezera, 0);
     control.setModel(modtable);
     for (int pos = 0; pos < i; pos++) {
         // Object[] tabla = {arreglo[pos].getNombre() , arreglo[pos].getEdad()};
         
         modtable.addRow(arreglo[pos].getRegistro());
     }
 
 
}
  public void filtrar(JTable control,String filtro){
     String[] cabezera ={"nombre","codigo"};
     DefaultTableModel modtable = new DefaultTableModel(cabezera, 0);
     control.setModel(modtable);
     for (int pos = 0; pos < i; pos++) {
          
         if(arreglo[pos].getCadena().contains(filtro)){  
             //Object[] tabla = {arreglo[pos].getNombre() , arreglo[pos].getEdad()};
             modtable.addRow(arreglo[pos].getRegistro());
         }
       
     }
 
 
}   
 
 
 
}
