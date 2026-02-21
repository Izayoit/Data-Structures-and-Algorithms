
package control;

import Modelo.empleado;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class Arreglo_empleado {
     private empleado[] Arreglo = new empleado[8];
     private int i =0;
     
     public void listar(JTable control){
    
      String[] cabezera = {"nombre","codigo empleado","ciudad","sucursal asignado"};
          
         DefaultTableModel modtable = new DefaultTableModel(cabezera, 0);
         control.setModel(modtable);
           empleado temp;
           
           
         for (int pos = 0; pos < i-1; pos++) {
             
           
             
             for (int j = 0; j < i-1; j++) {
                 
                 if(Arreglo[j].getNombre().compareTo(Arreglo[j+1].getNombre())>0){
                   
              
                      
               temp=Arreglo[j];
               
                 Arreglo[j]=Arreglo[j+1];
                 
                 Arreglo[j+1]= temp;
                 
                 }
                 
                 
             }
             
             
         }
         
         for (int j = 0; j < i; j++) {
             modtable.addRow(Arreglo[j].getRegistro());
         }
         
         
     }
     
     public void Registrar(empleado dato){
     if(i<Arreglo.length){
    Arreglo[i]=dato ;
    i++;
     }else{JOptionPane.showMessageDialog(null, "se paso el limite 8 ");}
     

     
     }
      public void filtro(JTable control,String filtro){
     
      String[] cabezera = {"nombre","codigo empleado","ciudad","sucursal asignado"};
         
         DefaultTableModel modtable = new DefaultTableModel(cabezera, 0);
         control.setModel(modtable);
          empleado temp;
         for (int pos = 0; pos < i-1; pos++) {
         
             for (int j = 0; j < i-1; j++) {
                 
          if(Arreglo[j].getNombre().compareTo(Arreglo[j+1].getNombre())>0){       
                         
                temp = Arreglo[j];
                 
                 Arreglo[j]=Arreglo[j+1];
                 
                 Arreglo[j+1]=temp;
          }
                 
             }
            
             

         }
          for (int j = 0; j < i; j++) { 
              if(Arreglo[j].getCadena().contains(filtro)){
                  
                  modtable.addRow(Arreglo[j].getRegistro());
                  
              }}
          
              
          
        
         
         
         
         
     }
     public void eliminar(int pos){
         for (int j = pos; j < i-1; j++) {
             
             Arreglo[j]= Arreglo[j+1];
             
             
         }
         i--;
     
     }

     
     
     
     
     
     
     
     
}
