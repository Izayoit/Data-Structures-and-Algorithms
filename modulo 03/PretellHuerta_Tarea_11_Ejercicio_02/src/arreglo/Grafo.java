
package arreglo;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import modelo.enlace;
import modelo.numero;


public class Grafo {
  private ArrayList <Nodo> lista = new ArrayList<>();

    public ArrayList<Nodo> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Nodo> lista) {
        this.lista = lista;
    }
  
  public void registrar_Nodo(numero elemento){
   Nodo nuevo = new Nodo(elemento);
    lista.add(nuevo); // Primero lo agregas

    int nuevoValor = elemento.getNumero();

    for (Nodo otro : lista) {
        if (otro == nuevo) continue; // No te conectes contigo mismo

        int otroValor = otro.getElemento().getNumero();

        if (nuevoValor > otroValor) {
            // nuevo → otro
            int peso = Math.abs(nuevoValor - otroValor);
            nuevo.agreger_arista(new enlace(peso, otro));
        } else if (nuevoValor < otroValor) {
            // otro → nuevo
            int peso = Math.abs(nuevoValor - otroValor);
            otro.agreger_arista(new enlace(peso, nuevo));
        }
    }
  }
 
  
    
   public void Eliminar_nodo(int numero){
   Nodo buscado = bucar_nodo(numero);
   
   lista.remove(buscado);
       Eliminar_enlaces(numero);
   
   }
   public Nodo bucar_nodo(int numero){
       for (int i = 0; i < lista.size(); i++) {
           if (lista.get(i).getElemento().getNumero()==numero) {
               return lista.get(i);
               
           }
           
       }
       
       return null;      
   } 
    
    public void Eliminar_enlaces(int numero){
        for (int i = 0; i < lista.size(); i++) {
            ArrayList<enlace> arista = lista.get(i).getArista();
            for (int j = 0; j < arista.size(); j++) {
                if (arista.get(i).getEnlace().getElemento().getNumero()==numero) {
                    arista.remove(j);
                }
            }
            
        }
    
    
    
    }
    
    
    
    
    
    
  public void Recorrido_Anchura(int numeroInicio, JTable tabla) {
    String[] columnas = {"Número", "Visitado", "Conexiones"};
    DefaultTableModel modelo = new DefaultTableModel(columnas, 0);
    tabla.setModel(modelo);

    for (Nodo nodo : lista) {
        nodo.setVisitado(false);
    }

    Nodo inicio = bucar_nodo(numeroInicio);
    if (inicio == null) return;

    Deque<Nodo> cola = new ArrayDeque<>();
    inicio.setVisitado(true);
    cola.addLast(inicio);

    while (!cola.isEmpty()) {
        Nodo nodo = cola.removeFirst();
        int numero = nodo.getElemento().getNumero();
        String conexiones = "";

        for (enlace arista : nodo.getArista()) {
            Nodo vecino = arista.getEnlace();
            if (!vecino.isVisitado()) {
                vecino.setVisitado(true);
                cola.addLast(vecino);
            }
            conexiones += " [ " + vecino.getElemento().getNumero() + " ( " + arista.getPeso() + " ) ]";
        }

        modelo.addRow(new Object[]{numero, "Sí", conexiones});
    }
}


    
}
