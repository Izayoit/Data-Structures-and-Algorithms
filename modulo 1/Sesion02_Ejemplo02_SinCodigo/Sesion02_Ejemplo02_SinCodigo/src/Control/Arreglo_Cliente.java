package Control;

import Modelo.Cliente;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Arreglo_Cliente {

    private Cliente[] arreglo = new Cliente[8];
    private int i = 0;

    public void Registrar(Cliente dato) {
        if (i < arreglo.length) {
            if(buscar_binario(dato.getNombre())==-1){
        
            arreglo[i] = dato;
            i++;}else{
            JOptionPane.showMessageDialog(null, "no encontrado");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Lista Llena");
        }
    }

    public void Listar(JTable tbl_datos) {
        String[] cabecera = {"Edad", "Nombre"};
        DefaultTableModel modTabla = new DefaultTableModel(cabecera, 0);
        tbl_datos.setModel(modTabla);
        for (int pos = 0; pos < i; pos++) {
            modTabla.addRow(arreglo[pos].getRegistro());
        }
    }
  public int buscar_binario(String dato){
 int inicio =0;
 int fin = i-1;
 int medio;
 while(inicio<=fin){
 medio = (inicio+ fin)/2;
if(arreglo[medio].getNombre().equals(dato)){

     return medio;

}else{
if(arreglo[medio].getNombre().compareTo(dato)>0){
inicio = medio +1 ;

}else{
fin=medio-1;
}
}
 }
 
  return -1;
  }
    public void burbuja02(int indice) {

        Cliente temp;
        boolean ordenado = false;
        for (int j = 0; j < i - 1 && ordenado == false; j++) {
            ordenado = true;
            for (int x = 0; x < i - 1; x++) {
                boolean rpta = false;

                switch (indice) {
                    case 0:
                        if (arreglo[x].getNombre().compareTo(arreglo[x + 1].getNombre()) > 0) {

                            rpta = true;
                        }

                        break;

                    case 1:
                        if (arreglo[x].getEdad() > arreglo[x + 1].getEdad()) {

                            rpta = true;
                        }

                        break;
                    default:
                        throw new AssertionError();
                }
                if (rpta == true) {
                    temp = arreglo[x];
                    arreglo[x] = arreglo[x + 1];
                    arreglo[x + 1] = temp;
                    
                   ordenado=false;
                }

            }
        }

    }

}
