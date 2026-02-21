package Control;

import Modelo.Pais;
import java.util.HashMap;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Arbol_Pais {

    private Nodo_Pais Raiz;

    public Arbol_Pais() {
        Raiz = null;
    }

    public Nodo_Pais getRaiz() {
        return Raiz;
    }

    public void setRaiz(Nodo_Pais Raiz) {
        this.Raiz = Raiz;
    }

    public Nodo_Pais Registrar(Nodo_Pais Raiz, Pais Elemento) {
        if (Raiz == null) {
            Nodo_Pais Nuevo = new Nodo_Pais(Elemento);
            return Nuevo;
        } else {
            if (Elemento.getCodigo() > Raiz.getElemento().getCodigo()) {
                Raiz.setDerecha(Registrar(Raiz.getDerecha(), Elemento));
            } else {
                Raiz.setIzquierda(Registrar(Raiz.getIzquierda(), Elemento));
            }
        }
        return Raiz;
    }

    public void Listar(JTable control) {
        String[] Cabecera = {"Código", "Nombre", "Precio"};
        DefaultTableModel modTabla = new DefaultTableModel(Cabecera, 0);
        control.setModel(modTabla);
        IonOrder(Raiz, modTabla);
    }

    public void IonOrder(Nodo_Pais Raiz, DefaultTableModel modTabla) {
        if (Raiz != null) {
            IonOrder(Raiz.getIzquierda(), modTabla);
            modTabla.addRow(Raiz.getElemento().getRegistro());
            IonOrder(Raiz.getDerecha(), modTabla);
        }
    }

    public void Listar(JComboBox control, HashMap tablaHash, HashMap tablaHash2) {
        DefaultComboBoxModel modCombo = new DefaultComboBoxModel();
        control.setModel(modCombo);
        Imprimir(Raiz, modCombo, tablaHash, tablaHash2);
    }

    public void Imprimir(Nodo_Pais Raiz, DefaultComboBoxModel modCombo, HashMap tablaHash,  HashMap tablaHash2) {
        if (Raiz != null) {

            Imprimir(Raiz.getIzquierda(), modCombo, tablaHash, tablaHash2);

            modCombo.addElement(Raiz.getElemento().getNombre());
            
            tablaHash.put(Raiz.getElemento().getNombre(),
                    Raiz.getElemento().getPrecio() + "");
            tablaHash2.put(Raiz.getElemento().getNombre(),
                    Raiz.getElemento());
            Imprimir(Raiz.getDerecha(), modCombo, tablaHash, tablaHash2);
        }
    }

    public Nodo_Pais Buscar_Codigo(int Codigo) {
        Nodo_Pais Raiz = this.Raiz;
        while (Raiz != null) {
            int valor = Raiz.getElemento().getCodigo();
            if (valor == Codigo) {
                return Raiz;
            } else {
                if (Codigo > valor) {
                    Raiz = Raiz.getDerecha();
                } else {
                    Raiz = Raiz.getIzquierda();
                }
            }
        }
        return null;
    }
}
