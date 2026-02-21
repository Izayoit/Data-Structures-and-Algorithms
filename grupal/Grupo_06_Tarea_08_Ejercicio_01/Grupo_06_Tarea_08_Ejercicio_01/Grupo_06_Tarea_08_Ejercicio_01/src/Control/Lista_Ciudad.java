package Control;

import Modelo.Ciudad;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.table.DefaultTableModel;

public class Lista_Ciudad {

    private Nodo<Ciudad> inicio, fin;

    public Lista_Ciudad() {
        inicio = fin = null;
    }

    public Nodo<Ciudad> getInicio() {
        return inicio;
    }

    public void setInicio(Nodo<Ciudad> inicio) {
        this.inicio = inicio;
    }

    public Nodo<Ciudad> getFin() {
        return fin;
    }

    public void setFin(Nodo<Ciudad> fin) {
        this.fin = fin;
    }

    public void Agregar(Ciudad elemento) {
        Nodo<Ciudad> nuevo = new Nodo<>(elemento);
        if (inicio == null) {
            inicio = nuevo;
        } else {
            fin.setSiguiente(nuevo);
        }
        fin = nuevo;
    }

    public void Listar(DefaultTableModel modtabla) {
        Nodo<Ciudad> aux = inicio;
        modtabla.setRowCount(0);
        while (aux != null) {
            modtabla.addRow(aux.getElemento().getRegistro());
            aux = aux.getSiguiente();
        }
    }

    public Nodo<Ciudad> Buscar_Nodo_Codigo(String codigo) {
        if (!Lista_Vacia()) {
            Nodo<Ciudad> aux = inicio;
            while (aux != null) {
                if (aux.getElemento().getCodigo().equals(codigo)) {
                    return aux;
                }
                aux = aux.getSiguiente();
            }
        }
        return null;
    }

    public Nodo<Ciudad> Buscar_Nodo_Nombre(String nombre) {
        if (!Lista_Vacia()) {
            Nodo<Ciudad> aux = inicio;
            while (aux != null) {
                if (aux.getElemento().getNombre().equals(nombre)) {
                    return aux;
                }
                aux = aux.getSiguiente();
            }
        }
        return null;
    }
    
    public void Listar_Combo(JComboBox combo) {
        DefaultComboBoxModel mdo = new DefaultComboBoxModel();
        combo.setModel(mdo);
        if (!Lista_Vacia()) {
            Nodo<Ciudad> aux = inicio;
            while (aux != null) {
                mdo.addElement(aux.getElemento().getNombre());
                aux = aux.getSiguiente();
            }
        }
    }

    public void Eliminar(String Nombre) {
        if (!Lista_Vacia()) {
            Nodo<Ciudad> aux = Buscar_Nodo_Nombre(Nombre);
            if (aux == inicio) {
                inicio = inicio.getSiguiente();
            } else {
                Nodo<Ciudad> ant = inicio;
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

    public void Filtrar(DefaultTableModel modtabla, String cadena) {
        if (!Lista_Vacia()) {
            Nodo<Ciudad> aux = inicio;
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
