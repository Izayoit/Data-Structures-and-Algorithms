 package Control;

import Modelo.Pais;
import Modelo.Vuelo;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Cola_Vuelo {

    private Nodo<Vuelo> frente;
    private Nodo<Vuelo> fin;
    private Vuelo objvuelo;

    public Cola_Vuelo() {
        frente = fin = null;
    }

    public void Insertar(Vuelo elemento) {
        Nodo<Vuelo> nuevo = new Nodo<>(elemento);
        if (Cola_Vacia()) {
            frente = nuevo;
        } else {
            fin.setSiguiente(nuevo);
        }
        fin = nuevo;
    }

    public Vuelo Quitar() {
        if (!Cola_Vacia()) {
            Vuelo elemento = frente.getElemento();
            frente = frente.getSiguiente();
            return elemento;
        }
        return null;
    }

    public Vuelo Frente_Cola() {
        if (!Cola_Vacia()) {
            return frente.getElemento();
        }
        return null;
    }

    public boolean Cola_Vacia() {
        return frente == null;
    }

    public void RecorrerCola(DefaultTableModel modtabla) {
        if (!Cola_Vacia()) {
            Nodo<Vuelo> aux = frente;
            modtabla.setRowCount(0);
            while (aux!=null) {
              
                modtabla.addRow(aux.getElemento().getRegistro());
                aux = aux.getSiguiente();
            }
        }
    }

    public void filtrar(DefaultTableModel modtabla,String filtro) {
        if (!Cola_Vacia()) {
            Nodo<Vuelo> aux = frente;
            modtabla.setRowCount(0);
            while (aux!=null) {
            if(aux.getElemento().getCadenaFiltrar().toLowerCase().contains(filtro)){
             modtabla.addRow(aux.getElemento().getRegistro());
            }
              aux = aux.getSiguiente();
            }
        }
    }
     public Nodo<Vuelo> Buscar_Nodo_Capacidad(int codigo) {
        if (!Cola_Vacia()) {
            Nodo<Vuelo> aux = frente;
            while (aux != null) {
                if (aux.getElemento().getCapacidad()==codigo) {
                    return aux;
                }
                aux = aux.getSiguiente();
            }
        }
        return null;
    }
      public Nodo<Vuelo> Buscar_Nodo_Compuesto(String String) {
        if (!Cola_Vacia()) {
            Nodo<Vuelo> aux = frente;
            while (aux != null) {
                if (aux.getElemento().getNum_boletoCompuesto().equals(String)) {
                    return aux;
                }
                aux = aux.getSiguiente();
            }
        }
        return null;
    }
    public void Eliminar(int capacidad) {
        if (!Cola_Vacia()) {
            Nodo<Vuelo> aux = Buscar_Nodo_Capacidad(capacidad);
            if (aux == frente) {
                frente = frente.getSiguiente();
            } else {
                Nodo<Vuelo> ant = frente;
                while (ant.getSiguiente() != aux) {
                    ant = ant.getSiguiente();
                }
                if (aux == fin) {
                    ant.setSiguiente(null);
                } else {
                    ant.setSiguiente(aux.getSiguiente());
                }
            }
        }
    }
    public void Listar_Combo(JComboBox combo) {
       DefaultComboBoxModel mdo = new DefaultComboBoxModel();
    combo.setModel(mdo);
    if (!Cola_Vacia()) {
        Nodo<Vuelo> aux = frente;
        while (aux != null) {
            mdo.addElement(aux.getElemento());
            aux = aux.getSiguiente();
        }
    }
}
}
