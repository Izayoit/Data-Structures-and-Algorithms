package arreglo;

import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import modelo.producto;

public class Arbol_Binario {

    Nodo raiz;

    public Arbol_Binario() {
        raiz = null;
    }

    public Nodo getRaiz() {
        return raiz;
    }

    public void setRaiz(Nodo raiz) {
        this.raiz = raiz;
    }

    public Nodo insertar(producto elemento, Nodo raiz) {

        if (raiz == null) { // vamos a verificar si el objlistar del jframe es null si es se añade nuevo nodo y se retorna
            Nodo nuevo = new Nodo(elemento);
            return nuevo;
        } else {
            if (elemento.getCodigo() < raiz.getElemento().getCodigo()) {
                raiz.setIzq(insertar(elemento, raiz.getIzq()));
            } else if (elemento.getCodigo() > raiz.getElemento().getCodigo()) {
                raiz.setDere(insertar(elemento, raiz.getDere()));
            }
        }
        return raiz;

    }

    public void listar(JTable control) {

        DefaultTableModel modtable = new DefaultTableModel(new String[]{"codigo", "nombre", "descripcion", "altura", "factor"}, 0);

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

        int Hder = 0;
        int Hizq = 0;
        
        
        
        if (raiz == null) {
            return 0;
        }
        Hizq = equilibrar(raiz.getIzq());
        if (Hizq < 0) {
            return Hizq;

        }
        Hder = equilibrar(raiz.getDere());
        if (Hder < 0) {
            return Hder;
        }

        if (Math.abs(Hizq - Hder) > 1) {

            return -1;

        }

        return Math.max(Hizq, Hder) + 1;

    }

    public Nodo reestructura(Nodo raiz) {
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
         
        JOptionPane.showMessageDialog(null, "rotacion hacia la derecha");
        Nodo nuevaraiz = raiz.getIzq();

        raiz.setIzq(nuevaraiz.getDere());
        nuevaraiz.setDere(raiz);

        return nuevaraiz;
    }

    public Nodo rotacionSimpleIzquierda(Nodo raiz) {
         
        JOptionPane.showMessageDialog(null, "rotacion hacia la izquierda");
        Nodo nuevaraiz = raiz.getDere();
        raiz.setDere(nuevaraiz.getIzq());
        nuevaraiz.setIzq(raiz);

        return nuevaraiz;
    }

    public Nodo rotacionCompuestaIzquierda(Nodo raiz) {
        
        
        JOptionPane.showMessageDialog(null, "rotacion compuesta izquierda");
        //aqui hacemos una hacia la derecha para hacerlo en -_ asi luego hacemos una izquierda en el return
        raiz.setDere(rotacionSimpleDerecha(raiz.getDere()));

        return rotacionSimpleIzquierda(raiz);

    }

    public Nodo rotacionCompuestaDerecha(Nodo raiz) {
        
        JOptionPane.showMessageDialog(null, "rotacion compuesta derecha");
        //aqui va hacia la izq luego ala decha tonce una rotacion hacia la izquierda y luego derecha
        raiz.setIzq(rotacionSimpleIzquierda(raiz.getIzq()));

        return rotacionSimpleDerecha(raiz);

    }

    public int extraerfactor_e(Nodo raiz) {
        // va a ser un int porque vamos extaer su getfactor de la raiz 
        if (raiz != null) {

            return raiz.getFactor_e();

        }
        return 0;
    }

    public Nodo equi(Nodo raiz) {
        //sirve para actualizar 
        if (raiz != null) {

            if (equilibrar(raiz) < 0) {
                raiz.setDere(equi(raiz.getDere()));
                raiz.setIzq(equi(raiz.getIzq()));
                raiz = reestructura(raiz);

            }

        }
        return raiz;

    }

}
