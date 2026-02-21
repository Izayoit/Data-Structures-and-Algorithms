
package Arreglo;

import modelo.curso;
import modelo.estudiante;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class Arreglo_estudiante {
    private estudiante[]Arreglo= new estudiante[5];
    private int i = 0;

    public void lista(JTable control) {
        String[] cabezera = {"nombre", "apellido", "dni","edad","correo","curso registrado"};
        DefaultTableModel modtable = new DefaultTableModel(cabezera, 0);
        control.setModel(modtable);
        
        estudiante temp;
        
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

    public void registrar(estudiante dato) {
        if (i < Arreglo.length) {
            Arreglo[i] = dato;
            i++;
        } else {
            JOptionPane.showMessageDialog(null, "se paso del limite");
        }
    }

    
    
    public void editar(estudiante dato, int pos) {
        Arreglo[pos] = dato;

    }
    public void eliminar(int pos){
        for (int j = pos; j < i-1; j++) {
            Arreglo[j]= Arreglo[j+1];
        }
    i--;
    }
        public void filtrar(JTable control,String listar) {
        String[] cabezera = {"nombre", "apellido", "dni","edad","correo","curso registrado"};
        DefaultTableModel modtable = new DefaultTableModel(cabezera, 0);
        control.setModel(modtable);    
        for (int pos = 0; pos < i; pos++) {
     if(Arreglo[pos].getNombre().equals(listar)||Arreglo[pos].getApellido().equals(listar)){
            modtable.addRow(Arreglo[pos].getRegistro());
     
     }
        }

    }
        
        
    
    
 
}
