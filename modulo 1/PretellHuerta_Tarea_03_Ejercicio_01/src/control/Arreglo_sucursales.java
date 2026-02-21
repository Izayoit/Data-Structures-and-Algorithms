
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
         sucursales temp;
         for (int pos = 0; pos < i-1; pos++) {
             
             for (int j = 0; j < i-1; j++) {
                 if(Arreglo[j]!=null && Arreglo[j+1]!=null){
                 if(Arreglo[j].getNombre().compareTo(Arreglo[j+1].getNombre())>0){
                 
                 temp=Arreglo[j];
                 
                 Arreglo[j]=Arreglo[j+1];
                 
                 Arreglo[j+1]=temp;
                 
                 }}
             }
             
           //  modtable.addRow(Arreglo[pos].getRegistro());
         }
         for (int j = 0; j < i; j++) {
             
            modtable.addRow(Arreglo[j].getRegistro());
        
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
     public void ActualizarCombo(JComboBox combo){
         
         combo.removeAllItems();
         for (int j = 0; j < i; j++) {
             combo.addItem(Arreglo[j].getNombre()+" "+Arreglo[j].getDireccion());
         }
     
     }

        

    
    
    
    
    
    
    
    
    
    
    
    
    
}
