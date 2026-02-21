package Control;

import Modelo.Turistas;
import java.util.HashMap;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Arbol_Turista {

    private Nodo_Turistas raiz;

    public Arbol_Turista() {
        raiz = null;
    }

    public Nodo_Turistas getRaiz() {
        return raiz;
    }

    public void setRaiz(Nodo_Turistas raiz) {
        this.raiz = raiz;
    }

    public Nodo_Turistas Insertar(Nodo_Turistas raiz, Turistas elemento) {
        if (raiz == null) {
            Nodo_Turistas nuevo = new Nodo_Turistas(elemento);
            return nuevo;
        } else if (elemento.getCodigoTurista() < raiz.getElemento().getCodigoTurista()) {
            raiz.setIzq(Insertar(raiz.getIzq(), elemento));
        } else if (elemento.getCodigoTurista() > raiz.getElemento().getCodigoTurista()) {
            raiz.setDer(Insertar(raiz.getDer(), elemento));
        } else {
            JOptionPane.showMessageDialog(null, "el codigo " + elemento.getCodigoTurista() + " ya a sido usado");

        }
        return raiz;
    }

    public void Inorden(Nodo_Turistas raiz, DefaultTableModel modelo) {
        if (raiz != null) {
            Inorden(raiz.getIzq(), modelo);
            modelo.addRow(raiz.getRegistro());
            Inorden(raiz.getDer(), modelo);
        }
    }

    public void InordenCBO(Nodo_Turistas raiz, DefaultComboBoxModel modelo, HashMap tabla1) {
        if (raiz != null) {
            InordenCBO(raiz.getIzq(), modelo, tabla1);
            modelo.addElement(raiz.getElemento().getCodigoTurista());
            tabla1.put(raiz.getElemento().getCodigoTurista(), raiz.getElemento());
            InordenCBO(raiz.getDer(), modelo, tabla1);
        }
    }

    public void Listar(JTable tabla) {
        String[] cabecera = {"codigo", "nombre", "apellido", "direccion", "telefono"};
        DefaultTableModel modelo = new DefaultTableModel(cabecera, 0);
        tabla.setModel(modelo);
        Inorden(raiz, modelo);
    }

    private void InordenFiltrado(Nodo_Turistas nodo, DefaultTableModel modelo, String filtro) {
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
        String[] cabecera = {"codigo", "nombre", "apellido", "direccion", "telefono"};
        DefaultTableModel modelo = new DefaultTableModel(cabecera, 0);
        tabla.setModel(modelo);

        InordenFiltrado(raiz, modelo, filtro.toLowerCase());
    }

    public void ListarCbo(JComboBox cbo, HashMap tabla) {
        DefaultComboBoxModel modelos = new DefaultComboBoxModel();
        cbo.setModel(modelos);
        InordenCBO(raiz, modelos, tabla);
    }

    public Turistas Buscar(Nodo_Turistas raiz, int codigo) {
        if (raiz == null) {
            return null;
        } else if (codigo == raiz.getElemento().getCodigoTurista()) {
            return raiz.getElemento();
        } else if (codigo < raiz.getElemento().getCodigoTurista()) {
            return Buscar(raiz.getIzq(), codigo);
        } else {
            return Buscar(raiz.getDer(), codigo);
        }
    }

    public Nodo_Turistas Eliminar(Nodo_Turistas raiz, int codigo) {
        if (raiz == null) {
            return null;
        }

        if (codigo < raiz.getElemento().getCodigoTurista()) {
            raiz.setIzq(Eliminar(raiz.getIzq(), codigo));
        } else if (codigo > raiz.getElemento().getCodigoTurista()) {
            raiz.setDer(Eliminar(raiz.getDer(), codigo));
        } else {

            if (raiz.getIzq() == null && raiz.getDer() == null) {
                return null;
            } else if (raiz.getIzq() == null) {
                return raiz.getDer();
            } else if (raiz.getDer() == null) {
                return raiz.getIzq();
            } else {

                Nodo_Turistas sucesor = encontrarMinimo(raiz.getDer());
                raiz.setElemento(sucesor.getElemento());
                raiz.setDer(Eliminar(raiz.getDer(), sucesor.getElemento().getCodigoTurista()));
            }
        }

        return raiz;
    }

    private Nodo_Turistas encontrarMinimo(Nodo_Turistas nodo) {
        while (nodo.getIzq() != null) {
            nodo = nodo.getIzq();
        }
        return nodo;
    }

    public boolean Editar(int codigo, Turistas datosNuevos) {
        Turistas t = Buscar(raiz, codigo);
        if (t != null) {
            t.setNombreTurista(datosNuevos.getNombreTurista());
            t.setApellidosTurista(datosNuevos.getApellidosTurista());
            t.setDireccionTurista(datosNuevos.getDireccionTurista());
            t.setTelefonoTurista(datosNuevos.getTelefonoTurista());
            return true;
        }
        return false;
    }
}
