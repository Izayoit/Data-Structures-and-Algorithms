
package arreglo;

import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import modelo.alumno;


public class lista_arbol {
    
    private nodo raiz;

    public lista_arbol() {
        raiz=null;
    }

    
    public nodo getRaiz() {
        return raiz;
    }

    public void setRaiz(nodo raiz) {
        this.raiz = raiz;
    }
    
    public nodo registrar(nodo raiz, alumno elemento){
    
        if(raiz==null){
        nodo nuevo = new nodo(elemento);
        return nuevo;
        }else if(elemento.getCodigo()<raiz.getElemento().getCodigo()){
        
          raiz.setIzquierda( registrar(raiz.getIzquierda(), elemento));
        }else if(elemento.getCodigo()>raiz.getElemento().getCodigo()){
        
        raiz.setDerecha(registrar(raiz.getDerecha(), elemento));
        }else{
            
            JOptionPane.showMessageDialog(null, "son iguales");
    
    }
    
   return raiz;
    
}
  public void listar (JTable control){
      String[] cabazera ={"alumno","codigo","nota"};
      DefaultTableModel modtable = new DefaultTableModel(cabazera, 0);
      control.setModel(modtable);
      InOrden(raiz, modtable);
  }


  public void InOrden(nodo raiz,DefaultTableModel modtable){
   if(raiz!=null){
  
     InOrden(raiz.getIzquierda(),modtable);
     modtable.addRow(raiz.getElemento().getRegistro());
     InOrden(raiz.getDerecha(), modtable);
     
   }
     
  
  }
  public double MayorNota(nodo raiz){
      if (raiz==null) {
          return Double.NEGATIVE_INFINITY;
      }
  
     double mayorIzq= MayorNota(raiz.getIzquierda());
     double actualMayor = raiz.getElemento().getNota();
     double mayorDer= MayorNota(raiz.getDerecha());
              
  return Math.max(actualMayor,Math.max(mayorIzq, mayorDer));
  
  
  }
  public nodo buscarAlumnoMayorNota(nodo raiz1) {
    if (raiz1 == null) {
        return null;
    }

    nodo mayorIzq = buscarAlumnoMayorNota(raiz1.getIzquierda());
    nodo mayorDer = buscarAlumnoMayorNota(raiz1.getDerecha());

    nodo mayor = raiz1;

    if (mayorIzq != null && mayorIzq.getElemento().getNota() > mayor.getElemento().getNota()) {
        mayor = mayorIzq;
    }

    if (mayorDer != null && mayorDer.getElemento().getNota() > mayor.getElemento().getNota()) {
        mayor = mayorDer;
    }

    return mayor;
}
 
  
}