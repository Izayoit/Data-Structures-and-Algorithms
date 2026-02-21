
package arreglo;

import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import modelo.Juego;
import modelo.Usuario;


public class ArregloJuego {
    
    private Juego[] Arreglo = new Juego[10];
    private int i=0;
    
    public int getI(){
    return i;
    }
    public Juego[] getArreglo(){
        
        return  Arreglo;
            }
    public void ListarOrdenamientoBurbuja(JTable control){
    
    String[] cabezera ={"nombre","codigo","empresa"};
        DefaultTableModel modtable = new DefaultTableModel(cabezera, 0);
        control.setModel(modtable);
        Juego temp;
        for (int j = 0; j < i-1; j++) {
            
            for (int k = 0; k < i-1; k++) {
                
                if (Arreglo[k].getNombre().compareTo(Arreglo[k+1].getNombre())>0) {
                    
                    temp= Arreglo[k];
                    
                    Arreglo[k]=Arreglo[k+1];
                    
                    Arreglo[k+1]=temp;
                    
                    
                   
                }
                
                
                
            }
            
        }
        

        
        
        for (int pos = 0; pos < i; pos++) {
            modtable.addRow(Arreglo[pos].getRegistro());
            
        }
        
        
    }
    public void ListaOrdenamientoSeleccion(JTable control){
    
    String[] cabezera ={"nombre","codigo","empresa"};
        DefaultTableModel modtable = new DefaultTableModel(cabezera, 0);
        control.setModel(modtable);
       
        for (int j = 0; j < i-1; j++) {
            int posmin =j;
            
            for (int k = j+1 ; k < i; k++) {
                
                if (Arreglo[k].getNombre().compareTo(Arreglo[posmin].getNombre())<0) {
                    
                  posmin=k;
             
                }
               
                
                
            }
            
            Juego temp = Arreglo[j];
            Arreglo[j]=Arreglo[posmin];
            Arreglo[posmin]=temp;
            
        }
        

        
        
        for (int pos = 0; pos < i; pos++) {
            modtable.addRow(Arreglo[pos].getRegistro());
            
        }
        
        
    }
    public void registrar(Juego dato){
        
    if(i<Arreglo.length){
     
     Arreglo[i]=dato;
      i++;}
        
        
    
    
    }
    public void RegistroGestor(String nombre, String codigoAsignado,String empresa){
    Object [] dato2 = {nombre,codigoAsignado,empresa};
    
    Arreglo[i]=new Juego(dato2);
    i++;
    
    

    
    }
    
    public int contador(){
    
    return i;
    
    }
    
    
    
    
    
}
