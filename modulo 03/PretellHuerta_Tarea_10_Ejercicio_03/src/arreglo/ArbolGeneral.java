package arreglo;

import javax.swing.DropMode;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import modelo.claves;

public class ArbolGeneral {

    private Nodo raiz;

    public ArbolGeneral() {
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

            return raiz.factoer_e();
        }
        return 0;

    }

    public Nodo insertar(Nodo raiz, claves elemento) {

        Nodo nuevo = new Nodo(elemento);
        if (raiz == null) {

            return nuevo;

        } else {

            if (elemento.getClave() < raiz.getElemento().getClave()) {
                raiz.setIzq(insertar(raiz.getIzq(), elemento));

            } else if (elemento.getClave() > raiz.getElemento().getClave()) {

                raiz.setDer(insertar(raiz.getDer(), elemento));

            } else {
                JOptionPane.showMessageDialog(null, "la clave fue usado");
            }

        }
        return reetructurar(raiz);

    }

    public void listar(JTable control) {

        DefaultTableModel modtable = new DefaultTableModel(new String[]{"clave", "altura", "factor"}, 0);
        control.setModel(modtable);
        Inorder(modtable, raiz);
    }

    public void Inorder(DefaultTableModel modtable, Nodo raiz) {

        if (raiz != null) {
            Inorder(modtable, raiz.getIzq());
            modtable.addRow(raiz.getRegistro());
            Inorder(modtable, raiz.getDer());

        }

    }

    public int equilibrar(Nodo raiz) {

        int Hizq = 0;
        int hder = 0;
        
  
     
        if (raiz == null) {
            return 0;
        }
       Hizq = equilibrar(raiz.getIzq());
        if (Hizq < 0) {
            return Hizq;

        }
        hder=equilibrar(raiz.getDer());
        if (hder < 0) {
            return hder;

        }

        if (Math.abs(Hizq - hder) < 1) {

            return -1;
        }

        return Math.max(Hizq, hder) + 1;

    }

    public Nodo RotacionSimpleDerecha(Nodo raiz) {
  JOptionPane.showMessageDialog(null, "rotacion derecha");
        Nodo NuevaRaiz = raiz.getIzq();

        raiz.setIzq(NuevaRaiz.getDer());

        NuevaRaiz.setDer(raiz);

        return NuevaRaiz;

    }

    public Nodo RotacionSimpleIzquierda(Nodo raiz) {
         JOptionPane.showMessageDialog(null, "rotacion izquierda");
        Nodo NuevaRaiz = raiz.getDer();

        raiz.setDer(NuevaRaiz.getIzq());

        NuevaRaiz.setIzq(raiz);

        return NuevaRaiz;

    }

    public Nodo RotacionCompuestaDerecha(Nodo raiz) {
        JOptionPane.showMessageDialog(null, "rotacion compuesta derecha");
        raiz.setIzq(RotacionSimpleIzquierda(raiz.getIzq()));

        return RotacionSimpleDerecha(raiz);

    }

    public Nodo RotacionCompuestaIzquierda(Nodo raiz) {
 JOptionPane.showMessageDialog(null, "rotacion compuesta izquierda");
        raiz.setDer(RotacionSimpleDerecha(raiz.getDer()));

        return RotacionSimpleIzquierda(raiz);
    }

    public Nodo reetructurar(Nodo raiz) {

        if (extraerfactor_e(raiz) == 2) {

            if (extraerfactor_e(raiz.getDer()) == 1) {

                raiz = RotacionSimpleIzquierda(raiz);

            } else if (extraerfactor_e(raiz.getDer()) == -1) {

                raiz = RotacionCompuestaIzquierda(raiz);

            }

        } else if (extraerfactor_e(raiz) == -2) {

            if (extraerfactor_e(raiz.getIzq()) == -1) {

                raiz = RotacionSimpleDerecha(raiz);

            } else if (extraerfactor_e(raiz.getIzq()) == 1) {

                raiz = RotacionCompuestaDerecha(raiz);

            }

        }

        return raiz;

    }

  
   
    
 public Nodo eliminar(Nodo raiz, int clave) {
    if (raiz == null) return null;

    int valor = raiz.getElemento().getClave();

    if (clave < valor) {
        raiz.setIzq(eliminar(raiz.getIzq(), clave));
    } else if (clave > valor) {
        raiz.setDer(eliminar(raiz.getDer(), clave));
    } else {
        // nodo encontrado
        if (raiz.getIzq() == null) return raiz.getDer();
        if (raiz.getDer() == null) return raiz.getIzq();

        // tiene dos hijos buscar sucesor 
        Nodo sucesor = encontrarMinimo(raiz.getDer());
        raiz.setElemento(new claves(sucesor.getElemento().getClave()));
        raiz.setDer(eliminar(raiz.getDer(), sucesor.getElemento().getClave()));
    }

    // reequilibrar después de eliminar
    return reetructurar(raiz);
}


private Nodo encontrarMinimo(Nodo nodo) {
    while (nodo.getIzq() != null) {
        nodo = nodo.getIzq();
    }
    return nodo;
}

    
    
    
    
    
    
    
    
    
    
    
    

}
