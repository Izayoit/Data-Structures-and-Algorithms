
package arreglo;

import javax.swing.JComboBox;
import javax.swing.table.DefaultTableModel;
import modelo.chofer_contratado;


public class Gestion_Choferes {
    Nodo_conductores fin, inicio;

    public Gestion_Choferes() {
        inicio=fin=null;
    }

    public Nodo_conductores getFin() {
        return fin;
    }

    public void setFin(Nodo_conductores fin) {
        this.fin = fin;
    }

    public Nodo_conductores getInicio() {
        return inicio;
    }

    public void setInicio(Nodo_conductores inicio) {
        this.inicio = inicio;
    }
    
    public void apilar(chofer_contratado elemento){
    Nodo_conductores nuevo = new Nodo_conductores(elemento);
        if (inicio==null) {
            
          inicio=fin=nuevo;
     
        }else{
          nuevo.setSiguiente(fin);
          fin.setAnterior(nuevo);
          fin=nuevo;
        }
   
    }
    public void recorrerpila(DefaultTableModel modtable){
    modtable.setRowCount(0);
    Nodo_conductores aux= fin;
        while (aux!=null) {            
            modtable.addRow(aux.getElemento().getRegistro());
            aux=aux.getSiguiente();
        }
    
    
    }
    
    public void decapitar(){
        fin=fin.getSiguiente();
    
    }
    
    public chofer_contratado desapilar(){
    chofer_contratado temp = fin.getElemento();
    fin=fin.getSiguiente();
    return  temp;
    }
    public void combobox(JComboBox combo,DefaultTableModel modtable){

    modtable.setRowCount(0);
    Nodo_conductores aux=fin;
        while (aux!=null) {            
          combo.addItem(aux.getElemento().getNombres());
          aux=aux.getSiguiente();
   
        }
    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
