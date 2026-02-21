package Control;

import Modelo.Cliente;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Arbol {

    private Nodo raiz;

    public Arbol() {
        raiz = null;
    }

    public Nodo getRaiz() {
        return raiz;
    }

    public void setRaiz(Nodo raiz) {
        this.raiz = raiz;
    }

    public Nodo insertar(Nodo raiz, Cliente elemento) {

        if (raiz == null) {
            Nodo nuevo = new Nodo(elemento);
          
            return nuevo;
        } else if (elemento.getCodigo() > raiz.getElemento().getCodigo()) {
            raiz.setIzq(insertar(raiz.getIzq(), elemento));

        } else if (elemento.getCodigo() < raiz.getElemento().getCodigo()) {

            raiz.setDer(insertar(raiz.getDer(), elemento));
        } else {
            JOptionPane.showMessageDialog(null, "codigo ya existe");
        }

        return raiz;

    }

    public void listar(JTable control) {
        String[] cabezera = {"codigo", "nombre", "prestamo"};

        DefaultTableModel modtable = new DefaultTableModel(cabezera, 0);
        control.setModel(modtable);

        InOrder(raiz, modtable);

    }

    public void InOrder(Nodo raiz, DefaultTableModel modtable) {
        if (raiz != null) {

            InOrder(raiz.getIzq(), modtable);
            modtable.addRow(raiz.getElemento().getRegistro());
            InOrder(raiz.getDer(), modtable);

        }

    }

    public Nodo BuscarMayorIzquierda(Nodo raiz) {

        if (raiz == null) {
            while (raiz.getDer() != null) {
                raiz = raiz.getDer();
            }
        }
        return raiz;

    }

    public Nodo EliminaraMayorIzquierda(Nodo raiz) {
        if (raiz == null) {
            return null;

        } else if (raiz.getDer() != null) {

            raiz.setDer(EliminaraMayorIzquierda(raiz.getDer()));
            return raiz;

        }
        return raiz.getIzq();

    }

    public Nodo Eliminar(Nodo raiz, int codigo) {
        if (raiz == null) {
            JOptionPane.showMessageDialog(null, "no existe");
            return null;

        } else if (codigo < raiz.getElemento().getCodigo()) {
            raiz.setIzq(Eliminar(raiz.getIzq(), codigo));
        } else if (codigo > raiz.getElemento().getCodigo()) {
            raiz.setDer(Eliminar(raiz.getDer(), codigo));
        } else if (raiz.getIzq() != null && raiz.getDer() != null) {
            raiz.setElemento(BuscarMayorIzquierda(raiz.getIzq()).getElemento());
            raiz.setIzq(EliminaraMayorIzquierda(raiz.getIzq()));
        }else{
        raiz= (raiz.getIzq()!=null)?
                raiz.getIzq(): raiz.getDer();
        
        }
        return raiz;
    }
    public Nodo Buscar(int codigo){ 
     
        Nodo aux = raiz;
        while (aux!=null) {            
            if(codigo==aux.getElemento().getCodigo()){
           return aux;
       }else if(codigo<aux.getElemento().getCodigo()){
      aux=aux.getIzq();
       }   else{
        aux=aux.getDer();
       }
        }
       
           
        return null;
    
    }
}
