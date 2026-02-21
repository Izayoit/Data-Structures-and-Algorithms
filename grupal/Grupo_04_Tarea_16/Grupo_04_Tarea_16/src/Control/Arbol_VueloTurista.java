package Control;

import Modelo.VuelosTurista;
import java.util.HashMap;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;

public class Arbol_VueloTurista {

    private Nodo_VuelosTurista Raiz;

    public Arbol_VueloTurista() {
        Raiz = null;
    }

    public Nodo_VuelosTurista getRaiz() {
        return Raiz;
    }

    public void setRaiz(Nodo_VuelosTurista Raiz) {
        this.Raiz = Raiz;
    }

    public Nodo_VuelosTurista Insertar(Nodo_VuelosTurista Raiz, VuelosTurista Elemento) {
        if (Raiz == null) {
            Nodo_VuelosTurista Nuevo = new Nodo_VuelosTurista(Elemento);
            return Nuevo;
        } else {
            if (Elemento.getCodigoVuelo() > Raiz.getElemento().getCodigoVuelo()) {
                Raiz.setDer(Insertar(Raiz.getDer(), Elemento));
            } else {
                Raiz.setIzq(Insertar(Raiz.getIzq(), Elemento));
            }
        }
        return Reestructurar(Raiz);
    }

    public boolean Editar(VuelosTurista Nuevo) {
        Nodo_VuelosTurista Actual = Raiz;
        while (Actual != null) {
            if (Nuevo.getCodigoVuelo() == Actual.getElemento().getCodigoVuelo()) {
                Actual.setElemento(Nuevo);
                return true;
            } else if (Nuevo.getCodigoVuelo() < Actual.getElemento().getCodigoVuelo()) {
                Actual = Actual.getIzq();
            } else {
                Actual = Actual.getDer();
            }
        }
        return false;
    }

    public void InordenCBO(Nodo_VuelosTurista raiz, DefaultComboBoxModel modelo, HashMap tabla1) {
        if (raiz != null) {
            InordenCBO(raiz.getIzq(), modelo, tabla1);
            modelo.addElement(raiz.getElemento().getCodigoVuelo());
            tabla1.put(raiz.getElemento().getCodigoVuelo(), raiz.getElemento());
            InordenCBO(raiz.getDer(), modelo, tabla1);
        }
    }

    public void ListarCbo(JComboBox cbo, HashMap tabla) {
        DefaultComboBoxModel modelos = new DefaultComboBoxModel();
        cbo.setModel(modelos);
        InordenCBO(Raiz, modelos, tabla);
    }

    public Nodo_VuelosTurista Eliminar(Nodo_VuelosTurista Raiz, int Codigo) {
        if (Raiz == null) {
            return null;
        }
        if (Codigo < Raiz.getElemento().getCodigoVuelo()) {
            Raiz.setIzq(Eliminar(Raiz.getIzq(), Codigo));
        } else if (Codigo > Raiz.getElemento().getCodigoVuelo()) {
            Raiz.setDer(Eliminar(Raiz.getDer(), Codigo));
        } else {
            if (Raiz.getIzq() == null && Raiz.getDer() == null) {
                return null;
            } else if (Raiz.getIzq() == null) {
                return Raiz.getDer();
            } else if (Raiz.getDer() == null) {
                return Raiz.getIzq();
            } else {
                Nodo_VuelosTurista sucesor = Buscar_Minimo(Raiz.getDer());
                Raiz.setElemento(sucesor.getElemento());
                Raiz.setDer(Eliminar(Raiz.getDer(), sucesor.getElemento().getCodigoVuelo()));
            }
        }
        return Reestructurar(Raiz);
    }

    public void Listar(JTable control) {
        DefaultTableModel modTabla = new DefaultTableModel(new String[]{"CodigoVuelo", "Clase", "NumeroAsientos", "CantidadAsientos"}, 0);
        control.setModel(modTabla);
        InOrder(Raiz, modTabla);
    }

