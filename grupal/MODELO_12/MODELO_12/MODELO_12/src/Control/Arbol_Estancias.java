package Control;

import Modelo.Estancias;
import java.util.HashMap;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Arbol_Estancias {

    private Nodo_Estancias Raiz;

    public Arbol_Estancias() {
        Raiz = null;
    }

    public Nodo_Estancias getRaiz() {
        return Raiz;
    }

    public void setRaiz(Nodo_Estancias Raiz) {
        this.Raiz = Raiz;
    }

    //METODO INSERTAR
    public Nodo_Estancias Insertar(Nodo_Estancias Raiz, Estancias Elemento) {
        if (Raiz == null) {
            Nodo_Estancias Nuevo = new Nodo_Estancias(Elemento);
            return Nuevo;
        } else {
            if (Elemento.getCodigoEstancia() > Raiz.getElemento().getCodigoEstancia()) {
                Raiz.setDer(Insertar(Raiz.getDer(), Elemento));
            } else {
                Raiz.setIzq(Insertar(Raiz.getIzq(), Elemento));
            }
        }
        return Raiz;
    }

    //METODO EDITAR
    public boolean Editar(Estancias Nuevo) {
        Nodo_Estancias Actual = Raiz;
        while (Actual != null) {
            if (Nuevo.getCodigoEstancia() == Actual.getElemento().getCodigoEstancia()) {
                Actual.setElemento(Nuevo);
                return true;
            } else if (Nuevo.getCodigoEstancia() < Actual.getElemento().getCodigoEstancia()) {
                Actual = Actual.getIzq();
            } else {
                Actual = Actual.getDer();
            }
        }
        return false;
    }

    //METODO ELIMINAR
    public void InordenCBO(Nodo_Estancias raiz, DefaultComboBoxModel modelo, HashMap tabla1) {
        if (raiz != null) {
            InordenCBO(raiz.getIzq(), modelo, tabla1);
            modelo.addElement(raiz.getElemento().getCodigoEstancia());
            tabla1.put(raiz.getElemento().getCodigoEstancia(), raiz.getElemento());
            InordenCBO(raiz.getDer(), modelo, tabla1);
        }
        
    }//
    
     public void ListarCbo(JComboBox cbo, HashMap tabla) {
        DefaultComboBoxModel modelos = new DefaultComboBoxModel();
        cbo.setModel(modelos);
   
        InordenCBO(Raiz, modelos, tabla);
    }
     
     
    public Nodo_Estancias Eliminar(Nodo_Estancias Raiz, int Codigo) {
        if (Raiz == null) {
            return null;
        }
        if (Codigo < Raiz.getElemento().getCodigoEstancia()) {
            Raiz.setIzq(Eliminar(Raiz.getIzq(), Codigo));
        } else if (Codigo > Raiz.getElemento().getCodigoEstancia()) {
            Raiz.setDer(Eliminar(Raiz.getDer(), Codigo));
        } else {
            if (Raiz.getIzq() == null && Raiz.getDer() == null) {
                return null;
            } else if (Raiz.getIzq() == null) {
                return Raiz.getDer();
            } else if (Raiz.getDer() == null) {
                return Raiz.getIzq();
            } else {
                Nodo_Estancias sucesor = Buscar_Minimo(Raiz.getDer());
                Raiz.setElemento(sucesor.getElemento());
                Raiz.setDer(Eliminar(Raiz.getDer(), sucesor.getElemento().getCodigoEstancia()));
            }
        }
        return Reestructurar(Raiz);
    }

    //METODO LISTAR
    public void Listar(JTable control) {
        DefaultTableModel modTabla = new DefaultTableModel(new String[]{"CódigoEstancia", "Pension", "FechaEntrada", "FechaSalida", "Hoteles_CodigoHotel"}, 0);
        control.setModel(modTabla);
        InOrder(Raiz, modTabla);
    }
    
    //METODO BUSCAR
    
    public Estancias Buscar(Nodo_Estancias raiz, int codigo) {
        if (raiz == null) {
            return null;
        } else if (codigo == raiz.getElemento().getCodigoEstancia()) {
            return raiz.getElemento();
        } else if (codigo < raiz.getElemento().getCodigoEstancia()) {
            return Buscar(raiz.getIzq(), codigo);
        } else {
            return Buscar(raiz.getDer(), codigo);
        }
    }
    
    public void InOrder(Nodo_Estancias Raiz, DefaultTableModel modTabla) {
        if (Raiz != null) {
            InOrder(Raiz.getIzq(), modTabla);
            modTabla.addRow(Raiz.getRegistro());
            InOrder(Raiz.getDer(), modTabla);
        }
    }
    
    
    public Nodo_Estancias equi(Nodo_Estancias raiz) {
        if (raiz != null) {
            if (Equilibrar(raiz) < 0) {
                raiz.setDer(equi(raiz.getDer()));
                raiz.setIzq(equi(raiz.getIzq()));
                raiz = Reestructurar(raiz);
            }
        }
        return raiz;
    }

    /*  Metodo Equilibrar:
        |Recorre el árbol y determina si hay algún nodo con diferencia de alturas > 1.
    	
        Verifica si un nodo 
        (y sus subárboles)  
        están balanceados y 
        retorna su altura.
     */
    public int Equilibrar(Nodo_Estancias raiz) {
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
    public int ExtraerFactor_e(Nodo_Estancias raiz) {
        if (raiz != null) {
            return raiz.getFactor_e();
        }
        return 0;
    }

    //Esto reestructura el arbol
    public Nodo_Estancias Reestructurar(Nodo_Estancias raiz) {
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
    public Nodo_Estancias RotacionsSimpleIzquierda(Nodo_Estancias raiz) {
        JOptionPane.showMessageDialog(null, "Rotacion simple a la izquierda");
        Nodo_Estancias nodoTemp = raiz;
        raiz = nodoTemp.getDer();
        nodoTemp.setDer(raiz.getIzq());
        raiz.setIzq(nodoTemp);
        return raiz;
    }

    //Metodo para la reestructuracion
    public Nodo_Estancias RotacionsSimpleDerecha(Nodo_Estancias raiz) {
        JOptionPane.showMessageDialog(null, "Rotacion simple a la derecha");
        Nodo_Estancias nodoTemp = raiz;
        raiz = nodoTemp.getIzq();
        nodoTemp.setIzq(raiz.getDer());
        raiz.setDer(nodoTemp);
        return raiz;
    }

    //Metodo para la reestructuracion
    public Nodo_Estancias RotacionCompuestaIzquierda(Nodo_Estancias raiz) {
        JOptionPane.showMessageDialog(null, "Rotacion compuesta a la izquierda");
        Nodo_Estancias nodoTemp = raiz;
        nodoTemp = RotacionsSimpleDerecha(nodoTemp.getDer());
        raiz.setDer(nodoTemp);
        nodoTemp = RotacionsSimpleIzquierda(raiz);
        return nodoTemp;
    }

    //Metodo para la reestructuracion
    public Nodo_Estancias RotacionCompuestaDerecha(Nodo_Estancias raiz) {
        JOptionPane.showMessageDialog(null, "Rotacion compuesta a la derecha");
        Nodo_Estancias nodoTemp = raiz;
        nodoTemp = RotacionsSimpleIzquierda(nodoTemp.getIzq());
        raiz.setIzq(nodoTemp);
        nodoTemp = RotacionsSimpleDerecha(raiz);
        return nodoTemp;
    }

    //Metodo para eliminar
    public Nodo_Estancias Buscar_Minimo(Nodo_Estancias raiz) {
        if (raiz == null) {
            return null;
        }
        if (raiz.getIzq() == null) {
            return raiz;
        }
        return Buscar_Minimo(raiz.getIzq());
    }

}
