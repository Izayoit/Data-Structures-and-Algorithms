package Arreglo;

import modelo.curso;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Arreglo_curso {

    private curso[] Arreglo = new curso[3];
    private int i = 0;

    public void lista(JTable control) {
        String[] cabezera = {"nombre", "codigo", "docente","estudiante Registrados","estudiantes Registrados max"};
        DefaultTableModel modtable = new DefaultTableModel(cabezera, 0);
        control.setModel(modtable);
         curso temp;
        
        for (int pos = 0; pos < i-1; pos++) {
             
           
            
             for (int j = 0; j < i-1; j++) {
                 
                 if(Arreglo[j].getNombre().compareTo(Arreglo[j+1].getNombre())>0){
                   
              
                      
               temp=Arreglo[j];
               
                 Arreglo[j]=Arreglo[j+1];
                 
                 Arreglo[j+1]= temp;
                 
                 }
                 
                 
             }
             
             
         }
        
        
        
        
        
        for (int pos = 0; pos < i; pos++) {

            modtable.addRow(Arreglo[pos].getRegistro());
        }

    }

    public void registrar(curso dato) {
        if (i < Arreglo.length) {
            Arreglo[i] = dato;
            i++;
        } else {
            JOptionPane.showMessageDialog(null, "se paso del limite");
        }
    }

    public void editar(curso dato, int pos) {
        Arreglo[pos] = dato;

    }
    public void eliminar(int pos){
        for (int j = pos; j < i-1; j++) {
            Arreglo[j]= Arreglo[j+1];
        }
    i--;
    }
    
    public void actualizarCombo(JComboBox combo){
    combo.removeAllItems();
        for (int j = 0; j < i; j++) {
            
           combo.addItem(Arreglo[j].getNombre()+" "+Arreglo[j].getCodigo());
        }
    
    }
    
    public void Filtrar(JTable control,String filtro) {
        String[] cabezera = {"nombre", "codigo", "docente","estudiante Registrados","estudiantes Registrados max"};
        DefaultTableModel modtable = new DefaultTableModel(cabezera, 0);
        control.setModel(modtable);
        for (int j = 0; j < i; j++) {
     if(Arreglo[j].getNombre().equals(filtro)||Arreglo[j].getCodigo().equals(filtro)){
            modtable.addRow(Arreglo[j].getRegistro());}
        }
    
    
    
    
    
    
    
    
    }
 
}
