
package arreglo;

import java.util.Random;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import modelo.numero;


public class lista_numero {
    
    
   Nodo fin,inicio;

    public lista_numero() {
        fin=inicio=null;
    }

    public Nodo getFin() {
        return fin;
    }

    public void setFin(Nodo fin) {
        this.fin = fin;
    }

    public Nodo getInicio() {
        return inicio;
    }

    public void setInicio(Nodo inicio) {
        this.inicio = inicio;
    }
   
     public void apilar(numero elemento){
     Nodo nuevo = new Nodo(elemento);
     if(inicio==null){   
     inicio=fin=nuevo;
     nuevo.setSiguiente(nuevo);
     
     }else{
     fin.setSiguiente(nuevo);
     nuevo.setAnterior(fin);
     fin=nuevo;
     
     }
     fin.setSiguiente(inicio);
     inicio.setAnterior(fin);
     
     }
     public void listar(JTable control){
     
     
     String[] cabezera={"numero"};
     DefaultTableModel modtable =new DefaultTableModel(cabezera, 0);
     control.setModel(modtable);
       
      if(inicio!=null){
           Nodo auxiliar = inicio;
           
        do {             
             modtable.addRow(auxiliar.getElemento().getRegistro());
             auxiliar=auxiliar.getSiguiente();
         } while (auxiliar!=inicio);
      }
     
     
     
     
     }
    public void generarNumerosAleatorios(int cantidad) {
    Random rnd = new Random();
    for (int i = 0; i < cantidad; i++) {
        int valor = rnd.nextInt(51) - 25; // -25 a +25
        numero nuevo = new numero(valor); 
        apilar(nuevo);
    }
}
    public lista_numero filtrarNumerosNegativos(){
    
    lista_numero listarnegativos = new lista_numero();
    if(inicio!=null){
    Nodo auxiliar = inicio;
    
        do {         
            if(auxiliar.getElemento().getNumero()<0){
                
            listarnegativos.apilar(auxiliar.getElemento());
          
            }
            auxiliar=auxiliar.getSiguiente();
            
        } while (auxiliar!=inicio);
    

    
    }
    
    
    return  listarnegativos;
    }
   
    
    
}
