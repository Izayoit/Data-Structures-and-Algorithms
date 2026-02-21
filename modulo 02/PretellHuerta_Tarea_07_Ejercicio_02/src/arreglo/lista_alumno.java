package arreglo;

import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import modelo.Alumnos;

public class lista_alumno {

    int capacidad = 5;
    Alumnos[] Arreglo = new Alumnos[capacidad];
    int i = 0;

    public void Listar(JTable control) {
        String[] cabezera = {"nombre", "codigo", "escuela", "dni"};
        DefaultTableModel modtable = new DefaultTableModel(cabezera, 0);
        control.setModel(modtable);
        for (int pos = i-1; pos >=0; pos--) {
            modtable.addRow(Arreglo[pos].getRegistro());
        }

    }

    public void apilar(Alumnos dato) {

        

     Arreglo[i]= dato;
     i++;
if (i == capacidad) {
   int rpta= JOptionPane.showConfirmDialog(null, "se aumentara","deseaumentar?",JOptionPane.YES_NO_OPTION);
    if(rpta!=JOptionPane.YES_OPTION){
    
    return;
    
    }else{
            capacidad = capacidad * 2;

            Alumnos[] NuevoArreglo = new Alumnos[capacidad];

            for(int j = 0; j< i ; j++) {
                
                NuevoArreglo[j] = Arreglo[j];

            }
          Arreglo= NuevoArreglo;}
        }
    }
    
  public boolean Vacio(){
  
  return i==0;
  } 
    
  public Alumnos desapilar(){
  if(!Vacio()){
  i--;
  Alumnos temp =Arreglo[i];
  
  return temp;
  }
 
      
  return null;
  }  
  
    public void decapitar(){
  if(!Vacio()){
  i--;
  Arreglo[i]=null;
  }
   
     
  }
    public Alumnos cima(){
  if(!Vacio()){

  return Arreglo[i-1];
  }
   
    return null;
}
    
    public void eliminar(){
    i=0;
    }
    
}