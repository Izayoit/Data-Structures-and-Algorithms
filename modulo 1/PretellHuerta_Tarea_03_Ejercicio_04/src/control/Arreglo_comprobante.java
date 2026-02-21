
package control;

import modelo.clientes;
import modelo.comprobantes;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class Arreglo_comprobante {
    private comprobantes[]Arreglo= new comprobantes[15];
    private int i = 0;

    public void lista(JTable control) {
        String[] cabezera = {"N° comprobante", "Codigo cliente", "fecha","monto","tipo"};
        DefaultTableModel modtable = new DefaultTableModel(cabezera, 0);
        control.setModel(modtable);
        
        for (int j = 0; j < i-1; j++) {
            int posmin=j;
            for (int k = j+1; k < i; k++) {
                
                if(Arreglo[k].getMonto()<Arreglo[posmin].getMonto()){
                    
                  posmin=k;
     
                }
                
            }
            if(posmin!=j){
                comprobantes temp= Arreglo[j];
                Arreglo[j]=Arreglo[posmin];
                Arreglo[posmin]=temp;
                }
        }
        
        
        
        
        
        
        
        
        for (int pos = 0; pos < i; pos++) {

            modtable.addRow(Arreglo[pos].getRegistro());
        }

    }

    public void registrar(comprobantes dato) {
        if (i < Arreglo.length) {
            Arreglo[i] = dato;
            i++;
        } else {
            JOptionPane.showMessageDialog(null, "se paso del limite");
        }
    }

    
    
    public void editar(comprobantes dato, int pos) {
        Arreglo[pos] = dato;

    }
    public void eliminar(int pos){
        for (int j = pos; j < i-1; j++) {
            Arreglo[j]= Arreglo[j+1];
        }
    i--;
    }
public void busquedalinealTipo(JTable tabla, String tipo){
    String[] cabecera = {"N° comprobante", "Codigo cliente", "fecha","monto","tipo"};
    DefaultTableModel model = new DefaultTableModel(cabecera, 0);
       tabla.setModel(model);
    for (int j = 0; j < i; j++) {
        if (Arreglo[j].getTipo().equals(tipo)) {
            model.addRow(Arreglo[j].getRegistro());
        }
    }

    
}
   public void busquedalinealMonto(JTable tabla, int monto){
   
       String[] cabecera = {"N° comprobante", "Codigo cliente", "fecha","monto","tipo"};
    DefaultTableModel model = new DefaultTableModel(cabecera, 0);
       tabla.setModel(model);
       
       for (int j = 0; j < i; j++) {
           
           if(Arreglo[j].getMonto()==monto){
            model.addRow(Arreglo[j].getRegistro());
      
           }
           
           
       }
       
    
   }
   public void busquedalinealNcomprobante(JTable tabla, String Ncomprobante){
   
       String[] cabecera = {"N° comprobante", "Codigo cliente", "fecha","monto","tipo"};
    DefaultTableModel model = new DefaultTableModel(cabecera, 0);
       tabla.setModel(model);
       for (int j = 0; j < i; j++) {
          
           if(Arreglo[j].getNumeroComprobante().equals(Ncomprobante)){
           
            model.addRow(Arreglo[j].getRegistro());
           }
           
           
       }
       

   }
        
        
    
    
 
}
