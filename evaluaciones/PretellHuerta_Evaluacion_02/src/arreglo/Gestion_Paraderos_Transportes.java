package arreglo;

import javax.swing.table.DefaultTableModel;
import modelo.Empresa_transportes;
import modelo.chofer_contratado;

public class Gestion_Paraderos_Transportes {

    Nodo_transporte fin, inicio;

    public Gestion_Paraderos_Transportes() {
        fin = inicio = null;
    }

    public void apilar(Empresa_transportes elemento) {
        Nodo_transporte nuevo = new Nodo_transporte(elemento);
        if (inicio == null) {

            inicio = fin = nuevo;

        } else {
            nuevo.setSiguiente(fin);
            fin.setAnterior(nuevo);
            fin = nuevo;
        }

    }

    public void recorrerpila(DefaultTableModel modtable) {
       modtable.setRowCount(0);
        Nodo_transporte aux = fin;
        while (aux != null) {
            modtable.addRow(aux.getElemento().getRegistro());
            aux = aux.getSiguiente();
        }

    }

    public Empresa_transportes desapilar() {
        Empresa_transportes temp = fin.getElemento();
        fin = fin.getSiguiente();
        return temp;
    }

    public void decapitar() {
        fin = fin.getSiguiente();

    }
}
