package Control;

import Modelo.Paquete;
import javax.swing.table.DefaultTableModel;

public class Lista_Paquete {

    private Nodo_Paquete inicio, cima;
    private int i ;
    public Lista_Paquete() {
        inicio = cima = null;
    }

    public Nodo_Paquete getInicio() {
        return inicio;
    }

    public void setInicio(Nodo_Paquete Inicio) {
        this.inicio = Inicio;
    }

    public Nodo_Paquete getFin() {
        return cima;
    }

    public void setFin(Nodo_Paquete Fin) {
        this.cima = Fin;
    }

    
    public void apilar(Paquete elemento ){
    Nodo_Paquete nuevo = new Nodo_Paquete(elemento); 
    nuevo.setSiguiente(cima);// |1|->|cima//fin| // donde cima es la cima
    cima=nuevo;
    i++;
    }
    public Paquete desapilar(){
        if(!PilaVacia()){
        
          Paquete temp=cima.getElemento();
          cima=cima.getSiguiente();
         // i--;
          return temp;
        
        }
        return null;
     
    }
   public void decapitar(){
   
       if(!PilaVacia()){
           
           cima=cima.getSiguiente();
         //  i--;
       
       }
       
       
   }
   public Paquete cima(){
      if(!PilaVacia()){
           
           return cima.getElemento();
           
       
       }
       
       return null;
   }
   public void RecorrerFila(DefaultTableModel modtable){
   Nodo_Paquete auxiliar=cima;
   modtable.setRowCount(0);
       while (auxiliar!=null) {           
           modtable.addRow(auxiliar.getElemento().getRegistro());
           auxiliar=auxiliar.getSiguiente(); 
       }
           
          
       
   }
   public boolean PilaVacia(){
   return cima==null;
   }
   public void EliminarPila(){
   cima=null;
   //i=0;
   }
   public int CantidadElementos(){
   return i;
   
  
   }
   
} 
   
