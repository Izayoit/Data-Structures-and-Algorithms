
package arreglo;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import modelo.numeros;


public class lista_alumnos {
    Nodo_alumnos fin;
    private numeros[] Arreglo= new numeros[10];
    private int i=0 ;
    public lista_alumnos() {
        fin=null;
    }

    public Nodo_alumnos getFin() {
        return fin;
    }

    public void setFin(Nodo_alumnos fin) {
        this.fin = fin;
    }
    
 public void registrar(numeros elemento){
 Arreglo[i]=elemento;
 i++;
 }
 public void listar(JTable control){
     String[] cabezera = {"numero"};
     DefaultTableModel modtable = new DefaultTableModel(cabezera, 0);
     control.setModel(modtable);
     for (int pos = 0; pos < i; pos++) {
         modtable.addRow(Arreglo[pos].getRegistro());
         
     }
 }
 public void Apilar(numeros elementos){
 Nodo_alumnos nuevo = new Nodo_alumnos(elementos);
nuevo.setSiguiente(fin);
 fin=nuevo;
 
 }
 public void listarPila(JTable control) {
    String[] cabezera = {"numero"};
    DefaultTableModel modtable = new DefaultTableModel(cabezera, 0);
    control.setModel(modtable);
    Nodo_alumnos aux = fin;
    while (aux != null) {
        modtable.addRow(aux.getElemento().getRegistro());
        aux = aux.getSiguiente();
    }
}
 
 public numeros ExtraerLista(){
     if (!Vaciolista()) {
         i--;        
    return  Arreglo[i] ;
         
         
     }
     
 return null;
 }
 
 
 public numeros desapilar(){
 if(!VacioPila()){
 
 numeros temp = fin.getElemento();
 fin=fin.getSiguiente();
 return temp;
 
 }
     
 return null;
 
 }
 public boolean Vaciolista(){
 
 return i==0;
 }
  public boolean VacioPila(){
 
 return fin==null;
 }
    
 
    
    
 public void recorrerpila(JTable control){
  String[] cabezera = {"numero"};
    DefaultTableModel modtable = new DefaultTableModel(cabezera, 0);
    control.setModel(modtable);

    Nodo_alumnos aux = fin;
    while (aux != null) {
        modtable.addRow(aux.getElemento().getRegistro());
        aux = aux.getSiguiente();
    }
 
 
 }
 
    
    
    
    
}
