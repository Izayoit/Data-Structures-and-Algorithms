package Control;

import Modelo.Cliente;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class Arbol_AVL {

    private Nodo Raiz;

    public Arbol_AVL() {
        Raiz = null;
    }

    public Nodo getRaiz() {
        return Raiz;
    }

    public void setRaiz(Nodo Raiz) {
        this.Raiz = Raiz;
    }

    public Nodo Insertar(Nodo Raiz, Cliente Elemento) {
        if (Raiz == null) {
            Nodo Nuevo = new Nodo(Elemento);
            return Nuevo;
        } else {
            if (Elemento.getCodigo()
                    > Raiz.getElemento().getCodigo()) {
                Raiz.setDer(Insertar(Raiz.getDer(), Elemento));
            } else {
                Raiz.setIzq(Insertar(Raiz.getIzq(), Elemento));
            }
        }
        return Raiz;
    }

    public void Listar(JTable control) {
        DefaultTableModel modTabla = new DefaultTableModel(
                new String[]{"Código", "Nombre", "Préstamo","Altura","factor E"}, 0);
        control.setModel(modTabla);
        InOrder(Raiz, modTabla);
    }

    public void InOrder(Nodo Raiz, DefaultTableModel modTabla) {
        if (Raiz != null) {
            InOrder(Raiz.getIzq(), modTabla);
            modTabla.addRow(Raiz.getRegistro());
            InOrder(Raiz.getDer(), modTabla);
        }
    }

    public void Totalizar(JTextField control) {
        double total = Sumar(Raiz);
        control.setText(total + "");
    }

    public double Sumar(Nodo Raiz) {
        if (Raiz != null) {
            double t1 = Sumar(Raiz.getIzq());
            double prestamo = Raiz.getElemento().getPrestamo();
            double t2 = Sumar(Raiz.getDer());
            return t1 + prestamo + t2;
        }
        return 0;
    }

    public Nodo equi(Nodo raiz) {
        if (raiz != null) {
            if (equilibrar(raiz) < 0) {
                raiz.setDer(equi(raiz.getDer()));
                raiz.setIzq(equi(raiz.getIzq()));
                raiz = reestructurar(raiz);
            }

        }
        return raiz;

    }

    public int equilibrar(Nodo raiz) {

        int hIzq = 0;
        int hDer = 0;
        if (raiz == null) {
            return 0;
        }
 // primero ejemplo 30 20 10 hacia un lado pasa que lo llama hasta el 10
 //la primera pasada de una no usa los if solo usa el mathabs y mathmax
        hIzq = equilibrar(raiz.getIzq());
        if (hIzq < 0) {

            return hIzq;

        }
        hDer = equilibrar(raiz.getDer());

        if (hDer < 0) {
            return hDer;
        }
        // evaluamos 10 no se retorna.
        
        //10 su izq y derecha son 0 y pues no retorna -1
        //evaluamos 20 como asu izq almacenamos con anticipacion ahora izq 1 derecha 0
        //evaluamos 30 como asu izq alamacenamos quedaria 2 y derecha 0
        
        if (Math.abs(hIzq - hDer) > 1) {
            return -1;
    
      //aqui evaluamos 30 es mayor a 2 asi que retorna -1 y se da el desbalance
      
        }
       
        
        return Math.max(hIzq, hDer) + 1;
         //evaluamos 10 como su derecha y izq es 0 pues es 1
        //evaluamos 20 izquierda al ser almacenado pues el mayor es 1+1 =2
        //evaluamos 30 y sale 3 su mathmax
    }

    public Nodo reestructurar(Nodo raiz) {
        if (extraerFactor_e(raiz) == 2) {
            if (extraerFactor_e(raiz.getDer()) == 1) {
              raiz=  rotacionSimpleIzquierda(raiz);  
            } else if (extraerFactor_e(raiz.getDer()) == -1) {
                 raiz = rotacionCompuestaIzquierda(raiz);
            }
           

        } else if (extraerFactor_e(raiz) == -2) {
            if (extraerFactor_e(raiz.getIzq()) == -1) {
                raiz = rotacionSimpleDerecha(raiz);

            } else if (extraerFactor_e(raiz.getIzq()) == 1) {
                raiz = rotacionCompuestaDerecha(raiz);
            }
        }

        return raiz;

    }

     public Nodo rotacionSimpleIzquierda(Nodo raiz) {
       
        JOptionPane.showMessageDialog(null, "rotacion izquierda");
        Nodo nodoTemp = raiz;

        raiz = nodoTemp.getDer();
        nodoTemp.setDer(raiz.getIzq());
        raiz.setIzq(nodoTemp);

        return raiz;
    }

    public Nodo rotacionSimpleDerecha(Nodo raiz) {

        JOptionPane.showMessageDialog(null, "rotacion derecha");
        Nodo nodoTemp =raiz;
        
        raiz = nodoTemp.getIzq();
        nodoTemp.setIzq(raiz.getDer());
        raiz.setDer(nodoTemp);
        //aya..
        
        return raiz;
    }

    public Nodo rotacionCompuestaIzquierda(Nodo raiz) {
         JOptionPane.showMessageDialog(null, "rotacion compuesta izquierda");
        Nodo nodoTemp = raiz;
        nodoTemp = rotacionSimpleDerecha(nodoTemp.getDer());
        raiz.setDer(nodoTemp);
        nodoTemp = rotacionSimpleIzquierda(raiz);
        return nodoTemp;
    }

    public Nodo rotacionCompuestaDerecha(Nodo raiz) {
          JOptionPane.showMessageDialog(null, "rotacion compuesta derecha");
        Nodo nodoTemp = raiz;
        nodoTemp = rotacionSimpleIzquierda(nodoTemp.getIzq());
        raiz.setIzq(nodoTemp);
        nodoTemp = rotacionSimpleDerecha(raiz);

        //completar aqui
        return nodoTemp;
    }

    public int extraerFactor_e(Nodo raiz) {
        if (raiz != null) {
            return raiz.getFactor_e();
        }
        return 0;
    }

}
