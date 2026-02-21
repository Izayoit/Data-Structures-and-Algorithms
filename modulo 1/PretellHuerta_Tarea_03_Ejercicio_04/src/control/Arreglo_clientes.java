package control;

import modelo.clientes;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Arreglo_clientes {

    private clientes[] Arreglo = new clientes[10];
    private int i = 0;

    public void lista(JTable control) {
        String[] cabezera = {"codigo cliente", "nombre", "apellido","dni","telefono","direccion"};
        DefaultTableModel modtable = new DefaultTableModel(cabezera, 0);
        control.setModel(modtable);
        
        
        for (int j = 0; j < i-1; j++) {
            int posmin=j;
            for (int k = j+1; k < i; k++) {
                
                if(Arreglo[k].getApellido().compareTo(Arreglo[posmin].getApellido())<0){
                    
                  posmin=k;
     
                }
                
            }
            if(posmin!=j){
                clientes temp= Arreglo[j];
                Arreglo[j]=Arreglo[posmin];
                Arreglo[posmin]=temp;
                }
        }
        
        
        
        
        
        
        for (int pos = 0; pos < i; pos++) {

            modtable.addRow(Arreglo[pos].getRegistro());
        }

    }

    public void registrar(clientes dato) {
        if (i < Arreglo.length) {
            Arreglo[i] = dato;
            i++;
        } else {
            JOptionPane.showMessageDialog(null, "se paso del limite");
        }
    }

    public void editar(clientes dato, int pos) {
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
            
           combo.addItem(Arreglo[j].getCodigoCliente());
        }
    
    }
    
    
   
 
}
