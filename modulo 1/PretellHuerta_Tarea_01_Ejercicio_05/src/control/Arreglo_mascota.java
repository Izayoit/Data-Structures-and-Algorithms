
package control;

import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import modelo.Mascotas;


public class Arreglo_mascota {
    
    private Mascotas[] Arreglo = new Mascotas[8];
    private int i=0;
    
    public void listar(JTable control){
        String[] cabezera = {"nombre","especie","edad","color"};
        DefaultTableModel modtable = new DefaultTableModel(cabezera, 0);
        control.setModel(modtable);
        for (int pos = 0; pos < i; pos++) {
            modtable.addRow(Arreglo[pos].getRegistro());
            
        }
    
    
    }
     public void registro(Mascotas dato){
     if(i<Arreglo.length){
     Arreglo[i]=dato;
     i++;
     
     
     }else{JOptionPane.showMessageDialog(null, "se paso del limte 8");}
     }
    
     
     
     public void filtrar(JTable control,String filtro){
        String[] cabezera = {"nombre","especie","edad","color"};
        DefaultTableModel modtable = new DefaultTableModel(cabezera, 0);
        control.setModel(modtable);
        for (int pos = 0; pos < i; pos++) {
            if(Arreglo[pos].getcadena().contains(filtro)){
            modtable.addRow(Arreglo[pos].getRegistro());}
            
        }
    
    
    }
     public void Eliminar(int pos){
         for (int j = pos; j < i-1; j++) {
             
             Arreglo[j]= Arreglo[j+1];
            
         }
         JOptionPane.showMessageDialog(null, "se elimino correctamente");
           i--;
     
     }
     
     
     
     
}
