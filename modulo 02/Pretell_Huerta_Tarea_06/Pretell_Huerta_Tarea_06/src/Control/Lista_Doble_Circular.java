package Control;

import Modelo.Producto;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Lista_Doble_Circular {

    private Nodo inicio;
    private Nodo fin;

    public Lista_Doble_Circular() {
        inicio = fin = null;
    }

    public Nodo getInicio() {
        return inicio;
    }

    public void setInicio(Nodo inicio) {
        this.inicio = inicio;
    }

    public Nodo getFin() {
        return fin;
    }

    public void setFin(Nodo fin) {
        this.fin = fin;
    }

    public void Agregar(Producto elemento) {
        Nodo nuevo = new Nodo(elemento);
        if (inicio == null) {
            inicio = fin = nuevo;
        } else {
            fin.setSiguiente(nuevo);
            nuevo.setAnterior(fin);
            fin = nuevo;
        }
        fin.setSiguiente(inicio);
        inicio.setAnterior(fin);
    }
    // Inicio --> [8]  / Fin --> [24]
    // Lista [ 8 | 5 ] -> [ 5 | 3 ] -> [ 3 | 89 ] -> [ 89 | 24 ] --> [ 24 | 8 ]

    // Nuevo --> [ 24 | null]
    public void Listar(JTable control) {
        String[] cabecera = {"Código", "Descripción", "Stock"};
        DefaultTableModel modTabla = new DefaultTableModel(cabecera, 0);
        control.setModel(modTabla);
        Nodo auxiliar = inicio;
        if (auxiliar != null) {
            do {
                modTabla.addRow(auxiliar.getElemento().getRegistro());
                auxiliar = auxiliar.getSiguiente();
            } while (auxiliar != inicio);
        }
    }

    public Nodo Buscar(int codigo) {
        Nodo auxiliar = inicio;
        if (auxiliar != null) {
            do
            {
                if (auxiliar.getElemento().getCodigo() == codigo) {
                    return auxiliar;
                }
                auxiliar = auxiliar.getSiguiente();
            }while(auxiliar != inicio);                
        }
        return null;
    }
    
    public void Eliminar(Nodo auxiliar){
        if(inicio == fin){
            inicio = fin = null;
        }else if(inicio == auxiliar){
            inicio = inicio.getSiguiente();
            inicio.setAnterior(fin);
            fin.setSiguiente(inicio);
        }else if(fin == auxiliar){
            fin = fin.getAnterior();
            inicio.setAnterior(fin);
            fin.setSiguiente(inicio);
        }else {
            Nodo anterior = auxiliar.getAnterior();
            Nodo siguiente = auxiliar.getSiguiente();
            anterior.setSiguiente(siguiente);
            siguiente.setAnterior(anterior);
        }
    }
    
}
