package Control;


import Modelo.album;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Lista_Doble_album_circular {
    private Nodo_album inicio, fin;
    private int contador;
    private int contador2=1;
    private int contador3=1;
 private Nodo_album seleccionado;
    public Lista_Doble_album_circular() {
        inicio = fin = null;
    }

    public Nodo_album getInicio() {
        return inicio;
    }

    public void setInicio(Nodo_album Inicio) {
        this.inicio = Inicio;
    }

    public Nodo_album getFin() {
        return fin;
    }

    public void setFin(Nodo_album Fin) {
        this.fin = Fin;
    }
    
   public void seleccionarAlbum(int posicion) {
        if (inicio == null || posicion < 1) {
            seleccionado = null;
            return;
        }

        Nodo_album actual = inicio;
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
    public String ContadorCodigo() {

        return "DRW" + (contador++);
    }

    public void registroSeleccion(album dato) {
        Nodo_album nuevo = new Nodo_album(dato);

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
      Nodo_album nuevo = new Nodo_album(Elemento);
      
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
    
    public void Listar(JTable Control){
       String[]cabezera = {"codigo","nombre","lista"};
       DefaultTableModel modtable = new DefaultTableModel(cabezera, 0);
        Control.setModel(modtable);
        
     
        
        if (inicio!=null) {            
               Nodo_album auxiliar = inicio;
            do {                
                  modtable.addRow(auxiliar.getElemento().Getregistro());
                  auxiliar=auxiliar.getSiguiente();
                    
            } while (auxiliar!=inicio);
            
  
            
        }              
    }
    
    public Nodo_album Buscar(String nombre){
          
        
        
    if(inicio!=null){
         Nodo_album auxiliar = inicio;
        do {   
            if(auxiliar.getElemento().getNombre().equals(nombre)){
            return auxiliar;
            
            } 
            auxiliar=auxiliar.getSiguiente();
        } while (auxiliar!=inicio);
    }
        return null;
    }
        
    
    
    // Inicio --> [34]  / Fin --> [15]
    // Lista  <-- [15 | 34 | 28]-->  <-- [ 34 | 28 | 15 ] --> <-- [ 28 | 15 | 34] -->
    
    public void Eliminar_Inicio(){
      
        
    }
    
    public void Eliminar(Nodo_album Auxiliar){
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
        Nodo_album siguiente = Auxiliar.getSiguiente();//3
        Nodo_album anterior = Auxiliar.getAnterior();//1
        
        
        anterior.setSiguiente(siguiente);
        siguiente.setAnterior(anterior);
        
        }    
       
        
    }
    
    
    
    
    public void Ordenar_PorSeleccion(){

    }    
    
    
     public int AumentoContador() {
        return contador2++;
    }

    public int DisminuirContador() {
      
        return contador3--;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
