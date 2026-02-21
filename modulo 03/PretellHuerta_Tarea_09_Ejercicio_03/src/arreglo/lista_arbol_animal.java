package arreglo;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.animal;

public class lista_arbol_animal {

    nodo_animal raiz;

    public lista_arbol_animal() {
        raiz = null;
    }

    public nodo_animal getRaiz() {
        return raiz;
    }

    public void setRaiz(nodo_animal raiz) {
        this.raiz = raiz;
    }

    public nodo_animal registro(animal elemento, nodo_animal raiz) {

        if (raiz == null) {
            nodo_animal nuevo = new nodo_animal(elemento);
            return nuevo;
        }
        if (elemento.getCodigo() < raiz.getElemento().getCodigo()) {
            raiz.setIzquierda(registro(elemento, raiz.getIzquierda()));
        } else if (elemento.getCodigo() > raiz.getElemento().getCodigo()) {
            raiz.setDerecha(registro(elemento, raiz.getDerecha()));
        } else {
            JOptionPane.showMessageDialog(null, "el codigo fue usado");
        }
        return raiz;

    }

    public void listar(DefaultTableModel modtable) {

        modtable.setRowCount(0);
        Inorder(modtable, raiz);

    }

    public void Inorder(DefaultTableModel modtable, nodo_animal raiz) {
        if (raiz != null) {
            Inorder(modtable, raiz.getIzquierda());
            modtable.addRow(raiz.getElemento().getRegistro());
            Inorder(modtable, raiz.getDerecha());

        }

    }

    public animal extraerMayor() {
        if (raiz == null) {
            return null;
        }

        nodo_animal padre = null;
        nodo_animal actual = raiz;

        // ir hasta el nodo más a la derecha
        while (actual.getDerecha() != null) { // verificas si ala derecha es null o hay dato si no hay se cierra el bucle
            padre = actual;//padre= actual=raiz=10
            actual = actual.getDerecha(); //actual=20
        }

        animal extraido = actual.getElemento(); //

        if (padre == null) {
            // el mayor era la raíz
            raiz = actual.getIzquierda(); // puede ser null o subárbol izquierdo
        } else {
            padre.setDerecha(actual.getIzquierda());
        }

        return extraido; //verificar lo que queires eliminar.
    }

    public int contarNodos() {
        
        return contarNodosRecursivo(raiz);
    }

    private int contarNodosRecursivo(nodo_animal nodo) {
        if (nodo == null) {
            return 0;
        }
        return 1 + contarNodosRecursivo(nodo.getIzquierda()) + contarNodosRecursivo(nodo.getDerecha());
    }

}
