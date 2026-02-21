package Control;

import Modelo.usuario;
import java.util.HashMap;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Arbol_Usuario {

    private Nodo_Usuario Raiz;

    public Arbol_Usuario() {
        Raiz = null;
    }

    public Nodo_Usuario getRaiz() {
        return Raiz;
    }

    public void setRaiz(Nodo_Usuario Raiz) {
        this.Raiz = Raiz;
    }

    public Nodo_Usuario Registrar(Nodo_Usuario Raiz, usuario Elemento) {
        if (Raiz == null) {
            Nodo_Usuario Nuevo = new Nodo_Usuario(Elemento);
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
        String[] Cabecera = {"Código","dni", "Nombre", "edad","region","proveedor","tipo conexion","consumo promedio"};
        DefaultTableModel modTabla = new DefaultTableModel(Cabecera, 0);
        control.setModel(modTabla);
        IonOrder(Raiz, modTabla);
    }

    public void IonOrder(Nodo_Usuario Raiz, DefaultTableModel modTabla) {
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

    public void Imprimir(Nodo_Usuario Raiz,  DefaultComboBoxModel modCombo, HashMap tablaHash,  HashMap tablaHash2) {
        if (Raiz != null) {

            Imprimir(Raiz.getIzquierda(), modCombo, tablaHash, tablaHash2);

            modCombo.addElement(Raiz.getElemento().getNombre());
            
            tablaHash.put(Raiz.getElemento().getNombre(), //guardo en los hashmap
                    Raiz.getElemento().getConsumoPromedio() + "");
            
            tablaHash2.put(Raiz.getElemento().getNombre(),//guardo en los hashmap
                    Raiz.getElemento());
            Imprimir(Raiz.getDerecha(), modCombo, tablaHash, tablaHash2);
        }
    }

    public Nodo_Usuario Buscar_Codigo(int Codigo) {
        Nodo_Usuario aux = Raiz;
        while (aux != null) {
            int valor = aux.getElemento().getCodigo();
            if (valor == Codigo) {
                return aux;
            } else {
                if (Codigo > valor) {
                    aux = aux.getDerecha();
                } else {
                    aux = aux.getIzquierda();
                }
            }
        }
        return null;
    }
}
