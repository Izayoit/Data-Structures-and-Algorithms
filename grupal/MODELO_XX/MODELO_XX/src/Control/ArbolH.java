package Control;

import ModeloMantenimiento.Hotel;
import java.util.HashMap;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ArbolH {

    private NodoH raiz;

    public ArbolH() {
        raiz = null;
    }

    public NodoH getRaiz() {
        return raiz;
    }

    public void setRaiz(NodoH raiz) {
        this.raiz = raiz;
    }

    public NodoH Insertar(NodoH raiz, Hotel elemento) {
        if (raiz == null) {
            NodoH nuevo = new NodoH(elemento);
            return nuevo;
        } else if (elemento.getCodigoHotel() < raiz.getElemento().getCodigoHotel()) {
            raiz.setIzq(Insertar(raiz.getIzq(), elemento));
        } else if (elemento.getCodigoHotel() > raiz.getElemento().getCodigoHotel()) {
            raiz.setDer(Insertar(raiz.getDer(), elemento));
        } else {
            JOptionPane.showMessageDialog(null, "el codigo " + elemento.getCodigoHotel() + " ya a sido usado");

        }
        return raiz;
    }

    public void Inorden(NodoH raiz, DefaultTableModel modelo) {
        if (raiz != null) {
            Inorden(raiz.getIzq(), modelo);
            modelo.addRow(raiz.getElemento().getRegistro());
            Inorden(raiz.getDer(), modelo);
        }
    }

    public void InordenCBO(NodoH raiz, DefaultComboBoxModel modelo, HashMap tabla1) {
        if (raiz != null) {
            InordenCBO(raiz.getIzq(), modelo, tabla1);
            modelo.addElement(raiz.getElemento().getNombreHotel());
            tabla1.put(raiz.getElemento().getNombreHotel(), raiz.getElemento());
            InordenCBO(raiz.getDer(), modelo, tabla1);
        }
    }

    public void Listar(JTable tabla) {
        String[] cabecera = {"codigo", "nombre", "direccion", "ciudad", "telefono", "plaza"};
        DefaultTableModel modelo = new DefaultTableModel(cabecera, 0);
        tabla.setModel(modelo);
        Inorden(raiz, modelo);
    }

    public void ListarCbo(JComboBox cbo, HashMap tabla) {
        DefaultComboBoxModel modelos = new DefaultComboBoxModel();
        cbo.setModel(modelos);
        InordenCBO(raiz, modelos, tabla);
    }
}
