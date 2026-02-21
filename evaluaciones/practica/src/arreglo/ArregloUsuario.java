package arreglo;

import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import modelo.Juego;
import modelo.Usuario;

public class ArregloUsuario {

    private Usuario[] Arreglo = new Usuario[10];
    private int i = 0;

    public Usuario[] getArreglo() {
        return Arreglo;
    }
   public int contador(){
  
   return i;
   }
    public int getI() {
        return i;
    }

    public void RegistrarGestor(String nombre, String correo, String contra, int fecha, String pais_codigo) {
        Object[] dato = {nombre, correo, contra, fecha, pais_codigo};
        Arreglo[i] = new Usuario(dato);
      i++;
    }

    public void ListaOrdenamientoSeleccion(JTable control) {

        String[] cabezera = {"nombre", "correo", "contra", "fecha nacimiento", "codigo"};
        DefaultTableModel modtable = new DefaultTableModel(cabezera, 0);
        control.setModel(modtable);

        for (int j = 0; j < i - 1; j++) {
            int posmin = j;

            for (int k = j + 1; k < i; k++) {

                if (Arreglo[k].getUsernname().compareTo(Arreglo[posmin].getUsernname()) < 0) {

                    posmin = k;

                }

            }

            Usuario temp = Arreglo[j];
            Arreglo[j] = Arreglo[posmin];
            Arreglo[posmin] = temp;

        }

        for (int pos = 0; pos < i; pos++) {
            modtable.addRow(Arreglo[pos].getRegistro());

        }

    }

    public void registrar(Usuario dato) {
        if (i < Arreglo.length) {
            Arreglo[i] = dato;
            i++;
        }

    }

    public void cambioCbo(JComboBox combo) {
        combo.removeAllItems();
        for (int x = 0; x < i; x++) {
            combo.addItem(Arreglo[x]);

        }

    }
    public void eliminar (int pos){
        for (int j = pos; j < i-1; j++) {
            Arreglo[j]= Arreglo[j+1];
        }
        i--;
    }
  public void editar(Usuario user, int pos){

          Arreglo[pos]=user;
          
      
  }
}
