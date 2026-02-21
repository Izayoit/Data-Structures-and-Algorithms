//ME FALTA VER
package Control;

import Modelo.Hoteles;
import java.util.HashMap;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Arbol_Hotel {

    private Nodo_Hoteles raiz;

    public Arbol_Hotel() {
        raiz = null;
    }

    public Nodo_Hoteles getRaiz() {
        return raiz;
    }

    public void setRaiz(Nodo_Hoteles raiz) {
        this.raiz = raiz;
    }

    public Nodo_Hoteles Insertar(Nodo_Hoteles raiz, Hoteles elemento) {
        if (raiz == null) {
            Nodo_Hoteles nuevo = new Nodo_Hoteles(elemento);
            return nuevo;
        }
        if (elemento.getCodigoHotel() < raiz.getElemento().getCodigoHotel()) {
            raiz.setIzq(Insertar(raiz.getIzq(), elemento));
        } else if (elemento.getCodigoHotel() > raiz.getElemento().getCodigoHotel()) {
            raiz.setDer(Insertar(raiz.getDer(), elemento));
        } else {
            JOptionPane.showMessageDialog(null, "el codigo " + elemento.getCodigoHotel() + " ya a sido usado");

        }
        return raiz;
    }

    public Hoteles Buscar(Nodo_Hoteles raiz, int codigo) {
        if (raiz == null) {
            return null;
        }
        if (codigo == raiz.getElemento().getCodigoHotel()) {
            return raiz.getElemento();
        } else if (codigo < raiz.getElemento().getCodigoHotel()) {
            return Buscar(raiz.getIzq(), codigo);
        } else {
            return Buscar(raiz.getDer(), codigo);
        }
    }

    public void Inorden(Nodo_Hoteles raiz, DefaultTableModel modelo) {
        if (raiz != null) {
            Inorden(raiz.getIzq(), modelo);
            modelo.addRow(raiz.getElemento().getRegistro());
            Inorden(raiz.getDer(), modelo);
        }
    }

    public void InordenCBO(Nodo_Hoteles raiz, DefaultComboBoxModel modelo, HashMap tabla1) {
        if (raiz != null) {
            InordenCBO(raiz.getIzq(), modelo, tabla1);
            modelo.addElement(raiz.getElemento().getCodigoHotel());
            tabla1.put(raiz.getElemento().getCodigoHotel(), raiz.getElemento());
            InordenCBO(raiz.getDer(), modelo, tabla1);
        }
    }

    public void ListarCbo(JComboBox cbo, HashMap tabla) {
        DefaultComboBoxModel modelos = new DefaultComboBoxModel();
        cbo.setModel(modelos);
        InordenCBO(raiz, modelos, tabla);
    }

    public void Listar(JTable tabla) {
        String[] cabecera = {"codigo", "direccion", "telefono"};
        DefaultTableModel modelo = new DefaultTableModel(cabecera, 0);
        tabla.setModel(modelo);
        Inorden(raiz, modelo);
    }

    public Hoteles Buscar(int codigo) {
        Nodo_Hoteles actual = raiz;
        while (actual != null) {
            if (codigo == actual.getElemento().getCodigoHotel()) {
                return actual.getElemento();
            } else if (codigo < actual.getElemento().getCodigoHotel()) {
                actual = actual.getIzq();
            } else {
                actual = actual.getDer();
            }
        }
        return null;
    }

    public boolean Editar(Hoteles nuevo) {
        Nodo_Hoteles actual = raiz;
        while (actual != null) {
            if (nuevo.getCodigoHotel() == actual.getElemento().getCodigoHotel()) {
                actual.setElemento(nuevo);
                return true;
            } else if (nuevo.getCodigoHotel() < actual.getElemento().getCodigoHotel()) {
                actual = actual.getIzq();
            } else {
                actual = actual.getDer();
            }
        }
        return false;
    }

    public Nodo_Hoteles Eliminar(Nodo_Hoteles raiz, int codigo) {
        if (raiz == null) {
            return null;
        }

        if (codigo < raiz.getElemento().getCodigoHotel()) {
            raiz.setIzq(Eliminar(raiz.getIzq(), codigo));
        } else if (codigo > raiz.getElemento().getCodigoHotel()) {
            raiz.setDer(Eliminar(raiz.getDer(), codigo));
        } else {

            if (raiz.getIzq() == null && raiz.getDer() == null) {
                return null;
            } else if (raiz.getIzq() == null) {
                return raiz.getDer();
            } else if (raiz.getDer() == null) {
                return raiz.getIzq();
            } else {

                Nodo_Hoteles sucesor = EncontrarMinimo(raiz.getDer());
                raiz.setElemento(sucesor.getElemento());
                raiz.setDer(Eliminar(raiz.getDer(), sucesor.getElemento().getCodigoHotel()));
            }
        }
        return raiz;
    }

    private Nodo_Hoteles EncontrarMinimo(Nodo_Hoteles nodo) {
        while (nodo.getIzq() != null) {
            nodo = nodo.getIzq();
        }
        return nodo;
    }
}
