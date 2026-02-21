
package control;

import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import modelo.productos;


public class Arreglo_productos {
    
private productos[] Arreglo = new productos[7];
    private int i =0;
    
    public void listar(JTable control){
    
    String[] cabezera = {"marca","categoria","stock","costo","nombre","descripcion"};
    
        DefaultTableModel modtable = new DefaultTableModel(cabezera, 0);
        control.setModel(modtable);
        for (int pos = 0; pos < i; pos++) {
           
            modtable.addRow( Arreglo[pos].getRegistro());
           
            
            
            
        }
    }
    public void registrar(productos dato){
        
    if(i<Arreglo.length){
    
    Arreglo[i]=dato;
    i++;
    
    }else{
        JOptionPane.showMessageDialog(null, "SE PASO DEL LIMITE");
    }
    
    
    }
    
}
