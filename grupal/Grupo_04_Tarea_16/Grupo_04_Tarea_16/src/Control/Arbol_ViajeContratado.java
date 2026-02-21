package Control;

import Modelo.ViajesContratados;
import java.util.HashMap;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Arbol_ViajeContratado {

    private Nodo_ViajesContratados Raiz;

    public Arbol_ViajeContratado() {
        Raiz = null;
    }

    public Nodo_ViajesContratados getRaiz() {
        return Raiz;
    }

    public void setRaiz(Nodo_ViajesContratados Raiz) {
        this.Raiz = Raiz;
    }

    //METODO INSERTAR
    public Nodo_ViajesContratados Insertar(Nodo_ViajesContratados Raiz, ViajesContratados Elemento) {
        if (Raiz == null) {
            Nodo_ViajesContratados Nuevo = new Nodo_ViajesContratados(Elemento);
            return Nuevo;
        } else {
            if (Elemento.getCodigoViaje() > Raiz.getElemento().getCodigoViaje()) {
                Raiz.setDer(Insertar(Raiz.getDer(), Elemento));
            } else {
                Raiz.setIzq(Insertar(Raiz.getIzq(), Elemento));
            }
        }
        return Raiz;
    }

    //METODO EDITAR
    public boolean Editar(ViajesContratados Nuevo) {
        Nodo_ViajesContratados Actual = Raiz;
        while (Actual != null) {
            if (Nuevo.getCodigoViaje()== Actual.getElemento().getCodigoViaje()) {
                Actual.setElemento(Nuevo);
                return true;
            } else if (Nuevo.getCodigoViaje()< Actual.getElemento().getCodigoViaje()) {
                Actual = Actual.getIzq();
            } else {
                Actual = Actual.getDer();
            }
        }
        return false;
    }
    
    //METODO ELIMINAR
    public Nodo_ViajesContratados Eliminar(Nodo_ViajesContratados Raiz, int Codigo) {
        if (Raiz == null) {
            return null;
        }
        if (Codigo < Raiz.getElemento().getCodigoViaje()) {
            Raiz.setIzq(Eliminar(Raiz.getIzq(), Codigo));
        } else if (Codigo > Raiz.getElemento().getCodigoViaje()) {
            Raiz.setDer(Eliminar(Raiz.getDer(), Codigo));
        } else {
            if (Raiz.getIzq() == null && Raiz.getDer() == null) {
                return null;
            } else if (Raiz.getIzq() == null) {
                return Raiz.getDer();
            } else if (Raiz.getDer() == null) {
                return Raiz.getIzq();
            } else {
                Nodo_ViajesContratados sucesor = Buscar_Minimo(Raiz.getDer());
                Raiz.setElemento(sucesor.getElemento());
                Raiz.setDer(Eliminar(Raiz.getDer(), sucesor.getElemento().getCodigoViaje()));
            }
        }
        return Reestructurar(Raiz);
    }

    //METODO LISTAR TABLA
    public void Listar(JTable controlTbl) {
        DefaultTableModel modTabla = new DefaultTableModel(new String[]{"CódigoViaje", "CódigoTurista", "CódigoSucursal", "CódigoEstancia"}, 0);
        controlTbl.setModel(modTabla);
        InOrderTBL(Raiz, modTabla);
    }

    //METODO LISTAR COMBO
    public void ListarCbo(JComboBox controlCbo, HashMap tablaHash) {
        DefaultComboBoxModel modCombo = new DefaultComboBoxModel();
        controlCbo.setModel(modCombo);
        InordenCBO(Raiz, modCombo, tablaHash);
    }

    //METODO BUSCAR
    public ViajesContratados Buscar(Nodo_ViajesContratados Raiz, int codigo) {
        if (Raiz == null) {
            return null;
        } else if (codigo == Raiz.getElemento().getCodigoViaje()) {
            return Raiz.getElemento();
        } else if (codigo < Raiz.getElemento().getCodigoViaje()) {
            return Buscar(Raiz.getIzq(), codigo);
        } else {
            return Buscar(Raiz.getDer(), codigo);
        }
    }

    public void InOrderTBL(Nodo_ViajesContratados Raiz, DefaultTableModel modTabla) {
        if (Raiz != null) {
            InOrderTBL(Raiz.getIzq(), modTabla);
            modTabla.addRow(Raiz.getRegistro());
            InOrderTBL(Raiz.getDer(), modTabla);
        }
    }

    public void InordenCBO(Nodo_ViajesContratados raiz, DefaultComboBoxModel modCombo, HashMap tablaHash) {
        if (raiz != null) {
            InordenCBO(raiz.getIzq(), modCombo, tablaHash);
            modCombo.addElement(raiz.getElemento().getCodigoViaje());
            tablaHash.put(raiz.getElemento().getCodigoViaje(), raiz.getElemento());
            InordenCBO(raiz.getDer(), modCombo, tablaHash);
        }
    }

    public Nodo_ViajesContratados equi(Nodo_ViajesContratados Raiz) {
        if (Raiz != null) {
            if (Equilibrar(Raiz) < 0) {
                Raiz.setDer(equi(Raiz.getDer()));
                Raiz.setIzq(equi(Raiz.getIzq()));
                Raiz = Reestructurar(Raiz);
            }
        }
        return Raiz;
    }

    /*  Metodo Equilibrar:
        |Recorre el árbol y determina si hay algún nodo con diferencia de alturas > 1.
    	
        Verifica si un nodo 
        (y sus subárboles)  
        están balanceados y 
        retorna su altura.
     */
    public int Equilibrar(Nodo_ViajesContratados raiz) {
        int hIzq = 0;
        int hDer = 0;
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

    //Sirve para la reestructuracion
    public int ExtraerFactor_e(Nodo_ViajesContratados raiz) {
        if (raiz != null) {
            return raiz.getFactor_e();
        }
        return 0;
    }

    //Esto reestructura el arbol
    public Nodo_ViajesContratados Reestructurar(Nodo_ViajesContratados raiz) {
        if (ExtraerFactor_e(raiz) == 2) {
            if (ExtraerFactor_e(raiz.getDer()) == 1) {
                raiz = RotacionsSimpleIzquierda(raiz);
            } else if (ExtraerFactor_e(raiz.getDer()) == -1) {
                raiz = RotacionCompuestaIzquierda(raiz);
            }
        } else if (ExtraerFactor_e(raiz) == -2) {
            if (ExtraerFactor_e(raiz.getIzq()) == -1) {
                raiz = RotacionsSimpleDerecha(raiz);
            } else if (ExtraerFactor_e(raiz.getIzq()) == 1) {
                raiz = RotacionCompuestaDerecha(raiz);
            }
        }
        return raiz;
    }

    //Metodo para la reestructuracion
    public Nodo_ViajesContratados RotacionsSimpleIzquierda(Nodo_ViajesContratados raiz) {
        JOptionPane.showMessageDialog(null, "Rotacion simple a la izquierda");
        Nodo_ViajesContratados nodoTemp = raiz;
        raiz = nodoTemp.getDer();
        nodoTemp.setDer(raiz.getIzq());
        raiz.setIzq(nodoTemp);
        return raiz;
    }

    //Metodo para la reestructuracion
    public Nodo_ViajesContratados RotacionsSimpleDerecha(Nodo_ViajesContratados raiz) {
        JOptionPane.showMessageDialog(null, "Rotacion simple a la derecha");
        Nodo_ViajesContratados nodoTemp = raiz;
        raiz = nodoTemp.getIzq();
        nodoTemp.setIzq(raiz.getDer());
        raiz.setDer(nodoTemp);
        return raiz;
    }

    //Metodo para la reestructuracion
    public Nodo_ViajesContratados RotacionCompuestaIzquierda(Nodo_ViajesContratados raiz) {
        JOptionPane.showMessageDialog(null, "Rotacion compuesta a la izquierda");
        Nodo_ViajesContratados nodoTemp = raiz;
        nodoTemp = RotacionsSimpleDerecha(nodoTemp.getDer());
        raiz.setDer(nodoTemp);
        nodoTemp = RotacionsSimpleIzquierda(raiz);
        return nodoTemp;
    }

    //Metodo para la reestructuracion
    public Nodo_ViajesContratados RotacionCompuestaDerecha(Nodo_ViajesContratados raiz) {
        JOptionPane.showMessageDialog(null, "Rotacion compuesta a la derecha");
        Nodo_ViajesContratados nodoTemp = raiz;
        nodoTemp = RotacionsSimpleIzquierda(nodoTemp.getIzq());
        raiz.setIzq(nodoTemp);
        nodoTemp = RotacionsSimpleDerecha(raiz);
        return nodoTemp;
    }

    //Metodo para eliminar
    public Nodo_ViajesContratados Buscar_Minimo(Nodo_ViajesContratados raiz) {
        if (raiz == null) {
            return null;
        }
        if (raiz.getIzq() == null) {
            return raiz;
        }
        return Buscar_Minimo(raiz.getIzq());
    }

}
