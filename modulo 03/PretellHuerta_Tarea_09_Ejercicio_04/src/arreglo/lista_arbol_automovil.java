package arreglo;

import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import modelo.automovil;

public class lista_arbol_automovil {

    Nodo_automovil raiz;

    public lista_arbol_automovil() {
        raiz = null;
    }

    public Nodo_automovil getRaiz() {
        return raiz;
    }

    public void setRaiz(Nodo_automovil raiz) {
        this.raiz = raiz;
    }

    public Nodo_automovil registrar(Nodo_automovil raiz, automovil elemento) {
        if (raiz == null) {

            Nodo_automovil nuevo = new Nodo_automovil(elemento);
            return nuevo;
        } else if (elemento.getCodigo() < raiz.getElemento().getCodigo()) {
            raiz.setIzquierda(registrar(raiz.getIzquierda(), elemento));
        } else if (elemento.getCodigo() > raiz.getElemento().getCodigo()) {
            raiz.setDerecha(registrar(raiz.getDerecha(), elemento));
        } else {
            JOptionPane.showMessageDialog(null, "el codigo fue usado");
        }
        return raiz;
    }
 
    
    public void listar(JTable control){
    String[] cabezera={"marca","valor","codigo"};
        DefaultTableModel modtable = new  DefaultTableModel(cabezera, 0);
        control.setModel(modtable);
        Inordern(modtable, raiz);
        
        
    }
    public void Inordern(DefaultTableModel modtable,Nodo_automovil raiz){
    if(raiz!=null){
    Inordern(modtable,raiz.getIzquierda());
    modtable.addRow(raiz.getElemento().getRegistro());
    Inordern(modtable, raiz.getDerecha());
    }
    }
    public void filtrar(JTable control,String filtrar){
    String[] cabezera={"marca","codigo","valor"};
        DefaultTableModel modtable = new  DefaultTableModel(cabezera, 0);
        control.setModel(modtable);
    
        filtrarRecursivo(modtable, raiz, filtrar);
       
        
        
    }
    
    public void filtrarRecursivo(DefaultTableModel modtable,Nodo_automovil raiz, String filtrar){
    
       if(raiz!=null){
           filtrarRecursivo(modtable, raiz.getIzquierda(), filtrar);
           
           if(raiz.getElemento().getCadena().toLowerCase().contains(filtrar)){
           modtable.addRow(raiz.getElemento().getRegistro());
           }
           filtrarRecursivo(modtable, raiz.getDerecha(), filtrar);
       
           
           
       }
       
    
    }
    
    
}
   