    public VuelosTurista Buscar(Nodo_VuelosTurista raiz, int codigo) {
        if (raiz == null) {
            return null;
        } else if (codigo == raiz.getElemento().getCodigoVuelo()) {
            return raiz.getElemento();
        } else if (codigo < raiz.getElemento().getCodigoVuelo()) {
            return Buscar(raiz.getIzq(), codigo);
        } else {
            return Buscar(raiz.getDer(), codigo);
        }
    }

    public void InOrder(Nodo_VuelosTurista Raiz, DefaultTableModel modTabla) {
        if (Raiz != null) {
            InOrder(Raiz.getIzq(), modTabla);
            modTabla.addRow(Raiz.getRegistro());
            InOrder(Raiz.getDer(), modTabla);
        }
    }

    public Nodo_VuelosTurista equi(Nodo_VuelosTurista raiz) {
        if (raiz != null) {
            if (Equilibrar(raiz) < 0) {
                raiz.setDer(equi(raiz.getDer()));
                raiz.setIzq(equi(raiz.getIzq()));
                raiz = Reestructurar(raiz);
            }
        }
        return raiz;
    }

    public int Equilibrar(Nodo_VuelosTurista raiz) {
        int hIzq = 0, hDer = 0;
        if (raiz == null) {
            return 0;
        }
        hIzq = Equilibrar(raiz.getIzq());
        if (hIzq < 0) {
            return hIzq;
        }
        hDer = Equilibrar(raiz.getDer());
        if (hDer < 0) {
            return hDer;
        }
        if (Math.abs(hIzq - hDer) > 1) {
            return -1;
        }
        return Math.max(hIzq, hDer) + 1;
    }

    public int ExtraerFactor_e(Nodo_VuelosTurista raiz) {
        if (raiz != null) {
            return raiz.getFactor_e();
        }
        return 0;
    }

    public Nodo_VuelosTurista Reestructurar(Nodo_VuelosTurista raiz) {
        if (ExtraerFactor_e(raiz) == 2) {
            if (ExtraerFactor_e(raiz.getDer()) == 1) {
                raiz = RotacionSimpleIzquierda(raiz);
            } else if (ExtraerFactor_e(raiz.getDer()) == -1) {
                raiz = RotacionCompuestaIzquierda(raiz);
            }
        } else if (ExtraerFactor_e(raiz) == -2) {
            if (ExtraerFactor_e(raiz.getIzq()) == -1) {
                raiz = RotacionSimpleDerecha(raiz);
            } else if (ExtraerFactor_e(raiz.getIzq()) == 1) {
                raiz = RotacionCompuestaDerecha(raiz);
            }
        }
        return raiz;
    }

    public Nodo_VuelosTurista RotacionSimpleIzquierda(Nodo_VuelosTurista raiz) {
        JOptionPane.showMessageDialog(null, "Rotación simple a la izquierda");
        Nodo_VuelosTurista temp = raiz;
        raiz = temp.getDer();
        temp.setDer(raiz.getIzq());
        raiz.setIzq(temp);
        return raiz;
    }

    public Nodo_VuelosTurista RotacionSimpleDerecha(Nodo_VuelosTurista raiz) {
        JOptionPane.showMessageDialog(null, "Rotación simple a la derecha");
        Nodo_VuelosTurista temp = raiz;
        raiz = temp.getIzq();
        temp.setIzq(raiz.getDer());
        raiz.setDer(temp);
        return raiz;
    }

    public Nodo_VuelosTurista RotacionCompuestaIzquierda(Nodo_VuelosTurista raiz) {
        JOptionPane.showMessageDialog(null, "Rotación compuesta a la izquierda");
        raiz.setDer(RotacionSimpleDerecha(raiz.getDer()));
        return RotacionSimpleIzquierda(raiz);
    }

    public Nodo_VuelosTurista RotacionCompuestaDerecha(Nodo_VuelosTurista raiz) {
        JOptionPane.showMessageDialog(null, "Rotación compuesta a la derecha");
        raiz.setIzq(RotacionSimpleIzquierda(raiz.getIzq()));
        return RotacionSimpleDerecha(raiz);
    }

    public Nodo_VuelosTurista Buscar_Minimo(Nodo_VuelosTurista raiz) {
        if (raiz == null || raiz.getIzq() == null) {
            return raiz;
        }
        return Buscar_Minimo(raiz.getIzq());
    }
}
