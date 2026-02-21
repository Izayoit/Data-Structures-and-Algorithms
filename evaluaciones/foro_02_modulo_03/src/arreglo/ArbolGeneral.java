
package arreglo;

import java.util.Arrays;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import modelo.Alumno;


public class ArbolGeneral {
    private NodoArbolGeneral raiz;

    public ArbolGeneral() {
        raiz=null;
    }

    public NodoArbolGeneral getRaiz() {
        return raiz;
    }

    public void setRaiz(NodoArbolGeneral raiz) {
        this.raiz = raiz;
    }

   public void insertar(Alumno alumno) {
        if(buscarNodo(raiz, alumno.getCodigo())!=null){
        JOptionPane.showMessageDialog(null, "es lo mismo");
        return;
        }
    NodoArbolGeneral nuevo = new NodoArbolGeneral(alumno);

    if (raiz == null) {
        raiz = nuevo;
    } else {
        insertarPorCodigoNivel1(raiz, nuevo);
    }
}

private void insertarPorCodigoNivel1(NodoArbolGeneral raiz, NodoArbolGeneral nuevo) {
    int codigoNuevo = nuevo.getAlumno().getCodigo();
    boolean insertado = false;

    // Recorremos hijos del nivel 1 hijos de la raíz
    for (NodoArbolGeneral hijo : raiz.getHijos()) {
        int codigoHijo = hijo.getAlumno().getCodigo();

        if (codigoNuevo < codigoHijo) {
            // Si es menor que un hijo del nivel 1 lo insertamos como hijo de ese nodo nivel 2
            hijo.agregarHijo(nuevo);
            insertado = true;
            break;
        }
    }

    if (!insertado) {
        // Si no fue menor que ninguno  lo insertamos directamente como hijo de la raíz nivel 1
        raiz.agregarHijo(nuevo);
    }
}



    public NodoArbolGeneral buscarNodo(NodoArbolGeneral nodo, int codigo) {
    if (nodo == null) return null;

    if (nodo.getAlumno().getCodigo() == codigo) return nodo;

    for (NodoArbolGeneral hijo : nodo.getHijos()) {
        NodoArbolGeneral encontrado = buscarNodo(hijo, codigo);
        if (encontrado != null) return encontrado;
    }

    return null;
}
    
    

    public void listarPreOrden(JTable tabla) {
        DefaultTableModel modelo = new DefaultTableModel(new String[]{"Código", "Nombre","escuela","ciclo","nivel"}, 0 );
        listarPreOrdenRec(raiz, modelo,0);
        tabla.setModel(modelo);
    }
    
    
    
    
    
    
    
    

    private void listarPreOrdenRec(NodoArbolGeneral nodo, DefaultTableModel modelo,int nivel) {
        if (nodo != null) {
             Object[] datos = nodo.getAlumno().getDatos(); 
        Object[] fila = Arrays.copyOf(datos, datos.length + 1);
        fila[datos.length] = nivel;
        modelo.addRow(fila);
        System.out.println("Nivel " + nivel + ": " + nodo.getAlumno().getNombre());
            for (NodoArbolGeneral hijo : nodo.getHijos()) { //Recorre todos los hijos de este nodo, uno por uno.
                listarPreOrdenRec(hijo, modelo,nivel+1);
            }
            //Mientras haya hijos, sigue bajando por el árbol
            //Cuando ya no hay más hijos termina y vuelve hacia arriba.

        }
    }
}
