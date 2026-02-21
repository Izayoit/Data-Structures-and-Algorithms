package arreglo;

import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import modelo.factura;

public class lista_Arbol {

    private nodo raiz;

    public lista_Arbol() {
        raiz = null;
    }

    public nodo getRaiz() {
        return raiz;
    }

    public void setRaiz(nodo raiz) {
        this.raiz = raiz;
    }

    public nodo registrar(factura elemento, nodo raiz) {
        if (raiz == null) {
            nodo nuevo = new nodo(elemento);

            return nuevo;
        } else if (elemento.getCodigo() < raiz.getElemento().getCodigo()) {

            raiz.setIzquierda(registrar(elemento, raiz.getIzquierda()));
        } else if (elemento.getCodigo() > raiz.getElemento().getCodigo()) {

            raiz.setDerecha(registrar(elemento, raiz.getDerecha()));
        } else {

            JOptionPane.showMessageDialog(null, "El codigo fue usado");

        }

        return raiz;
    }

    public void listar(JTable control) {
        Object[] cabezera = {"cliente", "codigo", "pago"};
        DefaultTableModel modtable = new DefaultTableModel(cabezera, 0);
        control.setModel(modtable);

        InOrder(raiz, modtable);

    }

    public void InOrder(nodo raiz, DefaultTableModel modtable) {
        if (raiz != null) {
            InOrder(raiz.getIzquierda(), modtable);
            modtable.addRow(raiz.getElemento().getRegistro());
            InOrder(raiz.getDerecha(), modtable);

        }

    }

    public double devolver(nodo raiz) {
      if(raiz==null){
      
      return 0;
      }
      
        return  devolver(raiz.getIzquierda())+
                raiz.getElemento().getPago()+
                devolver(raiz.getDerecha());
    }
    
   
}
