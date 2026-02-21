package Control;

import Modelo.Cliente;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Arreglo_Cliente {
    private Cliente[] arreglo = new Cliente[8];
    private int i = 0;
    
    public void Registrar(Cliente dato){
        if(i < arreglo.length){
            arreglo[i] = dato;
            i++;
        }else{
            JOptionPane.showMessageDialog(null, "Lista Llena");
        }
    }
    
    public void Filtrar(JTable tbl_datos, String filtro){
        String[] cabecera = {"Edad", "Nombre", "Ciudad"};
        DefaultTableModel modTabla = new DefaultTableModel(cabecera, 0);
        tbl_datos.setModel(modTabla);
        for (int pos = 0; pos < i; pos++) {
            if(arreglo[pos].getCadena().toLowerCase().contains(filtro.toLowerCase())){
                modTabla.addRow(arreglo[pos].getRegistro());
            }
        }
    }
    
    public void Listar(JTable tbl_datos){
        String[] cabecera = {"Edad", "Nombre", "Ciudad"};
        DefaultTableModel modTabla = new DefaultTableModel(cabecera, 0);
        tbl_datos.setModel(modTabla);
        for (int pos = 0; pos < i; pos++) {
            modTabla.addRow(arreglo[pos].getRegistro());
        }
    }
    
}
