
package arreglo;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import modelo.usuario;


public class Nodo_usuario {
    
   private usuario elemento;
   private Nodo_usuario siguiente,anterior;

    public Nodo_usuario(usuario elemento) {
        this.elemento = elemento;
        siguiente= null;
    }

    public Nodo_usuario getAnterior() {
        return anterior;
    }

    public void setAnterior(Nodo_usuario anterior) {
        this.anterior = anterior;
    }

    public usuario getElemento() {
        return elemento;
    }

    public void setElemento(usuario elemento) {
        this.elemento = elemento;
    }

    public Nodo_usuario getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo_usuario siguiente) {
        this.siguiente = siguiente;
    }
    
    
    
    
   
    
    
}
