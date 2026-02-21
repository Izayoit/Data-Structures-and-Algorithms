package Arreglo;

import javax.swing.table.DefaultTableModel;
import modelo.SolicitudMatricula;

public class lista_Estudiantes {

    Nodo cima;

    public lista_Estudiantes() {
        cima = null;
    }

    public Nodo getCima() {
        return cima;
    }

    public void setCima(Nodo cima) {
        this.cima = cima;
    }

    public void apilar(SolicitudMatricula dato) {
        Nodo nuevo = new Nodo(dato);
        nuevo.setSiguiente(cima);
        cima = nuevo;
    }

    public void recorrerpila(DefaultTableModel modtable) {

        modtable.setRowCount(0);
        Nodo aux = cima;
        while (aux != null) {
            modtable.addRow(aux.getDato().getRegistro());
            aux = aux.getSiguiente();
        }
    }
    public SolicitudMatricula desapilar() {
        if(!Vacio()){
        SolicitudMatricula temp = cima.getDato();
        cima = cima.getSiguiente();
        return temp;}
        return null;
    }
    public void decapitar(){
    cima=cima.getSiguiente();
    }

    public boolean Vacio() {

        return cima == null;
    }
}
