package arreglo;

import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import modelo.numero;

public class lista_numero {

    Nodo_numero cima;

    public lista_numero() {
        cima = null;
    }

    public Nodo_numero getCima() {
        return cima;
    }

    public void setCima(Nodo_numero cima) {
        this.cima = cima;
    }

    public void Apilar(numero dato) {

        Nodo_numero nuevo = new Nodo_numero(dato);

        if (dato.getNumero() % 2 == 0) {
            nuevo.setSiguiente(cima);
            cima = nuevo;
        } else {
            JOptionPane.showMessageDialog(null, "no es par");
        }
    }

    public void RecorrerPila(JTable control) {

        String[] cabezera = {"numero entero"};
        DefaultTableModel modtable = new DefaultTableModel(cabezera, 0);
        control.setModel(modtable);
        Nodo_numero auxiliar = cima;
        while (auxiliar != null) {
            modtable.addRow(auxiliar.getElemento().getRegistro());
            auxiliar = auxiliar.getSiguiente();
        }

    }

    public int dato1(numero dato1) {

        int dibisible = dato1.getNumero() % 2;

        return dibisible;
    }

    public numero desapilar(JTextField txt) {

        if (!Vacio()) {
            if (!txt.getText().isEmpty()) {

                JOptionPane.showMessageDialog(null, "tienes una pila ya guardada");

            } else {
                numero temp = cima.getElemento();

                cima = cima.getSiguiente();
                return temp;
            }
        }
        return null;
    }

    public void decapitar() {

        if (!Vacio()) {

            cima = cima.getSiguiente();

        }

    }

    public numero cima() {
        if (!Vacio()) {

            return cima.getElemento();

        }
        return null;
    }

    public void eliminar() {

        cima = null;
    }

    public boolean Vacio() {

        return cima == null;
    }

}
