package arreglo;

import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import modelo.numeros;

public class Arbol_General {

    private Nodo raiz;

    public Arbol_General() {
        raiz = null;
    }

    public Nodo getRaiz() {
        return raiz;
    }

    public void setRaiz(Nodo raiz) {
        this.raiz = raiz;
    }

    public int extraerfactor_e(Nodo raiz) {
        if (raiz != null) {

            return raiz.getfactor_e();
        }
        return 0;

    }

    public Nodo insertar(Nodo raiz, numeros elemento) {

        if (raiz == null) {

            Nodo nuevo = new Nodo(elemento);

            return nuevo;

        } else {

            if (elemento.getNumero() < raiz.getElemento().getNumero()) {

                raiz.setIzq(insertar(raiz.getIzq(), elemento));

            } else if (elemento.getNumero() > raiz.getElemento().getNumero()) {
                raiz.setDere(insertar(raiz.getDere(), elemento));

            } else {
                JOptionPane.showMessageDialog(null, "es igual");
            }

            return raiz;

        }

    }

    public void listar(JTable control) {

        DefaultTableModel modtable = new DefaultTableModel(new String[]{"numero", "altura", "factor_e"}, 0);
        control.setModel(modtable);
        Inorder(modtable, raiz);
    }

    public void Inorder(DefaultTableModel modtable, Nodo raiz) {
        if (raiz != null) {

            Inorder(modtable, raiz.getIzq());
            modtable.addRow(raiz.getRegistro());
            Inorder(modtable, raiz.getDere());

        }

    }

    public int equilibrar(Nodo raiz) {

        int Hizq = 0;
        int Hdere = 0;

        if (raiz == null) {

            return 0;
        }

        Hdere = equilibrar(raiz.getDere());
        if (Hdere < 0) {

            return Hdere;
        }
        Hizq = equilibrar(raiz.getIzq());
        if (Hizq < 0) {
            return Hizq;
        }

        if (Math.abs(Hizq - Hdere) < 1) {
            // esto se hace porque para ver si esta desequilibrado si esta desequilibrado vamos a retornar -1 
            // y los if estan para que pare cuando vea el -1
            return -1;
        }

        return Math.max(Hdere, Hizq) + 1;
    }

    public Nodo reestructurar(Nodo raiz) {

        if (extraerfactor_e(raiz) == 2) {

            if (extraerfactor_e(raiz.getDere()) == 1) {

                raiz = rotacionSimpleIzquierda(raiz);

            } else if (extraerfactor_e(raiz.getDere()) == -1) {

                raiz = rotacionCompuestaIzquierda(raiz);

            }

        } else if (extraerfactor_e(raiz) == -2) {

            if (extraerfactor_e(raiz.getIzq()) == -1) {
                raiz = rotacionSimpleDerecha(raiz);

            } else if (extraerfactor_e(raiz.getIzq()) == 1) {

                raiz = rotacionCompuestaDerecha(raiz);
            }
        }
        return raiz;

    }

    public Nodo rotacionSimpleDerecha(Nodo raiz) {

        JOptionPane.showMessageDialog(null, "rotacion derecha");
        Nodo NuevaRaiz = raiz.getIzq();
        raiz.setIzq(NuevaRaiz.getDere());
        NuevaRaiz.setDere(raiz);

        return NuevaRaiz;

    }

    public Nodo rotacionSimpleIzquierda(Nodo raiz) {
        JOptionPane.showMessageDialog(null, "rotacion izquierda");
        Nodo NuevaRaiz = raiz.getDere();
        raiz.setDere(NuevaRaiz.getIzq());
        NuevaRaiz.setIzq(raiz);

        return NuevaRaiz;

    }

    public Nodo rotacionCompuestaDerecha(Nodo raiz) {
        JOptionPane.showMessageDialog(null, "rotacion compuesta derecha");
        raiz.setIzq(rotacionSimpleIzquierda(raiz.getIzq()));

        return rotacionSimpleDerecha(raiz);

    }

    public Nodo rotacionCompuestaIzquierda(Nodo raiz) {
        JOptionPane.showMessageDialog(null, "rotacion compuesta izquierda");
        raiz.setDere(rotacionSimpleDerecha(raiz.getDere()));

        return rotacionSimpleIzquierda(raiz);

    }

    public Nodo equi(Nodo raiz) {

        if (raiz != null) {

            if (equilibrar(raiz) < 0) { // fijarnos si esta desequilibrado si esta ejecutar lo de abajo

                raiz.setDere(equi(raiz.getDere())); // vamos a modificar la derecha con equi recursivamente
                raiz.setIzq(equi(raiz.getIzq())); // lo mismo
                raiz = reestructurar(raiz); //hacer el cambio

            }

        }

        return raiz;
    }

    public void totalizarMayor(JTextField txt) {

        double mayor = mayor(raiz);

        txt.setText(mayor + "");

    }

    public double mayor(Nodo raiz) {
        if (raiz != null) {

            double t1 = mayor(raiz.getIzq());
            double t2 = raiz.getElemento().getNumero();
            double t3 = mayor(raiz.getDere());

            return Math.max(t2, Math.max(t1, t3));

        }

        return 0;
    }

    public double menor(Nodo raiz) {
        if (raiz != null) {

            double t1 = menor(raiz.getIzq());
            double t2 = raiz.getElemento().getNumero();
            double t3 = menor(raiz.getDere());
            
            
            if (raiz.getIzq() == null) {
                t1 = Double.MAX_VALUE;
            }
            if (raiz.getDere() == null) {
                t3 = Double.MAX_VALUE;
            }
            return Math.min(t2, Math.min(t1, t3));

        }

        return 0;
    }

    public void TotalizarMenor(JTextField txt) {

        double menor = menor(raiz);

        txt.setText(menor + "");

    }
;

}
