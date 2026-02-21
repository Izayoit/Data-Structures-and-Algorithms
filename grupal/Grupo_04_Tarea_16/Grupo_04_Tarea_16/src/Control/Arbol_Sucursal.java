package Control;

import Modelo.Sucursales;
import java.util.HashMap;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Arbol_Sucursal {

    private Nodo_Sucursales raiz;

    public Arbol_Sucursal() {
        raiz = null;
    }

    public Nodo_Sucursales getRaiz() {
        return raiz;
    }

    public void setRaiz(Nodo_Sucursales raiz) {
        this.raiz = raiz;
    }

    public Sucursales Buscar(int codigo) {
        Nodo_Sucursales actual = raiz;
        while (actual != null) {
            if (codigo == actual.getElemento().getCodigoSucursal()) {
                return actual.getElemento();
            } else if (codigo < actual.getElemento().getCodigoSucursal()) {
                actual = actual.getIzq();
            } else {
                actual = actual.getDer();
            }
        }
        return null;
    }

    public Nodo_Sucursales Insertar(Nodo_Sucursales raiz, Sucursales elemento) {
        if (raiz == null) {
            Nodo_Sucursales nuevo = new Nodo_Sucursales(elemento);
            return nuevo;
        } else if (elemento.getCodigoSucursal() < raiz.getElemento().getCodigoSucursal()) {
            raiz.setIzq(Insertar(raiz.getIzq(), elemento));
        } else if (elemento.getCodigoSucursal() > raiz.getElemento().getCodigoSucursal()) {
            raiz.setDer(Insertar(raiz.getDer(), elemento));
        } else {
            JOptionPane.showMessageDialog(null, "el codigo " + elemento.getCodigoSucursal() + " ya a sido usado");

        }
        return raiz;
    }

    public void Inorden(Nodo_Sucursales raiz, DefaultTableModel modelo) {
        if (raiz != null) {
            Inorden(raiz.getIzq(), modelo);
            modelo.addRow(raiz.getRegistro());
            Inorden(raiz.getDer(), modelo);
        }
    }

    public void InordenCBO(Nodo_Sucursales raiz, DefaultComboBoxModel modelo, HashMap tabla1) {
        if (raiz != null) {
            InordenCBO(raiz.getIzq(), modelo, tabla1);
            modelo.addElement(raiz.getElemento().getCodigoSucursal());
            tabla1.put(raiz.getElemento().getCodigoSucursal(), raiz.getElemento());
            InordenCBO(raiz.getDer(), modelo, tabla1);
        }
    }

    private void InordenFiltrado(Nodo_Sucursales nodo, DefaultTableModel modelo, String filtro) {
        if (nodo != null) {
            InordenFiltrado(nodo.getIzq(), modelo, filtro);

            String textoNodo = nodo.getCadena().toLowerCase();
            if (textoNodo.contains(filtro)) {
                modelo.addRow(nodo.getRegistro());
            }

            InordenFiltrado(nodo.getDer(), modelo, filtro);
        }
    }

    public void Filtrar(JTable tabla, String filtro) {
        String[] cabecera = {"codigo", "direccion", "telefono"};
        DefaultTableModel modelo = new DefaultTableModel(cabecera, 0);
        tabla.setModel(modelo);

        InordenFiltrado(raiz, modelo, filtro);
    }

    public void Listar(JTable tabla) {
        String[] cabecera = {"codigo", "direccion", "telefono"};
        DefaultTableModel modelo = new DefaultTableModel(cabecera, 0);
        tabla.setModel(modelo);
        Inorden(raiz, modelo);
    }

    public void ListarCbo(JComboBox cbo, HashMap tabla) {
        DefaultComboBoxModel modelos = new DefaultComboBoxModel();
        cbo.setModel(modelos);
        InordenCBO(raiz, modelos, tabla);
    }

    public Sucursales Buscar(Nodo_Sucursales raiz, int codigo) {
        if (raiz == null) {
            return null;
        }

        if (codigo == raiz.getElemento().getCodigoSucursal()) {
            return raiz.getElemento();
        } else if (codigo < raiz.getElemento().getCodigoSucursal()) {
            return Buscar(raiz.getIzq(), codigo);
        } else {
            return Buscar(raiz.getDer(), codigo);
        }
    }

    public Nodo_Sucursales eliminar(Nodo_Sucursales raiz, int codigo) {
        if (raiz == null) {
            return null;
        }

        if (codigo < raiz.getElemento().getCodigoSucursal()) {
            raiz.setIzq(eliminar(raiz.getIzq(), codigo));
        } else if (codigo > raiz.getElemento().getCodigoSucursal()) {
            raiz.setDer(eliminar(raiz.getDer(), codigo));
        } else {

            if (raiz.getIzq() == null && raiz.getDer() == null) {
                return null;
            } else if (raiz.getIzq() == null) {
                return raiz.getDer();
            } else if (raiz.getDer() == null) {
                return raiz.getIzq();
            } else {

                Nodo_Sucursales sucesor = encontrarMinimo(raiz.getDer());
                raiz.setElemento(sucesor.getElemento());
                raiz.setDer(eliminar(raiz.getDer(), sucesor.getElemento().getCodigoSucursal()));
            }
        }
        return raiz;
    }

    private Nodo_Sucursales encontrarMinimo(Nodo_Sucursales nodo) {
        while (nodo.getIzq() != null) {
            nodo = nodo.getIzq();
        }
        return nodo;
    }
}
