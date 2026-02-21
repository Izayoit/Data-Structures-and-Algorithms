package Control;

import Modelo.Boleto;
import Modelo.Ciudad;
import javax.swing.table.DefaultTableModel;

public class Pila_Boleto {

    private Nodo<Boleto> cima;

    public Pila_Boleto() {
        cima = null;
    }

    public void Agregar(Boleto elemento) {
        Nodo<Boleto> nuevo = new Nodo<>(elemento);
        nuevo.setSiguiente(cima);
        cima = nuevo;
    }

    public Boleto Desapilar() {
        if (!Pila_Vacia()) {
            Boleto aux = cima.getElemento();
            cima = cima.getSiguiente();
            return aux;
        }
        return null;
    }

    public Boleto Cima_Pila() {
        if (!Pila_Vacia()) {
            return cima.getElemento();
        }
        return null;
    }

    public boolean Pila_Vacia() {
        return cima == null;
    }

    public void Listar(DefaultTableModel modtabla) {
        Nodo<Boleto> aux = cima;
        modtabla.setRowCount(0);
        while (aux != null) {
            modtabla.addRow(aux.getElemento().getRegistro());
            aux = aux.getSiguiente();
        }
    }

    public Nodo<Boleto> Buscar_Nodo_NumBoleto(int numero) {
        if (!Pila_Vacia()) {
            Nodo<Boleto> aux = cima;
            while (aux != null) {
                if (aux.getElemento().getNum_boleto() == numero) {
                    return aux;
                }
                aux = aux.getSiguiente();
            }
        }
        return null;
    }

    public void Eliminar(int numBoleto) {
        if (Pila_Vacia()) {
            return;
        }

        Pila_Boleto aux = new Pila_Boleto();
        boolean eliminado = false;

        while (!Pila_Vacia()) {
            Boleto b = Desapilar();
            if (b.getNum_boleto() == numBoleto && !eliminado) {
                eliminado = true;
            } else {
                aux.Agregar(b);
            }
        }

        while (!aux.Pila_Vacia()) {
            Agregar(aux.Desapilar());
        }
    }

    public void filtrar(DefaultTableModel modtabla, String filtro) {
        if (!Pila_Vacia()) {
            Nodo<Boleto> aux = cima;
            modtabla.setRowCount(0); 

            while (aux != null) {
                Boleto b = aux.getElemento();
                if (b.getCadenaFiltrar().toLowerCase().contains(filtro.toLowerCase())) {
                    modtabla.addRow(b.getRegistro());
                }
                aux = aux.getSiguiente();
            }
        }
    }

}
