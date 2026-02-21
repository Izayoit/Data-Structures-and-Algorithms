package Control;

import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import Modelo.album;

public class lista_doble_album_circular {

    nodo_album inicio, fin;
    int contador ;
    int contador2=1;
    int contador3=1;
    private nodo_album seleccionado;

    public lista_doble_album_circular() {
        inicio = fin = null;
    }

    public nodo_album getInicio() {
        return inicio;
    }

    public void setInicio(nodo_album inicio) {
        this.inicio = inicio;
    }

    public nodo_album getFin() {
        return fin;
    }

    public void setFin(nodo_album fin) {
        this.fin = fin;
    }

    public String ContadorCodigo() {

        return "DRW" + (contador++);
    }

    public void seleccionarAlbum(int posicion) {
        if (inicio == null || posicion < 1) {
            seleccionado = null;
            return;
        }

        nodo_album actual = inicio;
        int contador = 1;

        do {
            if (contador == posicion) {
                seleccionado = actual;
                return;
            }
            actual = actual.getSiguiente();
            contador++;
        } while (actual != inicio);

        seleccionado = null;
    }

    // Método registro modificado para dos formas de inserción
    public void registroSeleccion(album dato) {
        nodo_album nuevo = new nodo_album(dato);

        if (inicio == null) {
            inicio = fin = nuevo;
            nuevo.setSiguiente(nuevo);
            nuevo.setAnterior(nuevo);
        } // Insertar después del seleccionado
        else if (seleccionado != null) {
            nuevo.setSiguiente(seleccionado.getSiguiente());
            nuevo.setAnterior(seleccionado);
            seleccionado.getSiguiente().setAnterior(nuevo);
            seleccionado.setSiguiente(nuevo);

            if (seleccionado == fin) {
                fin = nuevo;
            }
        } // Insertar al final (por defecto)
        else {
            fin.setSiguiente(nuevo);
            nuevo.setAnterior(fin);
            nuevo.setSiguiente(inicio);
            inicio.setAnterior(nuevo);
            fin = nuevo;
        }

        seleccionado = null; // Resetear después de insertar
    }
    
    public void Agregar(album Elemento){
      nodo_album nuevo = new nodo_album(Elemento);
      
     if(inicio==null){
     
     inicio=fin=nuevo;
     
     }else{
         //hablamos de nuevo
     fin.setSiguiente(nuevo); //nuevo = todo el nodo 
     nuevo.setAnterior(fin);
     
     fin=nuevo;
     
     
     }
     //unaves echo ahora nuevo es fin entonces==
     fin.setSiguiente(inicio);
     inicio.setAnterior(fin);
        
          
    }

  

    public void listar(JTable control) {
        String[] cabezera = {"codigo", "nombre", "lista canciones"};
        DefaultTableModel modtable = new DefaultTableModel(cabezera, 0);
        control.setModel(modtable);

        if (inicio != null) {
            nodo_album auxliar = inicio;
            do {
                modtable.addRow(auxliar.getElemento().Getregistro());
                auxliar = auxliar.getSiguiente();
            } while (auxliar != inicio);

        }

    }

    public int AumentoContador() {
        return contador2++;
    }

    public int DisminuirContador() {
      
        return contador3--;
    }

    public nodo_album buscar(String elemento) {
        if (inicio != null) {
            nodo_album auxiliar = inicio;
            do {
                if (auxiliar.getElemento().getNombre().equals(elemento)) {
                    return auxiliar;

                }
                auxiliar = auxiliar.getSiguiente();
            } while (auxiliar != inicio);

        }
        return null;
    }

    
 public void Eliminar(nodo_album Auxiliar){
         if(inicio==fin){
      
           inicio=fin=null;
      
      }else if(inicio==Auxiliar){ 
        inicio=inicio.getSiguiente();
        inicio.setAnterior(fin);
        fin.setSiguiente(inicio);
        
        
        }else if(fin==Auxiliar){
        fin = fin.getAnterior();//retrocedo un nodo 
        fin.setSiguiente(inicio);
        inicio.setSiguiente(fin);
       
        
        
        }else{
        nodo_album siguiente = Auxiliar.getSiguiente();//3
        nodo_album anterior = Auxiliar.getAnterior();//1
        
        
        anterior.setSiguiente(siguiente);
        siguiente.setAnterior(anterior);
        
        }    
       
        
    }
}
