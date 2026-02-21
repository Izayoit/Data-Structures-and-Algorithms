package Control;

import Modelo.Ciudad;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JComboBox;

public class Arreglo_Ciudad {
    private Ciudad[] arreglo = new Ciudad[10];
    private int i = 0;
    
    public void Registrar(Ciudad dato){
        if(i < arreglo.length){
            arreglo[i] = dato;
            i++;
        }
    }
    
    public Ciudad getElemento(int pos){
        return arreglo[pos];
    }
    
    public int Buscar(String nombre){
        for (int pos = 0; pos < i; pos++) {
            if(arreglo[pos].getNombre().equals(nombre)){
                return pos;
            }
        }
        return -1;
    }
    
    public void Listar(JComboBox cbo_Ciudad){
        DefaultComboBoxModel modCombo = new DefaultComboBoxModel();
        cbo_Ciudad.setModel(modCombo);
        for (int pos = 0; pos < i; pos++) {
            modCombo.addElement(arreglo[pos].getNombre());
        }
    }
}
