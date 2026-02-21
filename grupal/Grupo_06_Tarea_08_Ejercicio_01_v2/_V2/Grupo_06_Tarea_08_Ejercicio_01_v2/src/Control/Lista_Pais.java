package Control;

import Modelo.Pais;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.table.DefaultTableModel;

public class Lista_Pais {

    Nodo<Pais> inicio, fin;

    public Lista_Pais() {
        inicio = fin = null;
    }

    public Nodo<Pais> getInicio() {
        return inicio;
    }

    public void setInicio(Nodo<Pais> inicio) {
        this.inicio = inicio;
    }

    public Nodo<Pais> getFin() {
        return fin;
    }

    public void setFin(Nodo<Pais> fin) {
        this.fin = fin;
    }

    public void Agregar(Pais elemento) {
        Nodo<Pais> nuevo = new Nodo<>(elemento);
        if (inicio == null) {
            inicio = nuevo;
        } else {
            fin.setSiguiente(nuevo);
        }
        fin = nuevo;
    }

    public void Listar(DefaultTableModel modtabla) {
        Nodo<Pais> aux = inicio;
        modtabla.setRowCount(0);
        while (aux != null) {
            modtabla.addRow(aux.getElemento().getRegistro());
            aux = aux.getSiguiente();
        }
    }

    public Nodo<Pais> Buscar_Nodo_Codigo(String codigo) {
        if (!Lista_Vacia()) {
            Nodo<Pais> aux = inicio;
            while (aux != null) {
                if (aux.getElemento().getCodigo().equals(codigo)) {
                    return aux;
                }
                aux = aux.getSiguiente();
            }
        }
        return null;
    }
    
    public Nodo<Pais> Buscar_Nodo_Nombre(String nombre) {
        if (!Lista_Vacia()) {
            Nodo<Pais> aux = inicio;
            while (aux != null) {
                if (aux.getElemento().getNombre().equals(nombre)) {
                    return aux;
                }
                aux = aux.getSiguiente();
            }
        }
        return null;
    }

    public void Eliminar(String codigo) {
        if (!Lista_Vacia()) {
            Nodo<Pais> aux = Buscar_Nodo_Codigo(codigo);
            if (aux == inicio) {
                inicio = inicio.getSiguiente();
            } else {
                Nodo<Pais> ant = inicio;
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

    public boolean Lista_Vacia() {
        return inicio == null;
    }

    public void Listar_Combo(JComboBox combo) {
        DefaultComboBoxModel mdo = new DefaultComboBoxModel();
        combo.setModel(mdo);
        if (!Lista_Vacia()) {
            Nodo<Pais> aux = inicio;
            while (aux != null) {
                mdo.addElement(aux.getElemento().getNombre());
                aux = aux.getSiguiente();
            }
        }
    }

    public void Filtrar(DefaultTableModel modtabla, String cadena) {
        if (!Lista_Vacia()) {
            Nodo<Pais> aux = inicio;
            modtabla.setRowCount(0);
            while (aux != null) {
                if (aux.getElemento().getCadenaFiltrar().toLowerCase().contains(cadena.toLowerCase())) {
                    modtabla.addRow(aux.getElemento().getRegistro());
                }
                aux = aux.getSiguiente();
            }
        }
    }
}
