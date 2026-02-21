
package control;

import Modelo.empleado;
import javax.swing.JOptionPane;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class Arreglo_empleado {
     private empleado[] Arreglo = new empleado[8];
     private int i =0;
     
     public void listar(JTable control){
     
      String[] cabezera = {"nomnbre","codigo empleado","edad","sucursal asignado"};
         
         DefaultTableModel modtable = new DefaultTableModel(cabezera, 0);
         control.setModel(modtable);
         for (int pos = 0; pos < i; pos++) {
             
             modtable.addRow(Arreglo[pos].getRegistro());
         }
         
         
     }
     
     public void Registrar(empleado dato){
     if(i<Arreglo.length){
    Arreglo[i]=dato ;
    i++;
     }else{JOptionPane.showMessageDialog(null, "se paso el limite 8 ");}
     

     
     }
      public void filtro(JTable control,String filtro){
     
      String[] cabezera = {"nombre","codigo empleado","edad","sucursal asignado"};
         
         DefaultTableModel modtable = new DefaultTableModel(cabezera, 0);
         control.setModel(modtable);
         for (int pos = 0; pos < i; pos++) {
             if(Arreglo[pos].getCadena().contains(filtro)){
             modtable.addRow(Arreglo[pos].getRegistro());
             }
         }
         
         
     }
     public void eliminar(int pos){
         for (int j = pos; j < i-1; j++) {
             
             Arreglo[j]= Arreglo[j+1];
             
             
         }
         i--;
     
     }
     
     
     
     
     
     
     
     
}
