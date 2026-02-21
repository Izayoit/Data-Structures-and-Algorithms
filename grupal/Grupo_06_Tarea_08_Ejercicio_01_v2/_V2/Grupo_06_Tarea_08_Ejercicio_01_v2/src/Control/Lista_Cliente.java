package Control;

import Modelo.Cliente;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.table.DefaultTableModel;

public class Lista_Cliente {

    private Nodo<Cliente> inicio, fin;

    public Lista_Cliente() {
        inicio = fin = null;
    }

    public Nodo<Cliente> getInicio() {
        return inicio;
    }

    public void setInicio(Nodo<Cliente> inicio) {
        this.inicio = inicio;
    }

    public Nodo<Cliente> getFin() {
        return fin;
    }

    public void setFin(Nodo<Cliente> fin) {
        this.fin = fin;
    }

    public void Agregar(Cliente elemento) {
        Nodo<Cliente> nuevo = new Nodo<>(elemento);
        if (inicio == null) {
            inicio = nuevo;
        } else {
            fin.setSiguiente(nuevo);
        }
        fin = nuevo;
    }

    public void Listar(DefaultTableModel modtabla) {
        Nodo<Cliente> aux = inicio;
        modtabla.setRowCount(0);
        while (aux != null) {
            modtabla.addRow(aux.getElemento().getRegistro());
            aux = aux.getSiguiente();
        }
    }

    public Nodo<Cliente> Buscar_Nodo(String codigo) {
        if (!Lista_Vacia()) {
            Nodo<Cliente> aux = inicio;
            while (aux != null) {
                if (aux.getElemento().getCodigo().equals(codigo)) {
                    return aux;
                }
                aux = aux.getSiguiente();
            }
        }
        return null;
    }
    public Nodo<Cliente> Buscar_NombreApellido(String String) {
        if (!Lista_Vacia()) {
            Nodo<Cliente> aux = inicio;
            while (aux != null) {
                if (aux.getElemento().getNombreApellidos().equals(String)) {
                    return aux;
                }
                aux = aux.getSiguiente();
            }
        }
        return null;
    }

    public void Eliminar(String codigo) {
        if (!Lista_Vacia()) {
            Nodo<Cliente> aux = Buscar_Nodo(codigo);
            if (aux == inicio) {
                inicio = inicio.getSiguiente();
            } else {
                Nodo<Cliente> ant = inicio;
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
            Nodo<Cliente> aux = inicio;
            modtabla.setRowCount(0);
            while (aux != null) {
                if (aux.getElemento().getCadenaFiltrar().toLowerCase().contains(cadena.toLowerCase())) {
                    modtabla.addRow(aux.getElemento().getRegistro());
                }
                aux = aux.getSiguiente();
            }
        }
    }
    public void Listar_Combo(JComboBox combo) {
        DefaultComboBoxModel mdo = new DefaultComboBoxModel();
        combo.setModel(mdo);
        if (!Lista_Vacia()) {
            Nodo<Cliente> aux = inicio;
            while (aux != null) {       
                mdo.addElement(aux.getElemento());
                aux = aux.getSiguiente();
            }
        }
    }
    
}
