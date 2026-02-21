
package control;

import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import modelo.EstudiantesUniversitarios;


public class Arreglo_EstudiantesUniversitarios {
    
   
    private EstudiantesUniversitarios[] Arreglo = new EstudiantesUniversitarios[10];
    private int i =0;
    
    
    
     public EstudiantesUniversitarios[] getArreglo() {
        return Arreglo;
    }

   
    public int getI() {
        return i;
    }

    
    
 
     public void RegistrarPlus2(String nombre, int codigo, String carrera, int dni, int edad) {
        try {

            Object[] Registro = {nombre, codigo, carrera, dni, edad};
            Arreglo[i] = new EstudiantesUniversitarios(Registro);
            i++;
        } catch (ArrayIndexOutOfBoundsException e) {
             
            JOptionPane.showMessageDialog(null, "paso el limite");
        }
    }
    
     
    
    
    
    
    public void registrar(EstudiantesUniversitarios dato){
    if(i<Arreglo.length){
      Arreglo[i] =dato;
      i++;
    
    }else{JOptionPane.showMessageDialog(null, "limite solo 10");}
    }
    
    public void listar(JTable control){
    
    String[] cabezera = {"nombre","codigo","carrera","dni","edad"};
        DefaultTableModel modtable = new DefaultTableModel(cabezera, 0);
        control.setModel(modtable);
        for (int pos = 0; pos <i; pos++) {
            modtable.addRow(Arreglo[pos].getRegistro());
            
        }
    
    }
    
    public void Eliminar() {
        i = 0;
    }
    public void Eliminar(int pos) {
        
            for (int j = pos; j < i - 1; j++) {
              
                Arreglo[j] = Arreglo[j + 1];
                  
            }
            JOptionPane.showMessageDialog(null, "se realizo el eliminadao exitosamente");
            i--;

    }
    

}
