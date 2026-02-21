package arreglo;

import javax.swing.table.DefaultTableModel;
import modelo.ticket;

public class Lista_ticket {

    Nodo_ticket fin;
    private int i;

    public Lista_ticket() {
        fin = null;
    }

    public Nodo_ticket getFin() {
        return fin;
    }

    public void setFin(Nodo_ticket fin) {
        this.fin = fin;
    }

    public void apilar(ticket elemento) {
        Nodo_ticket nuevo = new Nodo_ticket(elemento);
        nuevo.setSiguiente(fin);
        fin = nuevo;

    }

    public void recorrerpila(DefaultTableModel modtable) {
        Nodo_ticket auxiliar = fin;
        modtable.setRowCount(0);
        while (auxiliar != null) {

            modtable.addRow(auxiliar.getElemento().getRegistro());
            auxiliar = auxiliar.getSiguiente();
        }

    }

    

    public ticket desapilar() {
        if (!Vacio()) {

            ticket temp = fin.getElemento();
            fin = fin.getSiguiente();
            return temp;

        }
        return null;

    }

    public boolean Vacio() {

        return fin == null;
    }

    public int consultar() {
       int contador1=0;
        Nodo_ticket aux1=fin;
        while (aux1!=null) {            
            contador1++;
            aux1=aux1.getSiguiente();
        }
        
        return contador1;
        
        
        
   
        
        
       
    }
    public ticket Elemento(int pos){
        
        int contador1 =0;
        Nodo_ticket aux1=fin;
        while (aux1!=null) {            
            if (contador1==pos) {
                return aux1.getElemento();
                
            }
            contador1++;
        aux1=aux1.getSiguiente();
        }
        
        return null;
    
    }

}
